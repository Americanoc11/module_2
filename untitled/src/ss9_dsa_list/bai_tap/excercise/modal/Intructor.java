package ss9_dsa_list.bai_tap.excercise.modal;

public class Intructor extends Person {
  private String subject;
  public Intructor(){

  }

    public Intructor(int id, String name, String dateOfBirth, Boolean gender, String subject) {
        super(id, name, dateOfBirth, gender);
        this.subject = subject;
    }
}
