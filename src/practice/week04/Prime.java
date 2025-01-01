package practice.week04;

public class Prime {
    public static void main(String[] args) {
        // 소수의 개수 저장
        int primeNum = 0;
        // 한 줄에 몇 개의 소수가 출력되었는지 저장
        int printedNum = 0;

        // i -> 2부터 100까지 순회
        for (int i = 2; i <= 100; i++) {
            // 소수 출력을 위한 boolean type 변수 선언 -> 기본 값은 true
            // 1. for 문을 돌며 2 부터 i-1까지 나뉘는 수가 있다 -> false, for 문 break
            // 2. 나뉘는 수가 없다 -> 변경 없이 true 값을 가짐
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // i 가 소수라면 수행되는 블록
            if (isPrime) {
                // 총 소수의 개수 증가
                primeNum++;
                // 현재 줄에 출력된 소수의 개수가 5개 미만인지 확인
                if (printedNum < 5) {
                    // 현재 소수 i를 공백과 함께 출력
                    // printedNum을 1 증가시켜 현재 줄에 출력된 소수의 개수를 업데이트
                    System.out.printf("%d ", i);
                    printedNum++;
                } else {
                    // 줄 바꿈(\n)을 한 후, 현재 소수 i를 출력
                    // printedNum을 1로 재설정하여 새로운 줄에 첫 번째 소수가 출력되었음을 반영
                    System.out.printf("\n%d ", i);
                    printedNum = 1;
                }
            }
        }
        // 총 소수의 개수 출력
        System.out.printf("\n소수의 개수: %d", primeNum);
    }
}