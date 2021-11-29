package objects;

import java.util.ArrayList;

public class Station {
    int stationId;
    String name;
    ArrayList<String> facilities;

    public Station(int stationId, String name, ArrayList<String> facilities) {
        this.stationId = stationId;
        this.name = name;
        this.facilities = facilities;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(ArrayList<String> facilities) {
        this.facilities = facilities;
    }
}
