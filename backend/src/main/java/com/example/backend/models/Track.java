package com.example.backend.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "track")
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "price_per_hour", nullable = false, precision = 10, scale = 2)
    private BigDecimal pricePerHour;

    @Column(name = "length_km", nullable = false, precision = 6, scale = 3)
    private BigDecimal lengthKm;

    @Column(name = "kart_limit", nullable = false)
    private Integer kartLimit;

    @ColumnDefault("'available'")
    @Column(name = "status", nullable = false, length = 20)
    private String status;

    @OneToMany(mappedBy = "track")
    private Set<Maintenance> maintenances = new LinkedHashSet<>();

    @OneToMany(mappedBy = "track")
    private Set<Race> races = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(BigDecimal pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public BigDecimal getLengthKm() {
        return lengthKm;
    }

    public void setLengthKm(BigDecimal lengthKm) {
        this.lengthKm = lengthKm;
    }

    public Integer getKartLimit() {
        return kartLimit;
    }

    public void setKartLimit(Integer kartLimit) {
        this.kartLimit = kartLimit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Maintenance> getMaintenances() {
        return maintenances;
    }

    public void setMaintenances(Set<Maintenance> maintenances) {
        this.maintenances = maintenances;
    }

    public Set<Race> getRaces() {
        return races;
    }

    public void setRaces(Set<Race> races) {
        this.races = races;
    }

}