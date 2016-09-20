package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Supplier;
@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SupplierDAOImpl() {
		System.out.println("SupplierDAOImpl --One");
	}
	
	public SupplierDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory= sessionFactory;
	
	
	}
	
@Transactional
	public List<Supplier> list() {
	Transaction t = sessionFactory.getCurrentSession().beginTransaction();
		@SuppressWarnings("unchecked")
		List<Supplier> listSupplier = (List<Supplier>)
		sessionFactory.getCurrentSession()
		.createCriteria(Supplier.class)
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		t.commit();

			return listSupplier;
	}

	public Supplier get(int id) {
		String hql = "from Supplier where id=" + "'"+ id +"'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Supplier> listSupplier = (List<Supplier>) ((SupplierDAO) query).list();
		
		if  (listSupplier != null && !listSupplier.isEmpty()){
			return listSupplier.get(0);
			
		}
		return null;
	}
@Transactional
	public void saveOrUpdate(Supplier supplier) {
		Transaction t = sessionFactory.getCurrentSession().beginTransaction();

		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		t.commit();
		
	}
@Transactional
	public void delete(int id) {
		Supplier supplier =new Supplier();
		
		sessionFactory.getCurrentSession().delete(supplier);
		
	}






@Transactional
public Supplier getByName(String spname) {

   String hql = "from Supplier where spname=" + "'"+ spname +"'";

	Query query = (Query) sessionFactory.openSession().createQuery(hql);
	List<Supplier> listSupplier = (List<Supplier>)  query.list();
	
	if  (listSupplier != null && !listSupplier.isEmpty()){
		return listSupplier.get(0);
		
	}
		return null;
}



	
	
}


	
