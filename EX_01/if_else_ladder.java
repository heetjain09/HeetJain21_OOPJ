public class if_else_ladder {
    public static void main(String[] args) {
        int number = 75;

        if (number >= 90) {
            System.out.println("The number is A grade");
        } else if (number >= 80) {
            System.out.println("The number is B grade");
        } else if (number >= 70) {
            System.out.println("The number is C grade");
        } else if (number >= 60) {
            System.out.println("The number is D grade");
        } else {
            System.out.println("The number is F grade");
        }
    }
}
