package practice.week02;
import java.util.Scanner;

public class TempTranslator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("=======================");

        System.out.print("번호를 선택하세요: ");
        int num = sc.nextInt();
        System.out.print("온도를 입력하세요: ");
        double temp = sc.nextDouble();

        double result = (num==1) ? (temp - 32) * 5/9 : temp * 9/5 + 32;
        System.out.println("변환된 온도는: " + result);
    }
}
