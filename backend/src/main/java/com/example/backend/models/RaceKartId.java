package com.example.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RaceKartId implements Serializable {
    private static final long serialVersionUID = 8187386344862721761L;
    @Column(name = "race_id", nullable = false)
    private Integer raceId;

    @Column(name = "kart_id", nullable = false)
    private Integer kartId;

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Integer getKartId() {
        return kartId;
    }

    public void setKartId(Integer kartId) {
        this.kartId = kartId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaceKartId entity = (RaceKartId) o;
        return Objects.equals(this.raceId, entity.raceId) &&
                Objects.equals(this.kartId, entity.kartId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceId, kartId);
    }
}