package pavanmotor.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pavanmotor.DAO.ProductDAO;
import pavanmotor.Model.Product;
import pavanmotor.Model.User;


@Service
public class Productservice {
	
	@Autowired
	ProductDAO productDAO;
	
	public void saveOrUpdate(Product product)
	{
		System.out.println("in product service");
		productDAO.saveOrUpdate(product);	
	}
	public List<Product> list()
	{
		List<Product> list=productDAO.list();
		return list;
	}
	public Product get(int id)
	{
		return productDAO.get(id);
	}
	
	public void delete(int id)
	{
		productDAO.delete(id);
	}
	


	
}




