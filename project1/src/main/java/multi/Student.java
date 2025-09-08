package multi;

public class Student extends Course {
    String stuname = "Suhana";

    public void issueID() {
        // Accessing inherited variables
        System.out.println(collageName + " " + courseName + " " + stuname);
    }

    public static void main(String[] args) {
        Student stu = new Student();
        stu.issueID();
    }
}
