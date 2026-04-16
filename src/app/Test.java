package app;

public class Test {

    public static void main(String[] args) {
        // Create 2 Person objects with the same first and last name
        Person person1 = new Person("Joe", "Lame");
        Person person2 = new Person("Joe", "Lame");

        // Create a 3rd Person object using the copy constructor
        Person person3 = new Person(person1);

        // Compare person1 and person2 using ==
        System.out.println("person1 == person2: " + (person1 == person2));

        // Compare person1 and person2 using equals()
        System.out.println("person1.equals(person2): " + person1.equals(person2));

        // Compare person1 and person3 using equals()
        System.out.println("person1.equals(person3): " + person1.equals(person3));

        // Print all Person objects using toString()
        System.out.println("person1: " + person1.toString());
        System.out.println("person2: " + person2.toString());
        System.out.println("person3: " + person3.toString());
    }
}