package com.truonglt.truong_se140903.dtos;

import java.io.Serializable;

public class ArmorDTO implements Serializable {
    private String armorId, classification, description;
    private int status;
    private String timeOfCreate;
    private int defense;

    public ArmorDTO(String armorId, String classification, String description, int status, String timeOfCreate, int defense) {
        this.armorId = armorId;
        this.classification = classification;
        this.description = description;
        this.status = status;
        this.timeOfCreate = timeOfCreate;
        this.defense = defense;
    }

    public String getArmorId() {
        return armorId;
    }

    public void setArmorId(String armorId) {
        this.armorId = armorId;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTimeOfCreate() {
        return timeOfCreate;
    }

    public void setTimeOfCreate(String timeOfCreate) {
        this.timeOfCreate = timeOfCreate;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return armorId + '-' + classification + '-' + description + '-' + status + '-'+ timeOfCreate + '-' + defense ;
    }
}
