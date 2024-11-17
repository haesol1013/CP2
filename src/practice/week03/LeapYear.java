package practice.week3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Scanner Instance 생성
        Scanner sc = new Scanner(System.in);

        // 년도 입력 받기
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        // 월 입력 받기
        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();

        // lastDay 변수 선언 및 switch 문 시작
        int lastDay = switch (month) {
            // 2월의 경우 윤년 판단
            case 2 -> {
                yield switch (year % 400) {
                    // 400의 배수인 경우 윤년
                    case 0 -> 29;
                    default -> switch (year % 100) {
                        // 100의 배수인 경우 평년
                        case 0 -> 28;
                        default -> switch (year % 4) {
                            // 4의 배수인 경유 윤년
                            case 0 -> 29;
                            //이외의 경우 평년
                            default -> 28;
                        };
                    };
                };
            }
            // 1, 3, 5, 7, 8, 10, 12 -> 말일: 31
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            // 4, 6, 9, 11 -> 말일: 30
            case 4, 6, 9, 11 -> 30;
            // 잘못 입력시 0 반환
            default -> 0;
        };

        // printf 함수로 년, 월, 말일 출력
        System.out.printf("%d년 %d월의 말일은 %d일 입니다", year, month, lastDay);
    }
}
