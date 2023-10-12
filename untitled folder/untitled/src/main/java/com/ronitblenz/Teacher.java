package com.ronitblenz;

public class Teacher implements College {

    private String degree;

    public void edu() {

        System.out.println("I teach computer science in the college");
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
