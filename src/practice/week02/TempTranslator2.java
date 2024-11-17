package practice.week2;
import java.util.Scanner;

public class TempTranslator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("=======================");

        System.out.print("번호를 선택하세요: ");
        int num = sc.nextInt();

        if (num==1) {
            System.out.print("화씨 온도를 입력하세요: ");
            double temp = sc.nextDouble();

            double result = (temp - 32) * 5 / 9;
            System.out.println("섭씨 온도는: " + result);
        } else {
            System.out.print("섭씨 온도를 입력하세요: ");
            double temp = sc.nextDouble();

            double result = temp * 9 / 5 + 32;
            System.out.println("화씨 온도는: " + result);
        }
    }
}
