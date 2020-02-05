package pvt.automation;

public class Student extends Person {
    protected String mainSubject;
    protected int age;
    protected boolean man;
    protected String surname;

    public Student(String surname,  String mainSubject, int age, boolean man) {
        this.surname = surname;
        this.mainSubject = mainSubject;
        this.age = age;
        this.man = man;
    }

    private void checkAge (int age) {
        System.out.println((age > 18) ? "You are adult!" : "You are a child!");
    }

    protected void printStudentInfo() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nMain Subject: " + mainSubject);
    }

    public void checkGender() {
        System.out.println((man) ? "You are a man!" : "You a are a woman");
    }

    void printStudenName() {
        System.out.println("Student name: " + name + " " + surname);
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
        Student student = (Student) obj;
        if (age != student.age) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (int) (11 * ((null == surname) ? 0 : surname.hashCode()));
    }

    public String toString() {
        return getClass().getName() + "Student's surname: " + surname + "\nStudent's age: " + age;
    }
}
