import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.print("Please input a decimal number: ");
        double x = scan.nextDouble();

        int rndX = (int)(x + 0.5);
        System.out.println("Rounded answer: " + rndX);
    }
}