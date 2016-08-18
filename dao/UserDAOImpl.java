package com.niit.dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.User;
import com.niit.model.UserRole;
@Repository
public class UserDAOImpl implements UserDAO  {

	@Autowired
	private SessionFactory sessionFactory;
	//private Session session;
	
	
	
	
	public List<User> list() {
		
		
		@SuppressWarnings("unchecked")
		List<User> list1 =  sessionFactory.getCurrentSession().createCriteria(User.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list1;
	}

	public User get(int uid) {
		String hql = "from User where uid=" + "'"+ uid +"'";
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) query.list();
		
		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		return null;
	}

	public void saveOrUpdate(User user) {
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		user.setEnabled(true);
		session.save(user);
		UserRole userRole=new UserRole();
		userRole.setId(user.getUid());
		userRole.setAuthority("ROLE_USER");
		session.save(userRole);
		System.out.println("Done saving user");
		tx.commit();
		}
		
		
		
	

	public void delete(int uid) {
		User user =new User();
		user.setUid(uid);

		sessionFactory.getCurrentSession().delete(user);
		
		
		
	
		
	}

	public User getUserByName(String uname) {

		System.out.println("getting data in dao based on name");
		Session session=this.sessionFactory.getCurrentSession();
		User user=(User) session.get(User.class,uname);
		System.out.println("data of user by name="+user);
		return user;	


	
	}

	public boolean isvaliduser(String user, String pass) {
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();
		String hql = "from User where uid= '" + user + "' and upassword = '" + pass + "'";
		//String hql = "from User where uid= '" + user + "' and " + " upassword ='" + pass+"'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		List list = q.list();
		System.out.println("userDAOIMPL");
		t.commit();
		
		
		
		if(list == null || list.isEmpty())
		{
			return false;
		}
		
		else
		{
			return true;
		}
		
	
	
		
	}
	
	
	


}
