//2Darray
public class TwoDarray {
    public static void main(String args[]) {
        int rows = 4;
        int columns = 4;
        int[][] array = new int[rows][columns];
        int value = 1;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) 
            {
                array[i][j] = value;
                value++;
            }
        }

       
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
}
//String

public class MyString {
    public static void main(String[] args) {
      
        String s1 = "sumeet";
        char[] ch = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);
        String s3 = new String("kadam");
        
  
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
         
        
    }
}
