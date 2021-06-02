package com.pulla.di.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
	
	@Autowired
	@Qualifier("dotnet")
	private CourseMaterial material; //HAS-A property
	
	public void preparation(String examName) {
		System.out.println("preparation started for " +examName);
		String courseContent=material.courseContent();
		double price=material.price();
		System.out.println("preparation is going on using"+courseContent+"material with price::"+price);
		System.out.println("preparation is completed for"+ examName);
		
	}

}
