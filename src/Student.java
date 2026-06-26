public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String course;
    private double cgpa;

    public Student(int studentId,
                   String firstName,
                   String lastName,
                   String email,
                   String course,
                   double cgpa) {

        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.course = course;
        this.cgpa = cgpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public double getCgpa() {
        return cgpa;
    }
}