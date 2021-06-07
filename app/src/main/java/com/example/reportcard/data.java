package com.example.reportcard;

public class data{
    private String name, sub, grade;

    public data(String name, String sub, String grade) {
        this.name = name;
        this.grade = grade;
        this.sub = sub;
    }

    public String getName(){
        return name;
    }

    public String getSub(){
        return sub;
    }

    public String getGrade(){
        return grade;
    }
}
