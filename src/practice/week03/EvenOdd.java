package practice.week03;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();

        String result = (n%2 == 0) ? "짝수" : "홀수";
        System.out.printf("입력된 정수는 %s 입니다.", result);
    }
}
