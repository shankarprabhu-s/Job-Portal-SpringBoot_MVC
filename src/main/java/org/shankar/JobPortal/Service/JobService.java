package org.shankar.JobPortal.Service;

import org.shankar.JobPortal.Repo.JobRepo;
import org.shankar.JobPortal.Model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost) {
        repo.add(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return  repo.getAll();
    }

}
