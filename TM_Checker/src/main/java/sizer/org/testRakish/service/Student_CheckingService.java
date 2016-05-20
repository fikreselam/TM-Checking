package sizer.org.testRakish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sizer.org.testRakish.Repo.StudentRepo;
import sizer.org.testRakish.Repo.Student_CheckingRepo;
import sizer.org.testRakish.domain.Checking;
import sizer.org.testRakish.domain.Person;

@Service
@Transactional
public class Student_CheckingService {

	@Autowired
	Student_CheckingRepo student_CheckingRepo;
	
	@Autowired
	StudentRepo studentRepo;
	
	public Student_CheckingService(){
		
	}
	
	
	public boolean checkUser(long id,String pass){
		if(studentRepo.checkStudent(id, pass))
			return true;
		
		return false;
	}
	
	public Person getPersonForInstructor(long id){
		return studentRepo.getPersonForStudent(id);
	}

	public void addStudent_checking(Checking checking){
		student_CheckingRepo.add(checking);
	}
	
	public void updateChecking(Checking checking){
		student_CheckingRepo.updateChecking(checking);
	}
	
	public List<Checking> allCheckings(){
		return student_CheckingRepo.allCheckings();
	}
	
	public Checking getChecking(long id){
		System.out.println("------------------"+id);
		return student_CheckingRepo.getChecking(id);
	}
}
