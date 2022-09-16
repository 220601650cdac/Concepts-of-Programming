package com.yahoo;

public class ExecuteMain {

    public static void main(String[] args) {
        StudentCop myFirstStudent = new StudentCop("Pratik",1);

        myFirstStudent.displayName();
        myFirstStudent.displayRollNo();
        myFirstStudent.setRollno(9999); // setter
        myFirstStudent.displayRollNo();

    }
}
