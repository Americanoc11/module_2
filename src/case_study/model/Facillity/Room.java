package case_study.model.Facillity;

import case_study.model.Facillity.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceName, double usableArea, long rentalCost
            , int maxNumberPerson, String rentalType, String freeService) {
        super(serviceName, usableArea, rentalCost, maxNumberPerson, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    @Override
    public String toString() {
        return  "Room{" +super.toString() +
                ", freeService='" + freeService + '\'' +
                '}';
    }
    @Override
    public String writeToCsv() {
        return super.writeToCsv()+ freeService ;
    }
    /*
    service name
    usableArea
    rentalCost
    maxNumberPerson
    rentaltype
    freeService
     */
}
