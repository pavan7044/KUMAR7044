package com.niit.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Model.Blog;

@Repository
public class BlogDAOImpl implements BlogDAO {
	@Autowired
	private SessionFactory sessionFactory;   
	
	public BlogDAOImpl(){}
	
	public BlogDAOImpl(SessionFactory sf){
		this.sessionFactory=sf;
	}
	
	public void saveOrUpdate(Blog b) {
		Session s=sessionFactory.getCurrentSession();
		Transaction t= s.beginTransaction();
		System.out.println("Blog dao impl" +  b);
		s.saveOrUpdate(b);
		t.commit();	
	}

	@Transactional
	public Blog get(int bid) {
		String hql = "from Blog where blogid=" + "'" + bid + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Blog> listUser = (List<Blog>) query.list();

		if (listUser != null && listUser.isEmpty()) {
			return listUser.get(0);
		}
		System.out.println("success");

		return null;
	}

	public List<Blog> list() {
		@SuppressWarnings("unchecked")
		Session ses=sessionFactory.getCurrentSession();
		Transaction t=ses.beginTransaction();
		List<Blog> list=(List<Blog>) sessionFactory.getCurrentSession().createCriteria(Blog.class)
		                    .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		t.commit();

		return list;
	}
@Transactional

	public void delete(int bid) {
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		delete(bid);
		t.commit();

		
	}

}
