package org.shankar.JobPortal.Model;

import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private  int reqExperience;
    private List<String> postTechStack;
}
