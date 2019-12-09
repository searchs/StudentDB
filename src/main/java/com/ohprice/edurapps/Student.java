package com.ohprice.edurapps;

import java.util.Scanner;

public class Student {

//    constructor

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public int getTuitionBalance() {
        return tuitionBalance;
    }

    public void setTuitionBalance(int tuitionBalance) {
        this.tuitionBalance = tuitionBalance;
    }

    public static int getCostOfCourse() {
        return costOfCourse;
    }

    public static void setCostOfCourse(int costOfCourse) {
        Student.costOfCourse = costOfCourse;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1001;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student first name:");
        this.firstName = scanner.nextLine();

        System.out.println("Enter Student last name:");
        this.lastName = scanner.nextLine();

        System.out.println("1: Freshman\n2: Sophomore\n3: Junior\n4: Senior\nEnter student class level: ");
        this.gradeYear = scanner.nextInt();

        setStudentID();
        System.out.println(this.toString());
    }


    //    generate student ID
    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }


    //    enroll in courses
    public void enroll() {
        System.out.println("Enter course to enroll (Q to quit):");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        if (course != "Q") {
            courses = course + "\n" + course;
            tuitionBalance = tuitionBalance + costOfCourse;
        }

        System.out.println("Enrolled in Courses: " + courses);
        System.out.println("Tuition Balance: " + tuitionBalance);

    }

//    view balance


//    pay tuition

//show status


    public String toString() {
        return "Student ID: " + this.studentID + " " + this.firstName + " " + lastName + " " + this.gradeYear;
    }

}


