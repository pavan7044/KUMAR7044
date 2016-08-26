/*package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Category;


@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	
	
	
	public List<Category> list() {
		@SuppressWarnings({ "unchecked" })
		List<Category> listCategory=(List<Category>) sessionFactory.getCurrentSession()
				                     .createCriteria(Category.class)
				                     .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
		
	}

	public Category get(int id) {
		String hql="from where Category id=" +"'"+ id +"'";
		Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Category> listcategory=(List<Category>)  ((Criteria) query).list();
		
		if(listcategory !=null && !listcategory.isEmpty()){
			return listcategory.get(0);
		}
		return null;
		
	}

	public void saveOrUpdate(Category category) {
		Transaction t = sessionFactory.getCurrentSession().beginTransaction();

		sessionFactory.getCurrentSession().saveOrUpdate(category);
		t.commit();
		
	}

	public void delete(int id) {
Category category=new Category();
		
		sessionFactory.getCurrentSession().delete(category);
		
	}

	

	
	
}
*/