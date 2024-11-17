package power_java.ch02;
import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum of two numbers is " + sum);
    }
}
