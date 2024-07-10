package com.example.backenapplication.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class InternApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Getters and Setters
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    // Constructor
    public InternApplication(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public InternApplication() {

    }
}
