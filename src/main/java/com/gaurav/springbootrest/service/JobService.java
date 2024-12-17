package com.gaurav.springbootrest.service;

import com.gaurav.springbootrest.model.JobPost;
import com.gaurav.springbootrest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class JobService {
    @Autowired
    public JobRepo repo;



    //method to return all JobPosts
    public List<JobPost> returnAllJobPosts() {
        return repo.returnAllJobPosts();


    }






    public void addJobPost(JobPost jobPost) {
        repo.addJobPost(jobPost);

    }


    public JobPost getJob(int postId) {
        return repo.getJob(postId);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);

    }

    public void removeJob(int postId) {
        repo.removeJob( postId);
    }
}