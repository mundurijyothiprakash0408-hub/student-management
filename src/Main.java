
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Student ID: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("First Name: ");
                    String firstName = sc.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Course: ");
                    String course = sc.nextLine();

                    System.out.print("CGPA: ");
                    double cgpa = sc.nextDouble();
                    sc.nextLine();


                    Student student = new Student(  studentId,
                            firstName,
                            lastName,
                            email,
                            course,
                            cgpa
                    );

                    dao.addStudent(student);
                    break;

                case 2:
                    dao.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    dao.updateStudent(updateId, newCourse);
                    break;

                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();

                    dao.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Program Ended");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}