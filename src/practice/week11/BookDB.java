package practice.week11;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDB {
    // 책 정보를 저장하는 배열
    private static final ArrayList<Book> bookList = new ArrayList<>();

    // Scanner 객체 생성
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 메뉴 출력
        showInfo();

        // 메뉴 선택
        while (true) {
            // 메뉴를 입력받음
            System.out.print("번호를 입력하세요>>> ");
            int menu = sc.nextInt();

            // 입력받은 메뉴 수행
            switch (menu) {
                // 1. 책 등록
                case 1 -> saveBook();
                // 2. 책 검색
                case 2 -> searchBook();
                // 3. 모든 책 출력
                case 3 -> printInfo();
                case 4 -> {
                    // 프로그램이 종료됨을 알린 뒤, 프로그램 종료
                    System.out.println("Info: 프로그램을 종료합니다.");
                    System.exit(0);
                }
                // 1~4 사이의 숫자를 입력받지 않았을 시, Error 출력
                default -> System.out.println("Error: 잘못된 입력입니다.");
            }
        }
    }

    // 메뉴를 출력
    static void showInfo() {
        System.out.println("==================================");
        System.out.println("1. 책 등록");
        System.out.println("2. 책 검색");
        System.out.println("3. 모든 책 출력");
        System.out.println("4. 종료");
        System.out.println("==================================");
    }

    // 책 정보를 저장하는 메소드
    static void saveBook() {
        // 책 제목을 입력받음
        System.out.print("제목을 입력하세요\n: ");

        // 이전 입력에서 남은 개행 문자 제거
        sc.nextLine();

        // 책 제목 입력받음
        String title = sc.nextLine();

        // 평점을 입력받음
        int score;
        while (true) {
            // 1~10사이의 숫자를 입력받음
            System.out.print("평점을 입력하세요(1~10)\n: ");
            score = sc.nextInt();

            // 1~10의 범위를 벗어난다면 Error 출력후, 다시 입력받음
            if (score < 1 || score > 10) {
                System.out.println("Error: 범위를 벗어납니다.");
            } else {
                break;
            }
        }

        // 입력받은 책 정보를 배열에 저장
        bookList.add(new Book(title, score));
    }

    // 책 정보를 검색하는 메소드
    static void searchBook() {
        // 저장된 책이 없을 시, Info 출력
        if (bookList.isEmpty()) {
            System.out.println("Info: 저장된 책이 없습니다");
            return;
        }

        // 책 검색
        while (true) {
            // 책의 index를 입력받음
            System.out.printf("찾고 싶은 책의 index를 입력하세요(1~%d)\n: ", bookList.size());
            int bookNum = sc.nextInt();

            // index를 벗어난다면 Error 출력후, 다시 입력받음
            if (bookNum > bookList.size()) {
                System.out.println("Error: 인덱스 번호를 벗어납니다");
            } else {
                // 책 정보를 출력
                // count는 index보다 항상 1 작으므로 입력받은 bookNum에 1을 빼서 접근
                System.out.println(bookList.get(bookNum-1));
                break;
            }
        }
    }

    // 저장된 모든 책을 출력하는 메소드
    static void printInfo() {
        // 저장된 책이 없을 시, Info 출력
        if (bookList.isEmpty()) {
            System.out.println("Info: 저장된 책이 없습니다");
            return;
        }

        // 모든 책을 출력함을 알림
        System.out.println("Info: 저장된 모든 책을 출력합니다.");

        // for-each 문을 사용하여 모든 책 정보를 출력
        for (Book book: bookList) System.out.println(book);
    }
}
