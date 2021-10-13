package com.company;

public class Person {
    //attribut
    private int age;

    public Person(){

    }
    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
