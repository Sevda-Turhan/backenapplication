package com.example.backenapplication.Service;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import com.example.backenapplication.user.EngineeringApplication;
@Service
public class EngineeringApplicationService {

    private List<EngineeringApplication> applications = new ArrayList<>();

    public EngineeringApplication createApplication(EngineeringApplication application) {
        applications.add(application);
        return application;
    }

    public List<EngineeringApplication> getApplications() {
        return applications;
    }
}
