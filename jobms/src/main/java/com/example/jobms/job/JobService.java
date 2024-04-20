package com.example.jobms.job;

import java.util.List;

import com.example.jobms.job.dto.JobWithCompanyDto;

public interface JobService {
    List<JobWithCompanyDto> findAll();

    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJobById(Long id, Job updatedJob);
}
