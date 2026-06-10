package com.example.jobtracker.service;


import com.example.jobtracker.model.Job;
import com.example.jobtracker.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job getJobById(Long id) {
        Optional<Job> job = jobRepository.findById(id);
        return job.orElse(null);
    }

    public Job addJob(Job job) {
        return jobRepository.save(job);
    }

    public Job updateJob(Long id, Job updateJob) {
        updateJob.setId(id);
        return jobRepository.save(updateJob);
    }

    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }

}
