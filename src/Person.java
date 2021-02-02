import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person>{

    private static int COUNT = 1;
    private int id;
    private String name;
    private LocalDate birthday;

    public Person() {
        this.id = COUNT;
        this.name = "Mr.Somebody number " + COUNT++;
        this.birthday = FactoryUtils.createLocalDateTime();
    }

    public Person(int id, String name, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + DateUtils.date(birthday) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthday);
    }

    @Override
    public int compareTo(Person other) {
        return this.getName().compareTo(other.getName());
    }
}
