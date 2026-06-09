package com.example.jobtracker.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String company;
    private String role;
    private LocalDate dateApplied;
    private String status;
    private String notes;

    Job(String company, String role, LocalDate dateApplied, String status, String notes) {
        this.company = company;
        this.role = role;
        this.dateApplied = dateApplied;
        this.status = status;
        this.notes = notes;
    }

    public Long getID() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


    public LocalDate setlLocalDate(LocalDate dateApplied) {
        return dateApplied;
    }

    public void getLocalDate(LocalDate dateApplied) {
        this.dateApplied = dateApplied;

    }


}
