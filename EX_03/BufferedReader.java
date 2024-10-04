import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter some text: ");
            String input = reader.readLine();
            System.out.println("You entered: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
