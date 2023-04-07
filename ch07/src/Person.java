public class Person {
    private String firstName;
    private String lastName;

    public Person (String first, String last) {
        firstName = first;
        lastName = last;
    }

    public void setFirstName (String newFirstName){
        if (newFirstName == null) {
            System.out.println("Fatal Error setting first name.");
            System.exit(0);
        }
        else firstName = newFirstName;
    }

    public void setLastName (String newLastName) {
        if (newLastName == null) {
            System.out.println("Fatal Error setting last name.");
            System.exit(0);
        }
        else firstName = newLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void displayDetails() {
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
    }
}