package case_study.model.Facillity;

import case_study.model.Facillity.Facility;

public class House extends Facility {
    private String roomStandards;
    private String floors;

    public House() {
    }

    public House(String serviceName, String usableArea, String rentalCost, String maxNumberPerson
            , String rentalType, String roomStandards, String floors) {
        super(serviceName, usableArea, rentalCost, maxNumberPerson, rentalType);
        this.roomStandards = roomStandards;
        this.floors = floors;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public String getFloors() {
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
