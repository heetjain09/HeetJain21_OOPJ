// Q6. Implement a program that displays a message for a given number based on the below conditions.

// If the number is a multiple of 3, display "Zip".

// If the number is a multiple of 5, display "Zap".

// If the number is a multiple of both 3 and 5, display "Zoom",

// For all other cases, display "Invalid".
//Ans: 
import java.util.Scanner;

public class ZipZapZoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

    
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Zoom");
        } else if (number % 3 == 0) {
            System.out.println("Zip");
        } else if (number % 5 == 0) {
            System.out.println("Zap");
        } else {
            System.out.println("Invalid");
        }

    
        scanner.close();
    }
}
// Output: 
// Enter a number: 9
// Zip
