package com.i2i.khelo.restservice;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.i2i.khelo.model.User;

@Path("/UserAdmin")
public class UserAdminService {
	
	@GET
	@Path("/getUser")
	@Produces(MediaType.TEXT_HTML)
	public String getUser(@Context HttpServletRequest request) {
		
		SessionFactory sessionFactory = (SessionFactory) request.getServletContext().getAttribute("KheloDBSessionFactory");
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		User user = (User) session.get(User.class, 1);
		 System.out.println("user object is"+user);
			System.out.println("user name is"+user.getUserName());
			tx.commit();
		
		return user.getUserName();
	}

}
