package practice.week03;

import java.util.Scanner;

public class RSP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int user = sc.nextInt();
        int computer = (int) (Math.random() * 3);

        if (user == computer) {
            System.out.printf("무승부%n");
        } else if (user == (computer+1) % 3) {
            System.out.printf("인간: %d 컴퓨터: %d, 인간 승리%n", user, computer);
        } else {
            System.out.printf("인간: %d 컴퓨터: %d, 컴퓨터 승리%n", user, computer);
        }
    }
}
