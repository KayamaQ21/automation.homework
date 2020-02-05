package pvt.automation;

public class Example {

    public static void main(String[] args) {

        System.out.println(Methods.returnMin(2,3));
        System.out.println(Methods.isEven(5));
        System.out.println(Methods.makePow(5));
        System.out.println(Methods.makeCoub(5));

        Person person = new Person();
        person.printName("Ivan");

        Student student = new Student("Mikaelian", "IT", 27, true);
        Person person2 = new Person("Amayak");
        Person person3 = new Person("Amayak");

        student.printStudenName();
        student.printStudentInfo();
        student.checkGender();
        student.printName("Amayak");

        System.out.println(person2.equals(person3));
        System.out.println(person3.hashCode());
        System.out.println(person2.toString());
        System.out.println(student.toString());
    }
}
