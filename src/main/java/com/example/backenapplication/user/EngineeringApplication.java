package com.example.backenapplication.user;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Entity
public class EngineeringApplication {
    @Id
    private Long id;
    private String projectCode;
    private String projectName;
    private String studentFirstName;
    private String studentLastName;
    private String email;

    // Constructor
    public EngineeringApplication(String projectCode, String projectName, String studentFirstName, String studentLastName, String email) {
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.email = email;
    }

}
