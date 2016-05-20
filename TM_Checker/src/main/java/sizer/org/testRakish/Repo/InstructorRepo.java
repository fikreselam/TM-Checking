package sizer.org.testRakish.Repo;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sizer.org.testRakish.domain.Checking;
import sizer.org.testRakish.domain.Instructor;
import sizer.org.testRakish.domain.Person;

@Repository
@Transactional
public class InstructorRepo {

	@Autowired
	private SessionFactory sessionFactory;
	private Instructor instructor;
	
	
	public InstructorRepo() {

	}
	
	
	public boolean checkAdmin(Long id1, String password) {
		String id=String.valueOf(id1);
		Query q = sessionFactory.getCurrentSession().createQuery("from Instructor where insId = :id and password = :password");
		q.setParameter("id", id);
		q.setParameter("password", password);
		
		System.out.println(q.uniqueResult() != null);
		return (q.uniqueResult() != null);
	}
	
	

	public void add(Instructor instructor) {
		sessionFactory.getCurrentSession().persist(instructor);
	}
	
	public Instructor getInstructor(long id){
		return (Instructor)sessionFactory.getCurrentSession().get(Instructor.class, id);
	}

	public void updateInstructor(Instructor instructor) {
		sessionFactory.getCurrentSession().saveOrUpdate(instructor);
	}
	
	@SuppressWarnings("unchecked")
	public Instructor getInstructorWithUserId(String InsId){
		Query query = sessionFactory.getCurrentSession().createQuery("from Instructor where insId = :insid");
		query.setParameter("insid", InsId);
		List<Instructor> instructor = query.list();
		return instructor.get(0);
	}
	
	 
	public Person getPersonForInstructor(long id){
		Instructor instructor =(Instructor) sessionFactory.getCurrentSession().get(Instructor.class, id);
		long personId=instructor.getPerson().getId();
		
		return (Person) sessionFactory.getCurrentSession().get(Person.class, personId);
	}

	@SuppressWarnings({ "unchecked" })
	public List<Checking> InstructorChecking(long id) {
		System.out.println("Id is "+id);
		Query query= sessionFactory.getCurrentSession()
				.createQuery("select c from Checking c join c.instructor i where i.id = :id");
		query.setParameter("id", id);
		List<Checking> checkings=query.list();
		for(Checking c:checkings){
			System.out.println("checking id "+c.getId());
		}
		return checkings;
	}
	
	@SuppressWarnings("unchecked")
	public List<Instructor> getAllInstructors() {
		return sessionFactory.getCurrentSession().createQuery("from Instructor").list();
	}


	public Checking getSingleChecking(long id) {
		
		return  (Checking)sessionFactory.getCurrentSession().get(Checking.class, id);
	}
	
	public void StatusUpdate(long id,int noOfChecking,String status){
		 
		
		Query query = sessionFactory.getCurrentSession().createQuery("update Checking set noOf_checking = :noOfCheck" +
				" , status =:status where id = :id");
		query.setParameter("noOfCheck", noOfChecking);
		query.setParameter("id", id);
		query.setParameter("status", status);
		query.executeUpdate();
	
 
}
	
	public void StatusUpdate(long id,int noOfChecking){
		 
			
			Query query = sessionFactory.getCurrentSession().createQuery("update Checking set noOf_checking = :noOfCheck" +
					" where id = :id");
			query.setParameter("noOfCheck", noOfChecking);
			query.setParameter("id", id);
			query.executeUpdate();
		
	 
	}
}
