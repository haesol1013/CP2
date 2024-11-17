package practice.week3;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("달을 입력하세요: ");
        int month = sc.nextInt();
        sc.close();

        String season = switch (month) {
            case 12, 1, 2 -> "겨울";
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            default -> "입력 오류";
        };

        System.out.println(season);
    }
}
