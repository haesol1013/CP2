package practice.week05;

import java.util.Scanner;
import java.util.ArrayList;

public class E12_202401833_ShinHaesol {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 점수를 담을 ArrayList scores 생성
        ArrayList<Integer> scores = new ArrayList<>();

        // 점수 업데이트를 위한 변수 초기화
        int score = 0;
        // -1을 입력받고 반복문이 종료되므로 -1부터 카운트
        int cnt = -1;
        do {
            // 이전 반복 때 입력된 점수를 배열에 추가
            scores.add(score);
            // 입력받은 횟수 업데이트
            cnt++;
            // 성적 입력 받기
            System.out.print("성적을 입력하세요: ");
            score = sc.nextInt();

          // -1이 입력으로 주어진다면 반목 종료
        } while (score != -1);

        // 합을 담을 변수 초기화
        int sum = 0;
        // scores array를 순회하며 sum 변수 업데이트
        for (int i : scores) sum += i;

        // 합계와 평균 출력
        System.out.println("합계는: " + sum);
        // sum 변수를 float으로 형변환 후 계산
        System.out.println("평균: " + (float) sum / cnt);
    }
}
