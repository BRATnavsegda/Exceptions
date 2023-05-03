import java.io.*;

public class FileWorker {

    public static void WriteInFile(User user) {

        try (FileWriter writer = new FileWriter(user.surname +  ".txt", true)) {

            String text = "--------------------\nSurname: "+ user.surname
                    + "\nName: " + user.name
                    + "\nPatronymic: " + user.patronymic
                    + "\nBirthday: " + user.birthday
                    + "\nPhone number: "+ user.phoneNumber
                    + "\nSex: "+ user.sex
                    + "\n--------------------";
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {

            ex.getStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
