package pvt.automation;

public class Person extends Man {
    protected String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void printName(String name) {
        System.out.println("The name is: " + name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        if (name != person.name) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (int) (17 * ((null == name) ? 0 : name.hashCode()));
    }

    public String toString() {
        return getClass().getName() + "Person's name: " + name;
    }
}
