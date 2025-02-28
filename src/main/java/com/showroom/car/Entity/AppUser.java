package com.showroom.car.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class AppUser {

    @Id
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    private String fullName;
    
    private String mobileNo;

    @Column(nullable = false)
    private String password;

    public AppUser() {}

    public AppUser(String email, String username, String fullName, String mobileNo, String password) {
        this.email = email;
        this.username = username;
        this.fullName = fullName;
        this.mobileNo = mobileNo;
        this.password = password;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getMobileNo() { return mobileNo; }
    public void setMobileNo(String mobileNo) { this.mobileNo = mobileNo; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
