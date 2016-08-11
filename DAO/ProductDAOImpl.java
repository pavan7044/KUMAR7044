package pavanmotor.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pavanmotor.Model.Product;

@Repository("ProductDAO")
public class ProductDAOImpl {
	
	@Autowired
	private SessionFactory sessionFactory;
	public ProductDAOImpl(){}
	public ProductDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory= sessionFactory;
		
	}

	@Transactional
	public void saveOrUpdate(Product product){
		System.out.println("in product DAOImpl");
	Transaction t=sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().saveOrUpdate(product);
		t.commit();
	}
	
	@Transactional
	public void delete(int id){
		Product product= new Product();
		product.setId(id);
		sessionFactory.getCurrentSession().delete(product);
		
	}
	
	@Transactional
	public Product get(int id){
		String hql="from Product where Id=" + "'"+ id +"'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> listProduct = ( List<Product> )((ProductDAO) query).list();
	return null;
		
	
//	if(listProduct != null && listProduct.isEmpty()){
//		return listProduct.get(0);
//		
//	}
//	return null;

}
	public List<Product> list(){
		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>)
		sessionFactory.getCurrentSession()
		
		.createCriteria(Product.class)
		
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listProduct;
		
	}
	

}
