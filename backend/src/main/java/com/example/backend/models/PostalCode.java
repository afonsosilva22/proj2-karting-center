package com.example.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "postal_code")
public class PostalCode {
    @Id
    @Column(name = "postal_code", nullable = false, length = 20)
    private String postalCode;

    @Column(name = "locality", nullable = false, length = 100)
    private String locality;

    @JsonIgnore
    @OneToMany(mappedBy = "postalCode")
    private Set<Customer> customers = new LinkedHashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "postalCode")
    private Set<Employee> employees = new LinkedHashSet<>();

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

}