package sizer.org.testRakish.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sizer.org.testRakish.Repo.AnnouncmentRepo;
import sizer.org.testRakish.domain.Event;



@Service
@Transactional
public class AnnouncmentService {
	
	@Autowired
	AnnouncmentRepo announcmentRepo;
	
	
	public void addAnnouncment(Event announcment) {
		announcmentRepo.addAnnouncment(announcment);
	}

	
	public List<Event> getAllAnnouncments() {
		return announcmentRepo.getAllAnnouncments();
	}

	public void updateAnnouncment(Event announcment) {

		announcmentRepo.updateAnnouncment(announcment);

	}
	
	public void deleteAnnouncment(Event announcment){
		announcmentRepo.deleteAnnouncment(announcment);
	}
	
	public void like(long id,int like){
		announcmentRepo.like(id, like);
	}
	
}
