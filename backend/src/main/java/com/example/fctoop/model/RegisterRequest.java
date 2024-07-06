package com.example.fctoop.model;

public class RegisterRequest {
    private String email;
    private String name;
    private String contactNo;

    public RegisterRequest(String email, String name, String contactNo) {
        this.email = email;
        this.name = name;
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
