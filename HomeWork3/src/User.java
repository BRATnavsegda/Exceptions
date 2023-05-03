import java.io.ObjectInputStream;
import java.util.Date;

public class User {

    String surname;
    String name;
    String patronymic;
    String birthday;
    int phoneNumber;
    char sex;


    User(){
        this.surname = "surname";
        this.name = "name";
        this.patronymic = "patronymic";
        this.birthday = "birthday";
        this.phoneNumber = 123456;
        this.sex = 'm';
    }

     User(String[] array) {


try {
    this.setSurname(array[0]);
    this.setName(array[1]);
    this.setPatronymic(array[2]);
    this.setBirthday(array[3]);
    this.setPhoneNumber(Integer.parseInt(array[4]));
    this.setSex(array[5].charAt(0));
} catch (Exception e) {
    e.printStackTrace();

//    System.out.println(new User(Controller.checkData(View.GetData())));
//    throw new RuntimeException("incorrectly entered parameters, try again");

}




    }
    User(String surname, String name, String patronymic, String birthday, int phoneNumber, char sex){

        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }



    @Override
    public String toString() {
        return "--------------------\nSurname: "+ this.surname
                + "\nName: " + this.name
                + "\nPatronymic: " + this.patronymic
                + "\nBirthday: " + this.birthday
                + "\nPhone number: "+ this.phoneNumber
                + "\nSex: "+ this.sex
                + "\n--------------------";
    }
}
