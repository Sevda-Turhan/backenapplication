package com.example.backenapplication.Service;
import lombok.Getter;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import com.example.backenapplication.user.TraineeApplication;
@Getter
@Service
public class TraineeApplicationService {

    private final List<TraineeApplication> applications = new ArrayList<>();

    public TraineeApplication createApplication(TraineeApplication application) {
        applications.add(application);
        return application;
    }

}
