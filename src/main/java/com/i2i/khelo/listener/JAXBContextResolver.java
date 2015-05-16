package com.i2i.khelo.listener;

import javax.ws.rs.ext.ContextResolver;
import javax.xml.bind.JAXBContext;

import org.jboss.logging.Logger;

import com.i2i.khelo.model.SportsCategory;
import com.i2i.khelo.model.User;

@SuppressWarnings("rawtypes")
public class JAXBContextResolver implements ContextResolver<JAXBContext> {
	public final Logger logger = Logger.getLogger(JAXBContextResolver.class);
	private JAXBContext context;

	private Class[] types = { User.class, SportsCategory.class };

	@Override
	public JAXBContext getContext(Class<?> objectType) {
		for (Class type : types) {
			if (type == objectType) {
				logger.info("JAXB context created for "+type.getName());
				return context;
			}
		}
		return null;
	}

}
