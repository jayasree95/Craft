package com.niit.first;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.config.DBConfig;
import com.niit.dao.UserDAO;
import com.niit.daoImpl.UserDAOImpl;

import com.niit.model.User;

import junit.framework.TestCase;

public class UserDAOImplTest extends TestCase 
{
	ApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class,UserDAOImpl.class);
	   UserDAO userDAO=(UserDAO)context.getBean("userDAO");
	public void testSaveUser() {
		User user =new User();
	/*	user.setUid(106);
		user.setName("sree");
		user.setEmail("jay@gmail.com");
		user.setPassword("123");
		user.setMobno("9789194405");
		user=userDAO.addUser(user);
		assertTrue(user.getUid()>0); */

}
	public void testUpdateUser()
	 {
	  User user=userDAO.selectUser(103);
	/*  user.setName("jayeee");*/
	  user.setPassword("4321");
	  user.setMobno("8654975321");
	  userDAO.updateUser(user);
	  System.out.println(user.getMobno());
	  assertTrue(user.getPassword()=="4321");
	  assertTrue(user.getMobno()=="8654975321");
	 }
	 public void testGetUser()
	 {
	  User user1=userDAO.selectUser(100);
	  User user2=userDAO.selectUser(103);
	  User user3=userDAO.selectUser(15);
	  assertNotNull(user1);
	  assertNotNull(user2);
	  assertNull(user3);
	  
	  String expectedmailId="jay@gmail.com";
	  String actualmailId=user2.getEmail();
	  assertTrue(expectedmailId.equals(actualmailId));
	 }
	 public void testDeleteUser()
	 {
	  userDAO.deleteUser(105);  
	  assertNull(userDAO.selectUser(105));	 
	 }
	public void testGetAllUsers()
	 {
	  List<User> userList=userDAO.getUser(); 
	  assertNotNull(userList.isEmpty());
	 }
	}

	
