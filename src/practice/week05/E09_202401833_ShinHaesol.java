package practice.week05;

import java.util.Scanner;

public class E09_202401833_ShinHaesol {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 출력할 항의 개수 입력 받기
        System.out.print("출력할 항의 개수: ");
        int term = sc.nextInt();

        // 출력할 항의 개수 만큼의 크기를 갖는 fibo 배열 생성
        int[] fibo = new int[term];
        // 0번째, 1번째 숫자를 0, 1로 초기화
        fibo[0] = 0;
        fibo[1] = 1;

        // 2번째 숫자 부터 출력할 항까지 업데이트
        // n번째 항 -> n-1번째 숫자 + n-2번째 숫자
        for (int i = 2; i < term; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        // fibo 배열 출력
        for (int i : fibo) {
            System.out.print(i + " ");
        }

    }
}
