package com.jessmorse.bntaapi.consultant;

public class Consultant {
    private int consultantId;
    private String name;
    private String location;
    private Boolean ableToRelocate;
    private int currentClient;

    public Consultant(int consultantId, String name, String location, Boolean ableToRelocate, int currentClient) {
        this.consultantId = consultantId;
        this.name = name;
        this.location = location;
        this.ableToRelocate = ableToRelocate;
        this.currentClient = currentClient;
    }

    public Consultant(int id, String name, String location, boolean able_to_relocate, int current_client) {
    }

    public Consultant() {
    }

    public int getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(int consultantId) {
        this.consultantId = consultantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getAbleToRelocate() {
        return ableToRelocate;
    }

    public void setAbleToRelocate(Boolean ableToRelocate) {
        this.ableToRelocate = ableToRelocate;
    }

    public int getCurrentClient() {
        return currentClient;
    }

    public void setCurrentClient(int currentClient) {
        this.currentClient = currentClient;
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "consultantId=" + consultantId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", ableToRelocate='" + ableToRelocate + '\'' +
                ", currentClient=" + currentClient +
                '}';
    }
}
