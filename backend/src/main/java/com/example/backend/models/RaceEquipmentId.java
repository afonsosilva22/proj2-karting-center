package com.example.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RaceEquipmentId implements Serializable {
    private static final long serialVersionUID = -8011401324672855291L;
    @Column(name = "race_id", nullable = false)
    private Integer raceId;

    @Column(name = "equipment_id", nullable = false)
    private Integer equipmentId;

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaceEquipmentId entity = (RaceEquipmentId) o;
        return Objects.equals(this.raceId, entity.raceId) &&
                Objects.equals(this.equipmentId, entity.equipmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceId, equipmentId);
    }
}