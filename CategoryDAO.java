package pavanmotor.DAO;

import java.util.List;

import pavanmotor.Model.Category;

public interface CategoryDAO {
	
	public List<Category> list();
	public Category get(int id);
	
	public void saveOrUpdate(Category category);
	
	public void delete (int id);

}
