package com.mmbatha.firstjobapp.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mmbatha.firstjobapp.Reviews.Review;
import com.mmbatha.firstjobapp.job.Job;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Job> jobs;

    @OneToMany(mappedBy = "company")
    private List<Review> reviews ;

}
