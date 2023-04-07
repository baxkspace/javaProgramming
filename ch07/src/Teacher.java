public class Teacher extends Person {
    static String subjectName;
    static double salary;

    public Teacher (String firstName, String lastName, String newSubjectName, double newSalary) {
        super(firstName, lastName);
        subjectName = newSubjectName;
        salary = newSalary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject Name : " + subjectName);
        System.out.println("Salary : " + salary + "\n");
    }
}
