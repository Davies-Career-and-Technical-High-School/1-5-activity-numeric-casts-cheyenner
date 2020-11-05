import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a two digit number : ");

       int x = scan.nextInt();

       System.out.println("Here are the digits : ");
       System.out.println(x/10);
       System.out.println(x%10);
    }
}