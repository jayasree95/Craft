package com.niit.first;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.config.DBConfig;
import com.niit.dao.ProductDAO;
import com.niit.daoImpl.ProductDAOImpl;
import com.niit.model.Product;

import junit.framework.TestCase;

public class ProductDAOImplTest extends TestCase 
{
	 ApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class,ProductDAOImpl.class);
	   ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
	public void testSaveProduct() {
		Product product =new Product();
		product.setPrice(100);
		product.setQuantity(1);
		product.setProductname("Water Bottle");
		product.setProductdesc("Blue color - l litre");
		product=productDAO.addProduct(product);
		assertTrue(product.getId()>0); 
		
	}

	public void testGetProduct() {
		   Product product1=productDAO.selectProducts(1);
		   Product product2=productDAO.selectProducts(34);
		   Product product3=productDAO.selectProducts(2);
		  
		   assertNotNull(product1);
		   assertNotNull(product2);
		   assertNull(product3);
		   
		   
		   double expectedPrice=2000.0;
		   double actualPrice=product1.getPrice();
		   assertTrue(expectedPrice==actualPrice);
	}

	public void testUpdateProduct() {
		
		Product product=productDAO.selectProducts(1);
		product.setPrice(2000);
		product.setQuantity(25);
		productDAO.updateProduct(product);
		assertTrue(product.getPrice()==2000);
		assertTrue(product.getQuantity()==25);

	}
	public void testDeleteProduct()
	{
	    productDAO.deleteProduct(44);
		assertNull(productDAO.selectProducts(44));
	}
	
	public void testGetAllProduct()
	{
		List<Product>product=productDAO.getAllProduct();
		assertFalse(product.isEmpty());
	}
	
	
	

}
