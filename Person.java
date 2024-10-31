public class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to display person's details
    public void displayInfo() {
        System.out.println("Name: " + name );
    }

    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.displayInfo();
    }
}
