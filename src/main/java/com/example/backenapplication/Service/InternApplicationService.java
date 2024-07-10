package com.example.backenapplication.Service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import com.example.backenapplication.user.InternApplication;

@Service

public class InternApplicationService {
    private List<InternApplication> applications = new ArrayList<>();
    public InternApplication createInternApplication(InternApplication application) {
        applications.add(application);
        return application;

    }
    public List<InternApplication> getApplications() {
        return applications;
    }


    public InternApplication createApplication(InternApplication application) {
        return application;
    }
}
