package sizer.org.testRakish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sizer.org.testRakish.domain.Checking;
import sizer.org.testRakish.service.InstructorService;

@Controller
public class InstructorController {

	
	
	@Autowired
	InstructorService instructorService;
	
	private Checking currentCheacking=null;
	
	
	@RequestMapping("/InsLogin")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/InsRegister")
	public String Register(){
		return "InsRegister";
	}
	
	@RequestMapping("/getMeditators")
	public String getAllMeditators(Model model){
		long id=Student_CheckingController.getAdmin_id();
		System.out.println("Instructor Id is "+id);
		model.addAttribute("meditators", instructorService.InstructorChecking(id));
		model.addAttribute("role", Student_CheckingController.getRole());
		return "checking";
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam Long medId,Model model){
		currentCheacking=instructorService.getSingleChecking(medId);
		model.addAttribute("checking", currentCheacking) ;
		
		return "updateStatus";
		
	}
	
	@RequestMapping("/addChecking")
	public String addChecking(){
		
		int checking = currentCheacking.getNoOf_checking()+1;
		if(checking<4)
		instructorService.StatusUpdate(currentCheacking.getId(), checking);
		else if(checking==4)
			instructorService.StatusUpdate(currentCheacking.getId(), checking,"Completed");
		return "redirect:/getMeditators";
		
	}
	
}
