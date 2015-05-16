package com.i2i.khelo.restservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {

  // This method is called if TEXT_PLAIN is request
	 @RequestMapping("/hello")
  public String sayPlainTextHello() {
	  
	  return "Hello Jersey";
  }

  // This method is called if XML is request
  /*@GET
  @Produces(MediaType.TEXT_XML)*/
  public String sayXMLHello() {
    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
  }

  /*// This method is called if HTML is request
  @GET
  @Produces(MediaType.TEXT_HTML)*/
  public String sayHtmlHello() {
    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
  }

}

