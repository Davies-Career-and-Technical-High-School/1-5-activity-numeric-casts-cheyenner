import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a three digit number : ");

       int x = scan.nextInt();

       System.out.println("Here are the digits : ");
       System.out.println(x%10);

       int b = x/10; 
       System.out.println(b%10);
       System.out.println(b/10);
    }
}