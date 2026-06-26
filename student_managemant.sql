CREATE DATABASE IF NOT EXISTS student_management;

USE student_management;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    course VARCHAR(100) NOT NULL,
    cgpa DECIMAL(3,2) NOT NULL
);