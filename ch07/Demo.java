public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("John", "Mathew",
                "S110001", "UG", "Peter");
        Student s2 = new Student("Wayne", "Parnell",
                "S110002", "PG", "Morkel");
        s1.displayDetails();
        s2.displayDetails();

        Teacher t1 = new Teacher("Simon", "Harmer",
                "Java", 10500);
        Teacher t2 = new Teacher("David", "Miller",
                "C++", 20500);
        t1.displayDetails();
        t2.displayDetails();
    }
}
