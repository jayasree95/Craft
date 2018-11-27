package com.niit.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;


@Repository("supplierDAO")
@Transactional

public class SupplierDAOImpl implements SupplierDAO 
{
@Autowired
SessionFactory sessionFactory;
private Object supplier;

	public Supplier addSupplier(Supplier supplier)
	{
		sessionFactory.getCurrentSession().save(supplier);
		return supplier;
	}

	public List<Supplier> getAllSupplier() 
	{
		return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
		
	}

	public void updateSupplier(Supplier supplier) {
		sessionFactory.getCurrentSession().update(supplier);

	}

	public void deleteSupplier(int id) {
		Session session=sessionFactory.getCurrentSession();
	Supplier supplier=(Supplier)session.get(Supplier.class,id);
	session.delete(supplier);
	}

	public Supplier selectSupplier(int id) {
		Object obj=sessionFactory.getCurrentSession().get(Supplier.class,id);
		Supplier s=(Supplier)obj;
		return s;
		
		
	}

}
