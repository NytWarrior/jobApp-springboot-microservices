package com.example.jobms.job.mapper;

import java.util.List;

import com.example.jobms.job.Job;
import com.example.jobms.job.dto.JobDTO;
import com.example.jobms.job.external.Company;
import com.example.jobms.job.external.Review;

public class JobMapper {
    public static JobDTO mapToJobDto(Job job, Company company, List<Review> reviews) {
        JobDTO jobDto = new JobDTO();

        jobDto.setId(job.getId());
        jobDto.setTitle(job.getTitle());
        jobDto.setDescription(job.getDescription());
        jobDto.setMinSalary(job.getMinSalary());
        jobDto.setMaxSalary(job.getMaxSalary());
        jobDto.setLocation(job.getLocation());
        jobDto.setCompany(company);
        jobDto.setReviews(reviews);
        return jobDto;
    }
}
