package power_java.ch02;
import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.next();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.println(name + "님 안녕하세요! " + age + "살 이시군요!");
    }
}
