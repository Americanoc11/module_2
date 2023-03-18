package case_study.model.Facillity;

public abstract class Facility {
    private String serviceName;
    private double usableArea;
    private long rentalCost;
    private int maxNumberPerson;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, double usableArea, long rentalCost, int maxNumberPerson, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxNumberPerson = maxNumberPerson;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public long getRentalCost() {
        return rentalCost;
    }

    public int getMaxNumberPerson() {
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
                        ", rentalType='" + rentalType;

    }

    public String writeToCsv() {
        return serviceName + "," + usableArea + "," + rentalCost + "," + maxNumberPerson + "," + rentalType + ",";
    }

}
