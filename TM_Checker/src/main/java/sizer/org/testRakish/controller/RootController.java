package sizer.org.testRakish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sizer.org.testRakish.domain.Instructor;
import sizer.org.testRakish.domain.Person;
import sizer.org.testRakish.service.InstructorService;


@Controller
public class RootController {
	
	@Autowired
	InstructorService instructorService;
	
	@RequestMapping("/")
	public String root(){
		initData();
		return "front";
	}

	private void initData() {
		
		
		System.out.println("Init method after properties are set " );
		Instructor one =new Instructor("111","admin","frank@yahoo.com",new Person("Mr Frank","James","INSTRUCTOR"));
		
		
		
		instructorService.addInstructor(one);
		
		one =new Instructor("222","admin","frank@yahoo.com",new Person("Mr Chris","James","INSTRUCTOR"));
		instructorService.addInstructor(one);
		
		one =new Instructor("333","admin","frank@yahoo.com",new Person("Mr David","James","INSTRUCTOR"));
		instructorService.addInstructor(one);
		
		one =new Instructor("444","admin","frank@yahoo.com",new Person("Mr Albert","James","INSTRUCTOR"));
		instructorService.addInstructor(one);
		
		one =new Instructor("555","admin","frank@yahoo.com",new Person("Mr Tedi","James","INSTRUCTOR"));
		instructorService.addInstructor(one);
	}

}
