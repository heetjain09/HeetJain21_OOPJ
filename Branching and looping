//nestedIfElse
import java.io.*;
public class NestedIfElse{
    public static void main(String args[]) {
        int age = 15;          
        boolean isStudent = true;   

        if (age >= 18) {      
            if (isStudent) {
                System.out.println("Adult Student");
            } else {
                System.out.println("Adult Non-Student");
            }
        } else {      
            if (isStudent) {
                System.out.println("Minor Student");
            } else {
                System.out.println("Minor Non-Student");
            }
        }
    }
}
//Switch case
import java.util.Scanner;

public class Grade{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();    
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else {
            int gradeCategory;     
            if (marks >= 90) {
                gradeCategory = 1; 
            } else if (marks >= 80) {
                gradeCategory = 2; 
            } else if (marks >= 70) {
                gradeCategory = 3; 
            } else if (marks >= 60) {
                gradeCategory = 4; 
            } else {
                gradeCategory = 5; 
            }            
            switch (gradeCategory) {
                case 1:
                    System.out.println("Grade: A");
                    break;
                case 2:
                    System.out.println("Grade: B");
                    break;
                case 3:
                    System.out.println("Grade: C");
                    break;
                case 4:
                    System.out.println("Grade: D");
                    break;
                case 5:
                    System.out.println("Grade: F");
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }

        sc.close();
    }
}
//forloop
import java.io.*;
public class ForLoop {
    public static void main(String args[]) {       
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
//dowhileloop
import java.util.Scanner;

public class DoWhile{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {         
            System.out.print("Enter a number (enter 0 to exit): ");
            num = sc.nextInt();           
            if (number != 0) {
                System.out.println("You entered: " + number);
            }
        } while (number != 0); 
        System.out.println("Program has ended.");
        sc.close();
    }
}
