package JavaProgramming;
import java.util.Scanner;

public class StudentResult {
    String studentName;
    int mark1, mark2, mark3, total;
    double avg;
    String result, grade, remark;

    // Constructor
    StudentResult(String name, int m1, int m2, int m3) {
        studentName = name;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    // Method to calculate and display report
    void report() {
        total = mark1 + mark2 + mark3;
        avg = total / 3.0;

        // Pass/Fail logic
        if (mark1 >= 35 && mark2 >= 35 && mark3 >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        // Grade and remark calculation
        if (avg >= 90) {
            grade = "A";
            remark = "Excellent";
        } else if (avg >= 75) {
            grade = "B";
            remark = "Very Good";
        } else if (avg >= 55) {
            grade = "C";
            remark = "Good";
        } else if (avg >= 45) {
            grade = "D";
            remark = "Satisfactory";
        } else {
            grade = "--";
            remark = "Needs Improvement";
        }

        // Printing Report
        System.out.println("\n*****************************");
        System.out.println("        STUDENT REPORT       ");
        System.out.println("*****************************");
        System.out.println("Student Name : " + studentName);
        System.out.println("------------------------------------------------------------");
        System.out.println("Mark1\tMark2\tMark3\tTotal\tAverage\tResult\tGrade\tRemark");
        System.out.println(mark1 + "\t" + mark2 + "\t" + mark3 + "\t" + total + "\t" + avg + "\t" + result + "\t" + grade + "\t" + remark);
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks for Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks for Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks for Subject 3: ");
        int m3 = sc.nextInt();

        // Creating object and showing report
        StudentResult sr = new StudentResult(name, m1, m2, m3);
        sr.report();

        sc.close();
    }
}
