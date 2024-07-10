package com.example.backenapplication.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class TraineeApplication {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
        private String email;

        // Constructor
        public TraineeApplication(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

}
