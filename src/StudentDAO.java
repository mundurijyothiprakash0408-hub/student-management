import java.sql.*;
public class StudentDAO {
    public void addStudent(Student student){
    String sql = """
                INSERT INTO students
                (first_name,last_name,email,course,cgpa)
                VALUES(?,?,?,?,?)
                """;

        try (
    Connection con = DBConnection.getConnection();
    PreparedStatement ps = con.prepareStatement(sql)
        ) {

        ps.setString(1, student.getFirstName());
        ps.setString(2, student.getLastName());
        ps.setString(3, student.getEmail());
        ps.setString(4, student.getCourse());
        ps.setDouble(5, student.getCgpa());

        int rows = ps.executeUpdate();

        if(rows > 0) {
            System.out.println("Student Added Successfully!");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}



    public void viewStudents() {
        String sql = "SELECT * FROM students";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
        ) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("student_id"));
                System.out.println("Name: " +
                        rs.getString("first_name") + " " +
                        rs.getString("last_name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Course: " + rs.getString("course"));
                System.out.println("CGPA: " + rs.getDouble("cgpa"));
                System.out.println("---------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String course) {
        String sql = "UPDATE students SET course = ? WHERE student_id = ?";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, course);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE student_id = ?";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}