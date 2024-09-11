//buffered reader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Buff{
    public static void main(String args[]) {       
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {     
            System.out.print("Enter a line of text: ");                      
            String input = reader.readLine();                 
            System.out.println("You entered: " + input);
        } catch (IOException e) {       
            System.err.println("An error occurred while reading input: " + e.getMessage());
        } finally {
            try {                
                reader.close();
            } catch (IOException e) {
                System.err.println("An error occurred while closing the BufferedReader: " + e.getMessage());
            }
        }
    }
}
//scanner
import java.util.Scanner;

public class Add{
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);         
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();       
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();        
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();           
        int sum = num1 + num2 + num3;            
        System.out.println("The sum of the three numbers is: " + sum);            
        sc.close();
    }
}
