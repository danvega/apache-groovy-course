package com.therealdanvega;

import java.io.Serializable;

public class EmployeeBean implements Serializable {

    // private properties
    private String first;
    private String last;
    private String email;

    // public no-arg constructor
    public EmployeeBean(){

    }

    // getters & setters

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "last='" + last + '\'' +
                ", first='" + first + '\'' +
                '}';
    }
}
