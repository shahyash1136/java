import java.time.LocalDate;
import java.time.Period;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = toAge(birthDate);
    }

    public int toAge(String birthDate) {
        // Your implementation here
        LocalDate parasedBirthDate = LocalDate.parse(birthDate);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(parasedBirthDate, now);
        int age = diff.getYears();
        return age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        setAge(birthDate);
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(String birthDate) {
        this.age = toAge(birthDate);
    }

    public String toString() {
        return "Name: " + this.name + "\n" +
                "Phone number: " + this.phoneNumber + "\n" +
                "Birth Date: " + this.birthDate + "\n" +
                "Age: " + this.age + " year old\n";
    }

}
