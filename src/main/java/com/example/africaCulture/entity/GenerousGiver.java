package com.example.africaCulture.entity;

import jakarta.persistence.*;

@Entity
public class GenerousGiver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    private String emailAddress;
    private String phoneNumber;
    private String passWord;

    public GenerousGiver() {
    }

    public GenerousGiver(Long id, String emailAddress, String phoneNumber, String passWord) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.passWord = passWord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "GenerousGiver{" +
                "id=" + id +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
