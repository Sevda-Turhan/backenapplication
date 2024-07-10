package com.example.backenapplication.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.backenapplication.user.InternApplication;
import com.example.backenapplication.Service.InternApplicationService;

import java.util.List;
@RestController
@RequestMapping("/intern")
public class InternApplicationController {

    @Autowired
    private InternApplicationService internApplicationService;

    @PostMapping("/apply")
    public InternApplication createApplication(@RequestBody InternApplication application) {
        return internApplicationService.createApplication(application);
    }

    @GetMapping("/applications")
    public List<InternApplication> getApplications() {
        return internApplicationService.getApplications();
    }
}
