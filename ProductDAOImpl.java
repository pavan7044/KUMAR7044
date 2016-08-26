package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Product;

@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {
	
	
	@Autowired
	SessionFactory sessionfactory;
	
	public ProductDAOImpl() {
		System.out.println("ProductDAOImpl --One");
	}
	public ProductDAOImpl(SessionFactory sessionfactory){
		this.sessionfactory=sessionfactory;
	}
	
	
	
	@Transactional
	public void saveOrUpdate(Product product) {

		Session s=sessionfactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println("User dao impl" +  product);
		s.saveOrUpdate(product);
		t.commit();
		
	}
@Transactional
	public Product get(int ptid) {
	Session s = sessionfactory.getCurrentSession();
	
	Transaction tx = s.beginTransaction();
		String hql = "from Product where ptid=" + "+ ptid +";
		//  from supplier where id = '101'
		Query query =  sessionfactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Product> listproduct = (List<Product>) query.list();
		
		if (listproduct != null && !listproduct.isEmpty()) {
			System.out.println("id returns"+listproduct.get(0));
			return listproduct.get(0);
		}
		tx.commit();
			return null;
		}
	
	
@Transactional
	public Product getProductByName(String name) {
		System.out.println("getting data in dao based on name");
		Session session=this.sessionfactory.getCurrentSession();
		Product product=(Product) session.get(Product.class,name);
		System.out.println("data of user by name="+product);
		return product;	
		
	}
@Transactional
	public void delete(int ptid) {
		System.out.println("Id in deleteProduct(int ptid):"+ptid);
		
	    Session session=sessionfactory.getCurrentSession();
	    Transaction tx=session.beginTransaction();
	    Product product = (Product)session.load(Product.class, ptid);
	 //   Query query=session.createQuery("delete from Product  where ptid=:status");
	  //  query.setInteger("status",ptid);
	  //  int rowsDeleted=query.executeUpdate();
	    session.delete(product);
	  tx.commit();
	   // System.out.println("Rows deleted:"+rowsDeleted);
	    System.out.println("deleted");
		
	}
@Transactional
	public List<Product> list() {
		Session s = sessionfactory.getCurrentSession();
	
		Transaction tx = s.beginTransaction();
		List<Product> listProduct = s.createCriteria(Product.class).list();
		tx.commit();
			return listProduct;


}
}
