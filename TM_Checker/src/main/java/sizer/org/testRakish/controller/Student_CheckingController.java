package sizer.org.testRakish.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import sizer.org.testRakish.domain.Checking;
import sizer.org.testRakish.domain.Instructor;
import sizer.org.testRakish.domain.Person;
import sizer.org.testRakish.domain.Student;
import sizer.org.testRakish.helper.LoginForm;
import sizer.org.testRakish.helper.RegistrationForm;
import sizer.org.testRakish.helper.SignupForm;
import sizer.org.testRakish.service.AnnouncmentService;
import sizer.org.testRakish.service.InstructorService;
import sizer.org.testRakish.service.Student_CheckingService;

@Controller
@SessionAttributes("user")
public class Student_CheckingController {

	private long Stud_id;
	private static long Admin_id;
	private long nextAvailableInsructor = 1;
	private static String role = "NONE";
	private String dateAndTimeCheck = "available";
	private Person person;
	private Instructor instructor;
	private Checking checking;

	@Autowired
	Student_CheckingService student_CheckingService;
	@Autowired
	InstructorService instructorService;
	@Autowired
	AnnouncmentService announcmentService;

	private String notifcation = "No Notfication Available";

	private Checking stuChecking = null;
	private String error;
	private String exists;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		LoginForm loginForm = new LoginForm();
		model.addAttribute("newLoginForm", loginForm);
		model.addAttribute("error", error);
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String isLogin(@ModelAttribute("newLoginForm") LoginForm loginForm, Model model,
			HttpServletResponse response, @RequestParam(value = "remember", required = false) Object checkboxValue) {

		if (student_CheckingService.checkUser(loginForm.getId(), loginForm.getPassword())) {
			Stud_id = loginForm.getId();
			person = student_CheckingService.getPersonForInstructor(Stud_id);
			role = person.getRole();
			System.out.println("User role is " + role);
			if (checkboxValue != null) {
				Cookie one = new Cookie("user", String.valueOf((loginForm.getId())));
				one.setMaxAge(3000);
				response.addCookie(one);
			}

			// model.addAttribute("student", loginForm.getId());
			error = null;
			return "redirect:/welcome";

		} else if (instructorService.checkAdmin(loginForm.getId(), loginForm.getPassword())) {
			Instructor instructor = instructorService.getInstructorWithUserId(String.valueOf(loginForm.getId()));
			Admin_id = instructor.getId();
			person = instructorService.getPersonForInstructor(Admin_id);
			role = person.getRole();
			System.out.println("User role is " + role);
			error = null;
			return "redirect:welcome";
		}

		else {
			model.addAttribute("error", "errorFound");
			return "login";
		}

	}

	@RequestMapping(value = "/welcome")
	public String welcome(Model model) {

		model.addAttribute("annoucments", announcmentService.getAllAnnouncments());
		model.addAttribute("role", role);
		// Student Role Actions
		if (role.equals("STUDENT")) {

			stuChecking = student_CheckingService.getChecking(Stud_id);
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date date = new Date();
			Date date1 = null;

			try {
				date1 = dateFormat.parse(dateFormat.format(date));
			} catch (ParseException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Today's date is " + dateFormat.format(date));
			if (stuChecking.getDate() != null)
				if (stuChecking.getDate().compareTo(date1) == 0) {
					System.out.println("You Got TM Checking Today");
					notifcation = "You Got TM Checking Today";
				}

		}

		return "welcome";
	}

	@RequestMapping(value = "/notify")
	public String notification(Model model) {
		model.addAttribute("message", notifcation);
		return "notfication";
	}

	@RequestMapping(value = "/getReport")
	public String report(Model model) {
		model.addAttribute("report", stuChecking);
		return "report";
	}

	@RequestMapping(value = "/logout")
	public String logout(SessionStatus status) {
		status.setComplete();
		return "front";
	}

	@RequestMapping(value = "/register")
	public String RegiForm(Model model) {
		RegistrationForm registrationForm = new RegistrationForm();
		model.addAttribute("newStudent", registrationForm);
		model.addAttribute("exists", exists);
		return "register";

	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String Register(@ModelAttribute("newStudent") RegistrationForm registrationForm, Model model) {

		if (registrationForm.getRole().equals("INSTRUCTOR")) {

			if (!instructorService.checkAdmin(registrationForm.getId(), registrationForm.getPass())) {
				Instructor instructor = new Instructor(String.valueOf(registrationForm.getId()),
						registrationForm.getPass(), registrationForm.getEmail(), new Person(
								registrationForm.getFristName(), registrationForm.getLastName(),
								registrationForm.getRole()));
				exists=null;
				instructorService.addInstructor(instructor);
			}
			else{
				exists="exist";
				model.addAttribute("exists", exists);
				return "register";
			}

		} else {
			
			if(!student_CheckingService.checkUser(registrationForm.getId(), registrationForm.getPass())){
				
				Instructor assignedInstructor = getNextAvailableInstructor();
				System.out.println("Assigned Instructor Id is " + assignedInstructor.getId());
				Person person = new Person(registrationForm.getFristName(), registrationForm.getLastName(),
						registrationForm.getRole());
				Student student = new Student(registrationForm.getId(), registrationForm.getPass(),
						registrationForm.getEmail(), person);
				Checking checking = new Checking(student, assignedInstructor);
				checking.setStatus("Not Completed");

				student_CheckingService.updateChecking(checking);
				System.out.println("loged in student id is " + student.getId());
				Stud_id = student.getId();
				model.addAttribute("student", student);
				exists=null;
			}
			else{
				exists="exist";
				model.addAttribute("exists", exists);
				return "register";
			}

			
		}

		role = registrationForm.getRole();
		return "redirect:/welcome";

	}

	@RequestMapping(value = "/signup")
	public String signup(Model model) {
		checking = student_CheckingService.getChecking(Stud_id);
		model.addAttribute("newForm", new SignupForm());
		model.addAttribute("dateAndTimeCheck", dateAndTimeCheck);
		model.addAttribute("instructor", checking.getInstructor().getPerson().getFristName());
		return "signup";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(@ModelAttribute("newForm") SignupForm form, Model model) {
		System.out.println("loged in student id is --- " + Stud_id);
		checking = student_CheckingService.getChecking(Stud_id);
		instructor = checking.getInstructor();

		if (checking != null) {

			List<Checking> checkings = student_CheckingService.allCheckings();

			for (Checking c : checkings) {
				if (c.getDate() != null)
					if (c.getDate().compareTo(form.getDate()) == 0 && c.getTime().equals(form.getTime())) {
						
						if(instructor.getId()==c.getInstructor().getId()){
							dateAndTimeCheck = "NA";
							model.addAttribute("dateAndTimeCheck", dateAndTimeCheck);
							return "signup";
						}
						
					}

			}

			dateAndTimeCheck = "available";
			checking.setDate(form.getDate());
			checking.setTime(form.getTime());

			student_CheckingService.updateChecking(checking);
		}

		return "redirect:/welcome";

	}

	private Instructor getNextAvailableInstructor() {
		int size = instructorService.getInstructors().size();
		System.out.println("size is " + size);
		if (nextAvailableInsructor < size - 1) {
			System.out.println("Available");
			nextAvailableInsructor++;
		} else
			nextAvailableInsructor = 1;
		return instructorService.getInstructor(nextAvailableInsructor);
	}

	public static long getAdmin_id() {
		return Admin_id;
	}

	public void setAdmin_id(long admin_id) {
		Admin_id = admin_id;
	}

	public static String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getExists() {
		return exists;
	}

	public void setExists(String exists) {
		this.exists = exists;
	}
	

}
