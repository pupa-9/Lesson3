package Java.Output;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import Java.PersonData;
import Java.Interfaces.DataWriter;

public class FileDataWriter implements DataWriter {
    @Override
    public boolean writeData(PersonData personData) {
        String fileName = personData.getSurname() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(personData.getSurname() + personData.getName() + personData.getPatronymic() + personData.getBirthDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + " " + personData.getPhoneNumber() + personData.getGender() + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}

