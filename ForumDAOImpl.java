package com.niit.DAO;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Model.Forum;
import com.niit.Model.User;

@Repository

public class ForumDAOImpl implements ForumDAO {

	
	
	@Autowired
	private SessionFactory sessionFactory;   
	
	public ForumDAOImpl(){}
	
	public ForumDAOImpl(SessionFactory sf){
		this.sessionFactory=sf;
	}
	
	
	
	
	
	public void saveOrUpdate(Forum form) {
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println("Forum dao impl" +  form);
		s.saveOrUpdate(form);
		t.commit();	
	}

	public Forum get(int fid) {
		String hql = "from Forum where forumid=" + "'" + fid + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Forum> listUser = (List<Forum>) query.list();

		if (listUser != null && listUser.isEmpty()) {
			return listUser.get(0);
		}
		System.out.println("success");

		return null;
	}

	public void delete(int userid) {
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		delete(userid);
		t.commit();
	}

	public List<Forum> list() {
		@SuppressWarnings("unchecked")
		Session ses=sessionFactory.getCurrentSession();
		Transaction t=ses.beginTransaction();
		List<Forum> list = (List<Forum>) sessionFactory.getCurrentSession().createCriteria(Forum.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
				t.commit();
		return list;
	}

	
	
	
}
