# Student Management System

## Project Description

This is a Java console-based Student Management System developed using JDBC and MySQL. It allows users to perform CRUD (Create, Read, Update, Delete) operations on student records.

## Features

- Add Student
- View Students
- Update Student
- Delete Student
- Menu-driven console application

## Technologies Used

- Java
- JDBC
- MySQL
- IntelliJ IDEA
- Git & GitHub

## Project Structure

```
src/
    Main.java
    DBConnection.java
    Student.java
    StudentDAO.java
```

## Database Setup

1. Install MySQL.
2. Create a database named:

```sql
student_management
```

3. Run the SQL script provided in:

```
student_management.sql
```

4. Update the database username and password inside:

```
DBConnection.java
```

Example:

```java
String url = "jdbc:mysql://localhost:3306/student_management";
String username = "root";
String password = "your_password";
```

## How to Run

1. Clone the repository

```
git clone https://github.com/mundurijyothiprakash0408-hub/student-management.git
```

2. Open the project in IntelliJ IDEA.

3. Configure MySQL.

4. Run Main.java.

## Author

Munduri Jyothiprakash