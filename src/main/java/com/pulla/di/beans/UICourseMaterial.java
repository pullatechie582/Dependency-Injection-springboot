package com.pulla.di.beans;

import org.springframework.stereotype.Component;

@Component("UI")
public final class UICourseMaterial implements CourseMaterial {

	public UICourseMaterial() {
		System.out.println("dotnet course");
	}

	@Override
	public String courseContent() {		
		return "1.html,2.CSS..";	
	}

	@Override
	public double price() {
		System.out.println("UI course");
		return 200;
	}

}
