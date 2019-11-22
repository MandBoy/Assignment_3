CREATE TABLE Student(
	Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name char(255) NOT NULL,
    /*Login*/
    Semester int NOT NULL
    /*List of Classes student is in*/
);
CREATE TABLE Admin(
	Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name char(255) NOT NULL
    /*Login referance*/
);
CREATE TABLE Teacher(
	Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name char(255) NOT NULL
    /*Login referance*/
    /*List of Classes teacher is in*/
);
CREATE TABLE Class(
	Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name char(255) NOT NULL,
    /*Teacher of class referance*/
    Description char(255) NOT NULL,
	/*Requirement referance to student semester*/
    MinStudents int NOT NULL,
    MaxStudents int NOT NULL
    /*List of students in class*/
);
CREATE TABLE Login(
	Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Username varchar(255) NOT NULL,
    Password varchar(255) NOT NULL
);