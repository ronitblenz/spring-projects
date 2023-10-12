package com.ronitblenz;

public class Student implements College {

    private String degree;
    public void edu() {

        System.out.println("I study in a college");

    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
