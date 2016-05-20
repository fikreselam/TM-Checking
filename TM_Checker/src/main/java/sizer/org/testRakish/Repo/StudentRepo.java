package sizer.org.testRakish.Repo;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sizer.org.testRakish.domain.Instructor;
import sizer.org.testRakish.domain.Person;
import sizer.org.testRakish.domain.Student;

@Repository
@Transactional
public class StudentRepo {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public boolean checkStudent(Long id, String password) {
		Query q = sessionFactory.getCurrentSession().createQuery("from Student where id = :id and pass = :password");
		q.setParameter("id", id);
		q.setParameter("password", password);
		System.out.println(q.uniqueResult() != null);
		return (q.uniqueResult() != null);
	}
	
	
		
	public Person getPersonForStudent(long id){
		Student student =(Student) sessionFactory.getCurrentSession().get(Student.class, id);
		long personId=student.getPerson().getId();
		
		return (Person) sessionFactory.getCurrentSession().get(Person.class, personId);
	}
	
	
}
