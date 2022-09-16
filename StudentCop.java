package com.yahoo;

public class StudentCop {

    public String name;
    private int rollno;

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }



    public StudentCop(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public void displayName()
    {
        System.out.println(name);
    }

    public void displayRollNo()
    {
        System.out.println(rollno);
    }
}
