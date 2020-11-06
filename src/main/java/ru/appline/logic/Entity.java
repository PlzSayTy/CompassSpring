package ru.appline.logic;

public class Entity {

    public Entity(String north, String northWest, String southEast, String northEast, String southWest, String vest, String east, String south) {
        this.north = north;
        this.northWest = northWest;
        this.southEast = southEast;
        this.northEast = northEast;
        this.southWest = southWest;
        this.vest = vest;
        this.east = east;
        this.south = south;
    }

    public Entity() {
        super();
    }

    public String getNorthWest() {
        return northWest;
    }

    public void setNorthWest(String northWest) {
        this.northWest = northWest;
    }

    public String getSouthEast() {
        return southEast;
    }

    public void setSouthEast(String southEast) {
        this.southEast = southEast;
    }

    public String getNorthEast() {
        return northEast;
    }

    public void setNorthEast(String northEast) {
        this.northEast = northEast;
    }

    public String getSouthWest() {
        return southWest;
    }

    public void setSouthWest(String southWest) {
        this.southWest = southWest;
    }

    private String southEast;
    private String northEast;
    private String southWest;
    private String vest;
    private String east;
    private String south;
    private String north;
    private String northWest;

    public String getNorth() {
        return north;
    }

    public void setNorth(String north) {
        this.north = north;
    }

    public String getVest() {
        return vest;
    }

    public void setVest(String vest) {
        this.vest = vest;
    }

    public String getEast() {
        return east;
    }

    public void setEast(String east) {
        this.east = east;
    }

    public String getSouth() {
        return south;
    }

    public void setSouth(String south) {
        this.south = south;
    }

}
