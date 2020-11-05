import java.util.Scanner;

class Question5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 

        System.out.print("Please input a decimal number: ");
        double a = scan.nextDouble();

        int b = (int) (a * 10);

        int c = b % 10;

        int d = (int) (a * 100);

        int e = d % 10;

        System.out.print("Answer: " + c + " " + e);
    }
}