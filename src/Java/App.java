package Java;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Java.Input.ConsoleInputData;
import Java.Interfaces.DataWriter;
import Java.Interfaces.InputData;
import Java.Output.FileDataWriter;



public class App {
    public static void main(String[] args) {
        InputData inputData = new ConsoleInputData();
        PersonData personData = inputData.readData();
        if (personData == null) {
            return;
        }
        DataWriter dataWriter = new FileDataWriter();
        boolean success = dataWriter.writeData(personData);
        if (success) {
            System.out.println("Данные успешно записаны в файл " + personData.getSurname() + ".txt");
        } else {
            System.out.println("Ошибка записи в файл");
        }
    }
}
