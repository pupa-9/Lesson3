package Java.Input;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import Java.Interfaces.InputData;
import Java.PersonData;


public class ConsoleInputData implements InputData{  
   
    @Override
    public PersonData readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество дата рождения номер телефона пол");
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        if (data.length != 6) {
            System.out.println("Ошибка: неверное количество данных");
            return null;
        }
        String surname = data[0];
        String name = data[1];
        String patronymic = data[2];
        LocalDate birthDate;
        try {
            birthDate = LocalDate.parse(data[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (Exception e) {
            System.out.println("Ошибка: неверный формат даты рождения");
            return null;
        }
        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(data[4]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат номера телефона");
            return null;
        }
        char gender;
        if (data[5].equals("f") || data[5].equals("m")) {
            gender = data[5].charAt(0);
        } else {
            System.out.println("Ошибка: неверный формат пола");
            return null;
        }
        return new PersonData(surname, name, patronymic, birthDate, phoneNumber, gender);
    }

}

