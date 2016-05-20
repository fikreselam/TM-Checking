package sizer.org.testRakish.Repo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sizer.org.testRakish.domain.Event;
import sizer.org.testRakish.domain.Instructor;

@Repository
public class AnnouncmentRepo {

	@Autowired
	private SessionFactory sessionFactory;

	public void addAnnouncment(Event announcment) {
		sessionFactory.getCurrentSession().persist(announcment);
	}

	@SuppressWarnings("unchecked")
	public List<Event> getAllAnnouncments() {
		return sessionFactory.getCurrentSession().createQuery("from Event").list();
	}

	public void updateAnnouncment(Event announcment) {

		sessionFactory.getCurrentSession().saveOrUpdate(announcment);

	}
	
	public void deleteAnnouncment(Event announcment){
		sessionFactory.getCurrentSession().delete(announcment);
	}
	
	public void like(long id,int like){
		Query query = sessionFactory.getCurrentSession().createQuery("update Announcment set like = :like" +
				" where id = :id");
		query.setParameter("like", like);
		query.setParameter("id", id);
		query.executeUpdate();
	}
	
	
}
