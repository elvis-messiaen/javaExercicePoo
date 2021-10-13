package com.company;

public class Student extends Person{

    public Student() {
    }

    public Student(int age) {
        super(age);
    }

    public void goToClasses () {
        System.out.println("I'm going to class");
    }

    public void displayAge () {
        System.out.println("My age is " + getAge() + " years old" );
    }

    @Override
    public void speak(String message) {
        super.speak(message + " I’m going to class" +" I'm "+  getAge()+ " years old");
    }
}
