package pavanmotor.DAO;

import java.util.List;

import pavanmotor.Model.Supplier;



public interface SupplierDAO {
	
	public List<Supplier> list();
	public Supplier get(int id);
	
	public void saveOrUpdate(Supplier supplier);
	
	public void delete (int id);

}
