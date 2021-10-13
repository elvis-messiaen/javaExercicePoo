package com.company;

public class Main {

    public static void main(String[] args) {
        Person paul = new Person();
        paul.speak("paul dit Hello");
        Student student1 = new Student(19);
        student1.displayAge();
        student1.speak("student1 dit Hello");
        Teacher harry = new Teacher(40);
        harry.speak("hello");

    }
}
