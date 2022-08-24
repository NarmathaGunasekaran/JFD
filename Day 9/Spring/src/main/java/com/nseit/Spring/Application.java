package com.nseit.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new
				AnnotationConfigApplicationContext(Application.class);
		BinarySerachImpl binarySerach	 = applicationContext.getBean(BinarySerachImpl.class);
		int result = binarySerach.binarySearch(new int[]{2,4,5,7},9);
		System.out.println(result);
	}

}
