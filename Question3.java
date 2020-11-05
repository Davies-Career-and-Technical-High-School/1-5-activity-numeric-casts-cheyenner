import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two integers that you want to average: ");

        double x = scan.nextDouble();
        double y = scan.nextDouble();

        double avg = (x + y) / 2;
        System.out.println("The average is: " + avg);
    }
}