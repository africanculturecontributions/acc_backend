package com.example.africaCulture.entity;

import jakarta.persistence.*;

@Entity
public class ProjectOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String fullName;
    private String phoneNumber;
    private String email;
    private String Organization;
    private int ssn;
    private String password;
    private String confirmPassword;

    public ProjectOwner(String confirmPassword, String email, String fullName, String organization, String password, String phoneNumber, int ssn) {
        this.confirmPassword = confirmPassword;
        this.email = email;
        this.fullName = fullName;
        Organization = organization;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
    }

    public ProjectOwner() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
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

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String organization) {
        Organization = organization;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }


    @Override
    public String toString() {
        return "ProjectOwner{" +
                "confirmPassword='" + confirmPassword + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", Organization='" + Organization + '\'' +
                ", ssn=" + ssn +
                ", password='" + password + '\'' +
                '}';
    }
}
