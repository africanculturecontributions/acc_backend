package com.example.africaCulture.entity;

import jakarta.persistence.*;

@Entity
public class FreelanceAgent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String address;
    private int nin;

    public FreelanceAgent(String address, String email, String fullName, Long id, int nin, String phoneNumber) {
        this.address = address;
        this.email = email;
        this.fullName = fullName;
        this.id = id;
        this.nin = nin;
        this.phoneNumber = phoneNumber;
    }

    public FreelanceAgent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNin() {
        return nin;
    }

    public void setNin(int nin) {
        this.nin = nin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "FreelanceAgent{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", nin=" + nin +
                '}';
    }
}
