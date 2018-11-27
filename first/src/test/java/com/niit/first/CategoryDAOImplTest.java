package com.niit.first;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.config.DBConfig;
import com.niit.dao.CategoryDAO;
import com.niit.daoImpl.CategoryDAOImpl;
import com.niit.model.Category;


import junit.framework.TestCase;

public class CategoryDAOImplTest extends TestCase
{
	 ApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class,CategoryDAOImpl.class);
	   CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	public void testSaveCategory() {
		Category category =new Category();
		category.setCategoryid(15);
		category.setCategoryname("LG");
		category.setCategorydesc("personal");
		category=categoryDAO.addCategory(category);
		assertTrue(category.getCategoryid()>0); 
		
}
	public void testGetCategory() {
		   Category category1=categoryDAO.selectCategory(10);
		   Category category2=categoryDAO.selectCategory(11);
		   Category category3=categoryDAO.selectCategory(2);
		  
		   assertNotNull(category1);
		   assertNotNull(category2);
		   assertNull(category3);
		   
		   
		   String expectedCategoryDesc="personal";
		   String actualCategoryDesc=category1.getCategorydesc();
		   assertTrue(expectedCategoryDesc==actualCategoryDesc);
	}
	
public void testUpdateCategory() 
    {
		Category category=categoryDAO.selectCategory(11);
		category.setCategoryid(11);
		category.setCategoryname("HPOO");
		categoryDAO.updateCategory(category);
		assertTrue(category.getCategoryid()==11);
		assertTrue(category.getCategoryname()=="HPOO");
    }

 public void testDeleteCategory()
    {
       categoryDAO.deleteCategory(14);  
       assertNull(categoryDAO.selectCategory(14));	 
    }
     
public void testGetAllCategory()
    {
    	
      List<Category> categoryList=categoryDAO.getAllCategory(); 
      assertNotNull(categoryList.isEmpty());
    }
}

