import java.util.Scanner;

public class Administrator extends SalariedEmployee {
    private String _title;
    private String _area;
    private String _supervisorsName;

    public Administrator() {
        super();
        _title = "empty title";
        _area = "no area";
        _supervisorsName = "null";
    }

    public Administrator(String name, Date hireDate, double salary, String newTitle,
                         String newArea, String newSupervisorsName) {
        super(name, hireDate, salary);
        _title = newTitle;
        _area = newArea;
        _supervisorsName = newSupervisorsName;
    }

    public Administrator(Administrator newAdmin) {
        super(newAdmin);
        _title = newAdmin._title;
        _area = newAdmin._area;
        _supervisorsName = newAdmin._supervisorsName;
    }

    public String getTitle() {
        return _title;
    }

    public String getArea() {
        return _area;
    }

    public String getSupervisorsName() {
        return _supervisorsName;
    }

    public void setTitle(String newTitle) {
        _title = newTitle;
    }

    public void setArea(String newArea) {
        _area = newArea;
    }

    public void setSupervisorsName(String newSuper) {
        _supervisorsName = newSuper;
    }

    public void readAdminInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nEnter the name of the administrator: ");
        super.setName(keyboard.next());
        System.out.print("Enter the month as a number: ");
        int month = keyboard.nextInt();
        System.out.print("Enter the day as a number: ");
        int day = keyboard.nextInt();
        System.out.print("Enter the year as a number: ");
        int year = keyboard.nextInt();

        Date newDate = new Date(month, day, year);
        super.setHireDate(newDate);
        System.out.print("Enter the Salary as a number: ");
        super.setSalary(keyboard.nextDouble());
        System.out.print("Enter the administrator's title: ");
        _title = keyboard.next();
        System.out.print("Enter the administrator's area: ");
        _area = keyboard.next();

        System.out.print("Enter the administrator's supervisor: ");
        _supervisorsName = keyboard.next();

    }

    public String toString() {
        String output = super.getName() + " " + super.getHireDate().toString() +
                "\n$" + super.getSalary() + " per year, " + _title + ", " + _area
                + ", supervised by " + _supervisorsName + "\n";
        return output;
    }
}
