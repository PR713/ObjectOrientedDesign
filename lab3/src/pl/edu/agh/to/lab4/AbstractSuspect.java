package pl.edu.agh.to.lab4;

public class AbstractSuspect {
    protected final String name;

    protected final String surname;

    protected final int age;

    public AbstractSuspect(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String display() {
        return name + " " + surname;
    }
}
