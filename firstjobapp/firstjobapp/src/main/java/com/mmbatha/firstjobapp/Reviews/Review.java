package com.mmbatha.firstjobapp.Reviews;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mmbatha.firstjobapp.company.Company;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private double rating;

    @JsonIgnore
    @ManyToOne
    private Company company;
}
