package com.k003.lesson8;


import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name;
    private int age;

    @Autowired(required =false)
    private Address address;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void print(){
        System.out.println("Person: "+this.name+" Age: "+this.age+" Address: "+
                (this.address == null ?"null" : this.address.toString()));
    }
}
