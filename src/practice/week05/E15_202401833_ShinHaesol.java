package practice.week5;

import java.util.HashSet;
import java.util.Set;

public class E15_202401833_ShinHaesol {
    public static void main(String[] args) {
        // 3 by 5 2차원 배열 생성
        int[][] arr = new int[3][5];
        // 랜덤 값의 중복을 검사하기 위한 set 객체 생성
        Set<Integer> set = new HashSet<>();

        // set이 5의 크기를 가질 때까지 랜덤 값을 set에 추가
        while (set.size() < 5) {
            // 0 ~ 14 사이의 정수값을 저장하기 위해 15를 곱하고 int로 형변환 한 뒤 숫자를 set에 추가
            int rand = (int) (Math.random() * 15);
            set.add(rand);
        }

        // set에 들어있는 숫자를 뽑아 2차원 배열 업데이트
        for (int k : set) {
            // set의 숫자를 5로 나눈 값 -> 행
            int i = k / 5;
            // set의 숫자를 5로 나눈 나머지 -> 열
            int j = k % 5;
            // 배열 업데이트
            arr[i][j] = 1;
        }

        // 배열 출력
        // for-each 구문을 통해 행별로 순회
        for (int[] row : arr) {
            // 행 내의 원소들 출력
            for (int i : row ) {
                System.out.print(i + " ");
            }
            // 한 행이 모두 출력되면 줄바꿈
            System.out.println();
        }
    }
}
