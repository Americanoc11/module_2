package case_study.model.Facillity;

public abstract class Facility {
    private String serviceName;
    private String usableArea;
    private String rentalCost;
    private String maxNumberPerson;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, String usableArea, String rentalCost, String maxNumberPerson, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxNumberPerson = maxNumberPerson;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public String getMaxNumberPerson() {
        return maxNumberPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    @Override
    public String toString() {
        return
                "serviceName='" + serviceName + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentalCost='" + rentalCost + '\'' +
                ", maxNumberPerson='" + maxNumberPerson + '\'' +
                ", rentalType='" + rentalType ;

    }

    public String writeToCsv() {
        return serviceName + "," + usableArea + "," + rentalCost +"," + maxNumberPerson + "," + rentalType;
    }

}
