package com.niit.first;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.config.DBConfig;
import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.dao.SupplierDAO;
import com.niit.dao.UserDAO;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;
import com.niit.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
   	 	UserDAO userDAO = (UserDAO) context.getBean("userDAO");
   	 	User user=new User();
   	 /*	user.setUid(103);
   	 	user.setName("sree");
   	 	user.setPwd("1234");
   	 	user.setMobno("2445565");
   	 	user.setEmailid("jay@gmail.com");
   	 	userDAO.addUser(user);
   	 	List<User> userList=userDAO.getUser();
   	    //userDAO.updateUser(user);
	 	//userDAO.deleteUser(user);
   	 	for(User userobj:userList)
   	 	{
   	 		System.out.println(userobj.getUid()+ " " + userobj.getName()+" "+userobj.getPwd()+" "+userobj.getMobno()+" "+userobj.getEmailid());
   	 		
   	 	}*/
   	 	
   	ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
	 /*	Product product=new Product();
	 	product.setId(1);
	 	product.setProductname("HP");
	 	product.setProductdesc("400GB");
	 	product.setQuantity(200);
	 	product.setPrice(2000);
	    //productDAO.addProduct(product);
	 	List<Product> productList=productDAO.getAllProduct();
	    //productDAO.updateProduct(product);
	 	//productDAO.deleteProduct(2);
	 	//productDAO.selectProducts(1);
	 	for(Product productobj:productList)
	 	{
	 		System.out.println(productobj.getId()+" "+productobj.getProductname()+" "+productobj.getProductdesc()+" "+productobj.getPrice()+" "+productobj.getQuantity());
	 	}*/
	 	CategoryDAO categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	 	/*Category category=new Category();
	 	category.setCategoryid(10);
	 	category.setCategoryname("LG");
	 	category.setCategorydesc("personal");
	    //categoryDAO.addCategory(category);
	 	List<Category> categoryList=categoryDAO.getAllCategory();
	    //categoryDAO.updateCategory(category);
	 	//categoryDAO.deleteCategory(2);
	 	//categoryDAO.selectCategory(1);
	 	for(Category categoryobj:categoryList)
	 	{
	 		System.out.println(categoryobj.getCategoryid()+" "+categoryobj.getCategoryname()+" "+categoryobj.getCategorydesc());
	 		
	 	}*/
	 	SupplierDAO supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
	 /*	Supplier supplier=new Supplier();
	 	supplier.setSupplierid(101);
	 	supplier.setSuppliername("hp");
	 	supplier.setSupplierdesc("chennai");
	 	
	 	//supplierDAO.addSupplier(supplier);
	    //supplierDAO.updateSupplier(supplier);
	 	//supplierDAO.deleteSupplier(2);
	 	//supplierDAO.selectSupplier(1);
	 	List<Supplier> supplierList=supplierDAO.getAllSupplier();
	 	for(Supplier supplierobj:supplierList)
	 	{
	 		System.out.println(supplierobj.getSupplierid()+" "+supplierobj.getSuppliername()+" "+supplierobj.getSupplierdesc());
	 		
	 	}*/
   	 	
    }
}