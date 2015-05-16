package com.i2i.khelo.restservice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.i2i.khelo.model.SportsCategory;
import com.i2i.khelo.service.SessionHandler;

@RestController
public class SportsAdminService {

	@SuppressWarnings("unchecked")
	
	@RequestMapping("/getSupportedSportsCategories")
	//@Produces(MediaType.APPLICATION_JSON)
	public SportsCategory getSupportedSportsCategories() {
	//public String getSupportedSportsCategories() {

		Session session = SessionHandler.getSessionFactory()
				.getCurrentSession();

		Transaction tx = session.beginTransaction();
		List<SportsCategory> sports = session.createCriteria(
				SportsCategory.class).list();
		System.out.println("No of sports present " + sports.size());

		StringBuffer buffer = new StringBuffer();
		if (sports != null) {
			for (SportsCategory sportItem : sports) {
				buffer.append(sportItem.getSportName()+"\n");
				System.out.println("Sport iteam" + sportItem.getSportName());
			}
		}

		tx.commit();
		//return buffer.toString();

		return sports.get(0);

	}

}
