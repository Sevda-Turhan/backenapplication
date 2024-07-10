package com.example.backenapplication.repository;
import com.example.backenapplication.user.InternApplication;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface InternApplicationRepository extends JpaRepository<InternApplication, Integer> {

}

