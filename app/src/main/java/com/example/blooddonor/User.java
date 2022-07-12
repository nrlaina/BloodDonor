package com.example.blooddonor;

public class User {

    public String fullName, email;
    public String idNumber, phoneNumber;

    public User(){

    }

    public User (String fullName, String idNumber, String phoneNumber, String email){
        this.fullName = fullName;
        this.email = email;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }
}
