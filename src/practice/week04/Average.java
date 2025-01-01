package practice.week04;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;

        while (true) {
            int input = sc.nextInt();
            if (input < 0) break;
            sum += input;
            cnt += 1;
        }
        sc.close();
        System.out.println(sum / cnt);

    }


}
