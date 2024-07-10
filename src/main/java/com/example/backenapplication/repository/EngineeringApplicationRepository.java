package com.example.backenapplication.repository;
import com.example.backenapplication.user.EngineeringApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineeringApplicationRepository extends JpaRepository<EngineeringApplication,Long> {

}
