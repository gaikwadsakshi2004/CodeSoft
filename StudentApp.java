package JavaProgramming;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    String rollNumber;
    String grade;

    Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String toString() {
        return rollNumber + " - " + name + " - " + grade;
    }
}

class StudentManagementSystem {
    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added!");
    }

    void removeStudent(String roll) {
        for (Student s : students) {
            if (s.rollNumber.equalsIgnoreCase(roll)) {
                students.remove(s);
                System.out.println("Student removed!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    void searchStudent(String roll) {
        for (Student s : students) {
            if (s.rollNumber.equalsIgnoreCase(roll)) {
                System.out.println("Found: " + s);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    String roll = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();
                    if (roll.isEmpty() || name.isEmpty() || grade.isEmpty()) {
                        System.out.println("All fields required!");
                    } else {
                        sms.addStudent(new Student(name, roll, grade));
                    }
                    break;

                case 2:
                    System.out.print("Enter Roll No to remove: ");
                    sms.removeStudent(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    sms.searchStudent(sc.nextLine());
                    break;

                case 4:
                    sms.displayAll();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
