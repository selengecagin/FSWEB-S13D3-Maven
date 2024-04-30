package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String location;
    private long id;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String email, String location, long id) {
        this(firstName, lastName, age);
        this.email = email;
        this.location = location;
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(int age){
        if(age>13 && age<19){
            return true;
        }else {
            return false;
        }


    }};
