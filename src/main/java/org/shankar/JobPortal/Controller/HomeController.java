package org.shankar.JobPortal.Controller;

import org.shankar.JobPortal.Model.JobPost;
import org.shankar.JobPortal.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private JobService service;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewAllJobs(Model m) {
        List<JobPost> jobPostList = service.getAllJobs();
        System.out.println(jobPostList); // This works and shows data
        m.addAttribute("jobPosts", jobPostList); // Use "jobPosts" to match JSP
        return "viewalljobs";
    }

}
