package sizer.org.testRakish.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sizer.org.testRakish.Repo.InstructorRepo;
import sizer.org.testRakish.domain.Checking;
import sizer.org.testRakish.domain.Instructor;
import sizer.org.testRakish.domain.Person;

@Service
@Transactional
public class InstructorService {

	@Autowired
	InstructorRepo instructorRepo;
	
	public void addInstructor(Instructor instructor){
		instructorRepo.add(instructor);
	}
	
	public boolean checkAdmin(long id,String pass){
		if(instructorRepo.checkAdmin(id, pass))
			return true;
		
		return false;
	}
	
	public Person getPersonForInstructor(long id){
		return instructorRepo.getPersonForInstructor(id);
	}
	
	public Instructor getInstructorWithUserId(String InsId){
		return instructorRepo.getInstructorWithUserId(InsId);
	}
	
	public List<Checking> InstructorChecking(long id){
		return instructorRepo.InstructorChecking(id);
	}
	
	public void updateInstructor(Instructor instructor){
		instructorRepo.updateInstructor(instructor);
	}
	
	public List<Instructor> getInstructors(){
		return instructorRepo.getAllInstructors();
	}
	
	public Instructor getInstructor(long id){
		return instructorRepo.getInstructor(id);
	}
	
	public Checking getSingleChecking(long id){
		return instructorRepo.getSingleChecking(id);
	}
	public void StatusUpdate(long id,int noOfChecking){
		instructorRepo.StatusUpdate(id, noOfChecking);
	}
	public void StatusUpdate(long id,int noOfChecking,String status){
		instructorRepo.StatusUpdate(id, noOfChecking,status);
	}
}
