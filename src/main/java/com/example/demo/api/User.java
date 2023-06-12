package com.example.demo.api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
@Entity
@Table(name = "REGISTRATION_USERS")
public class User {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private String mobile;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

