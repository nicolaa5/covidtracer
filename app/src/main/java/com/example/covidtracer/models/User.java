package com.example.covidtracer.models;

public class User {
    public String familyName;
    public String surname;
    public String email;
    public String phone;
    public String status;

    public User() {

    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User(String familyName, String surname, String email, String phone, String status) {
        this.familyName = familyName;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.status = status;
    }
}
