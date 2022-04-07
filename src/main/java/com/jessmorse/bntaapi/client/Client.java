package com.jessmorse.bntaapi.client;

public class Client {

    private int clientId;
    private String name;
    private String sector;
    private String location;
    private int consultantsRequired;

    public Client(int clientId, String name, String sector, String location, int consultantsRequired) {
        this.clientId = clientId;
        this.name = name;
        this.sector = sector;
        this.location = location;
        this.consultantsRequired = consultantsRequired;
    }

    public Client() {
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getConsultantsRequired() {
        return consultantsRequired;
    }

    public void setConsultantsRequired(int consultantsRequired) {
        this.consultantsRequired = consultantsRequired;
    }
}
