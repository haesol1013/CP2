package practice.week12;

// Card 클래스는 카드의 기본 속성과 동작을 정의하는 추상 클래스
public abstract class Card {
    // 카드의 무늬와 숫자를 저장하는 필드
    // 한 번 저장되면 변경되지 않도록 final로 선언
    protected final String suit;
    protected final String rank;

    // Card 클래스의 생성자
    // 카드의 무늬와 숫자를 매개변수로 받아 초기화
    protected Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // 카드 정보를 문자열로 반환하는 추상 메소드
    // 하위 클래스에서 반드시 구현해야 함
    @Override
    public abstract String toString();
}

// 일반 숫자 카드(2~10)를 나타내는 클래스
class RegularCard extends Card {
    // RegularCard 클래스의 생성자
    // 무늬와 숫자를 받아 상위 클래스의 생성자 호출
    public RegularCard(String suit, int rank) {
        super(suit, String.valueOf(rank));
    }

    // 카드 정보를 "무늬 숫자" 형태로 반환
    @Override
    public String toString() {
        return suit + " " + rank;
    }
}

// 특수 카드(A, K, Q, J, 조커)를 나타내는 클래스
class SpecialCard extends Card {
    // 무늬가 있는 특수 카드(A, K, Q, J)용 생성자
    public SpecialCard(String suit, String rank) {
        super(suit, rank);
    }

    // 무늬가 없는 특수 카드(조커)용 생성자
    public SpecialCard(String rank) {
        super("", rank);
    }

    // 카드 정보를 반환하는 메소드
    // 무늬가 없으면 숫자만, 있으면 "무늬 숫자" 형태로 반환
    @Override
    public String toString() {
        return suit.isEmpty() ? rank : suit + " " + rank;
    }
}