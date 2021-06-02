package com.pulla.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pulla.di.beans.Student;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(DependencyInjectionApplication.class, args);
		Student st=ctx.getBean("stud",Student.class);
		st.preparation("CTS-Interview");
		((ConfigurableApplicationContext)ctx).close();
	}

}
