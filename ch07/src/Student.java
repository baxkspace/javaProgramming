public class Student extends Person {
    private String studentID;
    private String courseName;
    private String teacherName;

    public Student (String firstName, String lastName, String newStudentID, String newCourseName, String newTeacherName) {
        super(firstName, lastName);
        studentID = newStudentID;
        courseName = newCourseName;
        teacherName = newTeacherName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID : " + studentID);
        System.out.println("Course Name : " + courseName);
        System.out.println("Teacher Name : " + teacherName + "\n");
    }
}
