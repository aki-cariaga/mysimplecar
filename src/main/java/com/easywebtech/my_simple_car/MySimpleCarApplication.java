package com.easywebtech.my_simple_car;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MySimpleCarApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new MySimpleCarApplication().configure(new SpringApplicationBuilder(MySimpleCarApplication.class)).run(args);
	}

}
