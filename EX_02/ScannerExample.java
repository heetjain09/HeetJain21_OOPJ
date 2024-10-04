import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name using Scanner:");
        String name = scanner.nextLine();

        System.out.println("Enter your age using Scanner:");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old. (from Scanner)");

  
        scanner.close();
    }
}
