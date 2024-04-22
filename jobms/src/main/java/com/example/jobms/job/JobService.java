package com.example.jobms.job;

import java.util.List;

import com.example.jobms.job.dto.JobDTO;

public interface JobService {
    List<JobDTO> findAll();

    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJobById(Long id, Job updatedJob);
}
