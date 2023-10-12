package com.ronitblenz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");


        //Doctor doctor = (Doctor) context.getBean("doctor");
        //doctor.assist();
        Doctor staff = context.getBean(Doctor.class);
        staff.assist();
        //System.out.println(staff.getQualification());


    }
}
