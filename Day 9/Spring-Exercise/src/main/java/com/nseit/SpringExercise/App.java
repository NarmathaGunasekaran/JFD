package com.nseit.SpringExercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(App.class);
        BinarySerachImpl binarySerach = applicationContext.getBean(BinarySerachImpl.class);
        int result = binarySerach.binarySearch(new int[]{2,4,5,7},9);
        System.out.println(result);
    }
}
