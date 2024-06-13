package com.example.trail1.kotlinexamples;

public class student {
    string name;
    int age;
    string address;

    public student(string name, int age, string address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public string getAddress() {
        return address;
    }

    public void setAddress(string address) {
        this.address = address;
    }
}
