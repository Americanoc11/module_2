package case_study.model.Facillity;

import case_study.model.Facillity.Facility;

public class House extends Facility {
    private String roomStandards;
    private int floors;

    public House() {
    }

    public House(String serviceName, double usableArea, long rentalCost, int maxNumberPerson
            , String rentalType, String roomStandards, int floors) {
        super(serviceName, usableArea, rentalCost, maxNumberPerson, rentalType);
        this.roomStandards = roomStandards;
        this.floors = floors;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public String toString() {
        return  "House{" +super.toString() +
                ", roomStandards='" + roomStandards + '\'' +
                ", floors='" + floors + '\'' +
                '}';
    }
    @Override
    public String writeToCsv() {
        return super.writeToCsv()+ roomStandards + "," + floors ;
    }
    /*
    service name
    usableArea
    rentalCost
    maxNumberPerson
    rentaltype
    roomstandards
    floor
     */
}
