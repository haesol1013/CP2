package power_java.ch02.programming;
import java.util.Scanner;

public class Programming7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("받은 돈: ");
        int receivedMoney = sc.nextInt();

        System.out.print("상품 가격: ");
        int price = sc.nextInt();

        int tax = (int) (price * 0.1);
        int change = receivedMoney - price;
        System.out.println("부가세: " + tax);
        System.out.println("잔돈: " + change);
    }
}
