import java.util.Scanner;

public class OperatorCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter operator: ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if (ch == '+') {
            System.out.println("Result = " + (a + b));
        } 
        else if (ch == '-') {
            System.out.println("Result = " + (a - b));
        } 
        else if (ch == '*') {
            System.out.println("Result = " + (a * b));
        } 
        else if (ch == '/') {
            System.out.println("Result = " + (a / b));
        } 
        else {
            System.out.println("Invalid operator");
        }
        sc.close();
    }
}