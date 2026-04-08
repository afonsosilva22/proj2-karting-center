package com.example.backend.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "kart_type_price")
public class KartTypePrice {
    @Id
    @Column(name = "type", nullable = false, length = 10)
    private String type;

    @Column(name = "price_per_hour", nullable = false, precision = 10, scale = 2)
    private BigDecimal pricePerHour;

    @OneToMany(mappedBy = "type")
    private Set<Kart> karts = new LinkedHashSet<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(BigDecimal pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Set<Kart> getKarts() {
        return karts;
    }

    public void setKarts(Set<Kart> karts) {
        this.karts = karts;
    }

}