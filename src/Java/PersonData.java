package Java;
import java.time.LocalDate;

public class PersonData {
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate birthDate;
    private long phoneNumber;
    private char gender;

    public PersonData(String surname, String name, String patronymic, LocalDate birthDate, long phoneNumber, char gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }
}

