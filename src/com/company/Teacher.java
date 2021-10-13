package com.company;

public class Teacher extends Person{
    private String subject;

    public Teacher(int age) {
        super(age);
    }

    public void explain () {
        System.out.println("Explanation begins");
    }

    @Override
    public void speak(String message) {
        super.speak(message + " I'm your teacher " + " I'm "+  getAge()+ " years old");
    }

}
