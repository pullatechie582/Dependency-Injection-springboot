package com.pulla.di.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("java")
@Primary
public final class JavaCourseMaterial implements CourseMaterial {

	public JavaCourseMaterial() {
		System.out.println("Java course Program");
	}

	@Override
	public String courseContent() {		
		return "1.oops,2.Exceptions,3.Collections";	
	}

	@Override
	public double price() {
		System.out.println("Java course");
		return 400;
	}

}
