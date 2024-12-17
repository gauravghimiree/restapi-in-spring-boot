package com.gaurav.springbootrest;

import com.gaurav.springbootrest.model.JobPost;
import com.gaurav.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class jobRestController {
    @Autowired
    private JobService service;
    @GetMapping("jobPosts")

    public List<JobPost> getAllJobs()
    {
        return service.returnAllJobPosts();
    }
    @GetMapping("jobPost/{postId}")
     public JobPost getJob(@PathVariable("postId") int postId)
    {
        return service.getJob(postId);
    }
    @PostMapping("jobPost")
  public  void addJob(@RequestBody JobPost jobPost)
  {
      service.addJobPost(jobPost);
  }
  @PutMapping("jobPost")
 public JobPost  updateJob(@RequestBody JobPost jobPost)
    {
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }
    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId)
    {
        service.removeJob(postId);
        return "success";
    }


}
