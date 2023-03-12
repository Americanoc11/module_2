package case_study.model.Person;

public class Customer extends Person{
    private String guestType;
    private String andressResort;
    public Customer() {
    }

    public Customer(int id, String name, String dateofBirth, Boolean gender, String identity, String phone, String email, String guestType, String andressResort) {
        super(id, name, dateofBirth, gender, identity, phone, email);
        this.guestType = guestType;
        this.andressResort = andressResort;
    }

    public String getGuestType() {
        return guestType;
    }

    public String getAndressResort() {
        return andressResort;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                ", guestType='" + guestType + '\'' +
                ", andressResort='" + andressResort + '\'' +
                '}';
    }
    @Override
    public String writeToCsv() {
        return super.toString()+","+guestType+","+andressResort;
    }
     /*
    id
    name
    date
    gender
    identity
    phone
    email
    guestType
    andress
     */
}
