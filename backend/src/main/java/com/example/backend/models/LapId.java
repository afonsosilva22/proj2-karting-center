package com.example.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LapId implements Serializable {
    private static final long serialVersionUID = -6589843513047481712L;
    @Column(name = "race_id", nullable = false)
    private Integer raceId;

    @Column(name = "kart_id", nullable = false)
    private Integer kartId;

    @Column(name = "lap_number", nullable = false)
    private Integer lapNumber;

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

    public Integer getLapNumber() {
        return lapNumber;
    }

    public void setLapNumber(Integer lapNumber) {
        this.lapNumber = lapNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LapId entity = (LapId) o;
        return Objects.equals(this.raceId, entity.raceId) &&
                Objects.equals(this.kartId, entity.kartId) &&
                Objects.equals(this.lapNumber, entity.lapNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceId, kartId, lapNumber);
    }
}