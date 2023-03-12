package case_study.model.Facillity;

import case_study.model.Facillity.Facility;

public class Vila extends Facility {
    private String roomStandards;
    private String poolArea;
    private String floors;

    public Vila() {
    }

    public Vila(String serviceName, String usableArea, String rentalCost, String maxNumberPerson
            , String rentalType, String roomStandards, String poolArea, String floors) {
        super(serviceName, usableArea, rentalCost, maxNumberPerson, rentalType);
        this.roomStandards = roomStandards;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public String getFloors() {
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

