package practice.week7;

import java.util.Scanner;

class Student {
    // Scanner 클래스의 sc 객체 생성
    Scanner sc = new Scanner(System.in);
    // Student 클래스에 필요한 필드 선언
    String name;
    int age;
    int[] scores = new int[3];
    int total;
    double average;

    // Student 클래스의 생성자
    // 이름과 나이를 입력받아 저장
    public Student(int i) {
        // i는 0부터 시작하므로 1을 더하여 출력
        System.out.printf("%d번째 학생의 이름을 입력하세요: ", i+1);
        // Scanner 클래스의 next 메소드로 String을 입력받아 name 변수에 저장
        name = sc.next();
        System.out.printf("%d번째 학생의 나이를 입력하세요: ", i+1);
        // Scanner 클래스의 nextInt 메소드로 int을 입력받아 age 변수에 저장
        age = sc.nextInt();
    }

    // 학생의 점수를 입력 받아 총 점수와 평균 점수를 업데이트하는 메소드
    public void inputScores() {
        // printf 함수를 이용해 객체의 name을 포매팅하여 출력
        System.out.printf("%s 학생의 점수를 입력하세요.\n", name);
        // 0부터 2까지 순회하며 scores 배열에 점수 저장
        for (int i = 0; i < 3; i++) {
            // 학생 번호와 마찬가지로 i에 1을 더해 포매팅하여 출력
            System.out.printf("%d번째 과목 점수: ", i+1);
            // nextInt 메소드를 이용해 int 저장
            scores[i] = sc.nextInt();
        }
        // scores 배열의 각 점수를 total 변수에 합산
        for (int score: scores) total += score;

        // total 값에 3을 나눈 값을 average 변수에 저장
        average = (double) total / 3;
    }

    // 학생의 정보를 출력하는 메소드
    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("점수 합계: " + total);
        // printf 함수를 사용하여 평균의 소수점 둘째자리까지 출력
        System.out.printf("점수 평균: %.2f\n", average);
        System.out.println("----------------------------");
    }

}

public class Student_Shinhaesol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 먼저, 입력할 총 학생 수를 입력받아 num 변수에 저장
        System.out.print("학생 수를 입력하세요: ");
        int num = sc.nextInt();

        // Student 객체를 원소로 갖는 num 길이의 students 배열 생성
        Student[] students = new Student[num];
        // num 회 반복하며 students 배열의 i번째 원소를 Student 객체로 지정
        for (int i = 0 ; i < num ; i++) {
            // 순서를 인자로 갖는 Student 객체 생성
            students[i] = new Student(i);
            // 과목의 점수를 입력받는 Student 클래스의 inputScores 메소드 실행
            students[i].inputScores();
            // 마지막 번째 순서를 제외하고 입력란을 구분하기 위해 -를 출력
            if (i < num-1) System.out.println("----------------------------");
        }

        // 학생 정보를 출력할 것을 알림
        System.out.println("==========학생 정보 출력==========");
        // students 배열을 순회하며 각 객체의 printInfo 메소드 실행
        for (Student student : students) student.printInfo();
    }
}
