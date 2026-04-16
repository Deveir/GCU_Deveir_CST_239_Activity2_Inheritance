package app;

public class Person {
    private String firstName;
    private String lastName;

    // Non-default constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Copy constructor
    public Person(Person other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Override equals()
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (!(other instanceof Person)) {
            return false;
        }

        Person otherPerson = (Person) other;

        return this.firstName.equals(otherPerson.firstName)
                && this.lastName.equals(otherPerson.lastName);
    }

    // Override toString()
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}