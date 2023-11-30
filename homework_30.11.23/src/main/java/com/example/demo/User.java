package com.example.demo;

public class User {
    private String name;
    private int number;
    private String email;

    public User(int number, String name, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public int getAge() {
        return number;
    }

    public void setAge(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}