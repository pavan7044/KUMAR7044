package pavanmotor.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import pavanmotor.Model.Category;


@Repository("CategoryDAO")
public class CategoryDAOImpl {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CategoryDAOImpl(){	}
	
	public CategoryDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory= sessionFactory;
		
	}

	@Transactional
	public void saveOrUpdate(Category category){
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		
	}
	
	@Transactional
	public void delete(int id){
		Category category= new Category();
		category.setId(id);
		sessionFactory.getCurrentSession().delete(category);
		
	}
	
	@Transactional
	public Category get(int id){
		String hql="from Category where id=" + "'"+ id +"'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Category> listCategory = ( List<Category> )((CategoryDAO) query).list();
		
	
	if(listCategory != null && listCategory.isEmpty()){
		return listCategory.get(0);
		
	}
	return null;

}
	@Transactional
	public List<Category> list(){
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>)
		sessionFactory.getCurrentSession()
		
		.createCriteria(Category.class)
		
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listCategory;
		
	}
}
