package sizer.org.testRakish.Repo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sizer.org.testRakish.domain.Checking;

@Repository
@Transactional
public class Student_CheckingRepo {

	@Autowired
	private SessionFactory sessionFactory;

	public Student_CheckingRepo() {

	}

	public void add(Checking checking) {
		sessionFactory.getCurrentSession().persist(checking);
	}

	public void updateChecking(Checking checking) {
		sessionFactory.getCurrentSession().saveOrUpdate(checking);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Checking> allCheckings(){
		return sessionFactory.getCurrentSession().createQuery("from Checking").list();
	}
	
	public Checking getChecking(long id){
		Query query=sessionFactory.getCurrentSession()
				.createQuery("select c from Checking c join c.student s where s.id = :id");
		
		query.setParameter("id", id);
		@SuppressWarnings("unchecked")
		List<Checking> checkings=query.list();
		if(checkings.isEmpty())
			return null;
		
		return checkings.get(0);
	}

}
