package com.example.backenapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.backenapplication.user.EngineeringApplication;
import com.example.backenapplication.Service.EngineeringApplicationService;

import java.util.List;

@RestController
@RequestMapping("/engineering-project")
public class EngineeringApplicationController {
    @Autowired
    private EngineeringApplicationService engineeringApplicationService;

    @PostMapping("/apply")
    public EngineeringApplication createApplication(@RequestBody EngineeringApplication application) {
        return engineeringApplicationService.createApplication(application);
    }

    @GetMapping("/applications")
    public List<EngineeringApplication> getApplications() {
        return engineeringApplicationService.getApplications();
    }

}

