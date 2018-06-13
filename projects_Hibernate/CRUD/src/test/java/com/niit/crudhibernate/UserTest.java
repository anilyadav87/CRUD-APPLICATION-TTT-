package com.niit.crudhibernate;

import static org.junit.Assert.*;

import org.junit.*;
import com.niit.crudhibernate.dao.*;
import com.niit.crudhibernate.daoimpl.*;
import com.niit.crudhibernate.model.*;
public class UserTest {


	UserDAO userDAO;
	User user;
	@Before
	public void setUp()
	{
		userDAO = new UserDAOImpl();
	}
	@After
	public void tearDown()
	{
		userDAO = null;
	}
	@Ignore
	@Test
	public void addUser() {
		user = new User();
		user.setFirstName("anil");
		user.setLastName("yadav");
		user.setAddress("andheri");
		user.seteMail("anil.y@gmail.com");
		user.setPassword("1233");
		assertEquals(true, userDAO.addUser(user));
	}
//	@Ignore
	@Test
	public void updateUser() {
		user=new User();		
		System.out.println("hi");
		user.setFirstName("anvesha");
		user.setLastName("yadav");
		user.setAddress("andheri");
		user.seteMail("anil.y@gmail.com");
		user.setPassword("1233");
		user.setUserId(1);
		assertEquals(true, userDAO.updateRecord(user));
	}
	@Ignore
	@Test
	public void deleteUser()
	{
		user = new User();
		user.setUserId(2);
		assertEquals(true, userDAO.deleteRecord(user));
	}
	@Ignore
	@Test
	public void getUser()
	{
		User user = userDAO.getUserById(1);
		if(user!=null)
		{
			assertTrue(true);
		}
		else
		{
			assertTrue(false);
		}
	}
}