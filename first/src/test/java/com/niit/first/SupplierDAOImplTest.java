package com.niit.first;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.config.DBConfig;
import com.niit.dao.SupplierDAO;
import com.niit.daoImpl.SupplierDAOImpl;

import com.niit.model.Supplier;


import junit.framework.TestCase;

public class SupplierDAOImplTest extends TestCase
{
	ApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class,SupplierDAOImpl.class);
	   SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
	public void testSaveSupplier() {
		Supplier supplier =new Supplier();
		supplier.setSupplierid(110);
		supplier.setSuppliername("HCL");
		supplier.setSupplierdesc("MDR");
		
		supplier=supplierDAO.addSupplier(supplier);
		assertTrue(supplier.getSupplierid()>0); 
	}
	public void testUpdateSupplier()
	{
	  Supplier supplier=supplierDAO.selectSupplier(103);
	  supplier.setSupplierid(103);
	  supplier.setSuppliername("hpo");
	  supplier.setSupplierdesc("ngl");
	  supplierDAO.updateSupplier(supplier);

	  assertTrue(supplier.getSuppliername()=="hpo");
	  assertTrue(supplier.getSupplierdesc()=="ngl");
	 }
	 public void testGetSupplier()
	 {
	  Supplier supplier1=supplierDAO.selectSupplier(101);
	  Supplier supplier2=supplierDAO.selectSupplier(102);
	  Supplier supplier3=supplierDAO.selectSupplier(15);
	  assertNotNull(supplier1);
	  assertNotNull(supplier2);
	  assertNull(supplier3);
	  
	  String expectedSupplierdesc="chennai";
	  String actualsupplierdesc=supplier2.getSupplierdesc();
	  assertTrue(expectedSupplierdesc.equals(actualsupplierdesc));
	 }
	 public void testDeleteSupplier()
	 {
	  supplierDAO.deleteSupplier(109);  
	  assertNull(supplierDAO.selectSupplier(109));	 
	 }
	public void testGetAllSupplier()
	 {
	  List<Supplier> supplierList=supplierDAO.getAllSupplier(); 
	  assertNotNull(supplierList.isEmpty());
	 }
	
}
