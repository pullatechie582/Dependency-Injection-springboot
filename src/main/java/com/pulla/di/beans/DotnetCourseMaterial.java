package com.pulla.di.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dotnet")
//@Primary
public final class DotnetCourseMaterial implements CourseMaterial {

	public DotnetCourseMaterial() {
		System.out.println("dotnet course");
	}

	@Override
	public String courseContent() {		
		return "c#..collections";	
	}

	@Override
	public double price() {
		System.out.println("Dotnet course");
		return 300;
	}

}
