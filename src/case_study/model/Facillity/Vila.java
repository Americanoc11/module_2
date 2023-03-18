package case_study.model.Facillity;

import case_study.model.Facillity.Facility;

public class Vila extends Facility {
    private String roomStandards;
    private double poolArea;
    private int floors;

    public Vila() {
    }

    public Vila(String serviceName, double usableArea, long rentalCost, int maxNumberPerson
            , String rentalType, String roomStandards, double poolArea, int floors) {
        super(serviceName, usableArea, rentalCost, maxNumberPerson, rentalType);
        this.roomStandards = roomStandards;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public String toString() {
        return "Vila{" + super.toString() +
                ", roomStandards='" + roomStandards + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", floors='" + floors + '\'' +
                '}';
    }

    @Override
    public String writeToCsv() {
        return super.writeToCsv() + roomStandards + "," + poolArea + "," + floors;
    }
    /*
    service name
    usableArea
    rentalCost
    maxNumberPerson
    rentaltype
    roomstandards
    poolArea
    floor
     */
}

