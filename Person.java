
public class Person {
    String name;
    int age;
    Person nextPerson;
    Person prevPerson;
    
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
        this.nextPerson = null;
        this.prevPerson = null;
    }
}
