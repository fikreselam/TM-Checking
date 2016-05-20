package sizer.org.testRakish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sizer.org.testRakish.domain.Event;
import sizer.org.testRakish.service.AnnouncmentService;


@Controller
public class AnnouncmentController {
	
	@Autowired
	AnnouncmentService announcmentService;
	
	@RequestMapping("/announcment")
	public String annoucment(Model model){
		model.addAttribute("newAnnouncement", new Event());
		return "addAnnouncement";
	}
	
	@RequestMapping(value="/announcment", method = RequestMethod.POST)
	public String addannoucment(@ModelAttribute("newAnnouncement") Event announcment,Model model){
		//announcment.setLike(1);
		announcmentService.addAnnouncment(announcment);
		return "redirect:/welcome";
	}
	
	
	@RequestMapping(value="/like")
	public String like(@RequestParam long id,int like){
		announcmentService.like(id, like);
		return "redirect:/welcome";
	}
}
