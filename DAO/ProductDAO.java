package pavanmotor.DAO;

import java.util.List;

import pavanmotor.Model.Product;



public interface ProductDAO {
	public List<Product> list();
	public Product get(int id);
	
	public void saveOrUpdate(Product product);
	
	public void delete (int id);

}
