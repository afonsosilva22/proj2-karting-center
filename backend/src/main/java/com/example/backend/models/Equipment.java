package com.example.backend.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "equipment")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "size", nullable = false, length = 10)
    private String size;

    @Column(name = "brand", length = 50)
    private String brand;

    @Column(name = "color", length = 30)
    private String color;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "acquisition_date", nullable = false)
    private LocalDate acquisitionDate;

    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @ColumnDefault("'available'")
    @Column(name = "status", nullable = false, length = 20)
    private String status;

    @OneToMany(mappedBy = "equipment")
    private Set<RaceEquipment> raceEquipments = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(LocalDate acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<RaceEquipment> getRaceEquipments() {
        return raceEquipments;
    }

    public void setRaceEquipments(Set<RaceEquipment> raceEquipments) {
        this.raceEquipments = raceEquipments;
    }

}