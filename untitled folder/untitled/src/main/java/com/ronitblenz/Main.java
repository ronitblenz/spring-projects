package com.ronitblenz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

//        College aot = new Teacher();
//
//        aot.edu();

        ApplicationContext context=
                new ClassPathXmlApplicationContext("spring.xml");

        Student college = context.getBean(Student.class);
        college.edu();

        System.out.println(college.getDegree());



    }
}