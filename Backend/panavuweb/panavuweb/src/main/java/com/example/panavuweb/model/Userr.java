package com.example.panavuweb.model;

import jakarta.persistence.*;

@Entity

@Table(name = "Userr")
public class Userr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String username;
    private String user_password;
    private String user_email;
    
    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public Userr(Long user_id, String username, String user_password, String user_email) {
        this.username = username;
        this.user_password = user_password;
        this.user_email = user_email;
    }

    public Userr() {
    }


}
