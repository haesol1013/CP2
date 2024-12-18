package practice.week11;

class Book {
    // Book 클래스에 저장할 값을 선언하는 필드
    // 클래스 외부에서 접근하지 못하도록 private로 선언
    // 책 번호, 제목, 점수는 한 번 저장되면 변하지 않으므로 final로 선언
    // 책의 수를 저장하는 변수는 static으로 선언
    private final int bookNum;
    private final String title;
    private final int score;
    private static int count;

    // Book 클래스의 생성자
    public Book(String title, int score) {
        // 객체가 생성될 때 마다 그 순서가 bookNum 변수에 저장
        // 대입 전 count 변수 1 증가 (count 변수의 초기값 0)
        bookNum = ++count;

        // 이름과 점수 저장
        this.title = title;
        this.score = score;
    }

    // Book 클래스의 객체를 출력하는 toString 메소드
    public String toString() {
        // [책 번호] 제목 : 점수 형태로 출력
        return "[" + bookNum + "] " + title + " : " + score;
    }
}
