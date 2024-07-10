package com.example.backenapplication.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.backenapplication.user.TraineeApplication;
import com.example.backenapplication.Service.TraineeApplicationService;

import java.util.List;

@RestController
@RequestMapping("/trainee")
public class TraineeApplicationController {

    @Autowired
    public TraineeApplicationService traineeApplicationService;

    @PostMapping("/apply")
    public TraineeApplication createApplication(@RequestBody TraineeApplication application) {
        return traineeApplicationService.createApplication(application);
    }

    @GetMapping("/applications")
    public List<TraineeApplication> getApplication(){
        return traineeApplicationService.getApplications();
    }
}
