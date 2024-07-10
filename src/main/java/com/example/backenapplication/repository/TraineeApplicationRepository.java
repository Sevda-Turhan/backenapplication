package com.example.backenapplication.repository;
import com.example.backenapplication.user.TraineeApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TraineeApplicationRepository extends JpaRepository<TraineeApplication, Long> {

}
