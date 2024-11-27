package practice.week12;

import java.util.ArrayList;
import java.util.HashMap;

// practice.week12.Deck 클래스는 카드들의 모음을 관리하는 클래스
public class Deck {
    // 카드들을 저장할 ArrayList 선언
    private ArrayList<Card> deck = new ArrayList<>();
    
    // 카드의 무늬들을 저장하는 배열
    // 변경되지 않으므로 static final로 선언
    private static final String[] SUITS = {"클로버", "하트", "다이아", "스페이드"};
    
    // 특수 카드(A, K, Q, J)의 숫자와 이름을 매핑하는 HashMap
    // 변경되지 않으므로 static final로 선언
    private static final HashMap<Integer, String> RANKS = new HashMap<>();

    // practice.week12.Deck 클래스의 생성자
    public Deck() {
        // 특수 카드의 숫자와 이름을 HashMap에 저장
        RANKS.put(1, "A");
        RANKS.put(11, "J");
        RANKS.put(12, "Q");
        RANKS.put(13, "K");

        // 덱든 무늬와 숫자의 조합으로 카드 생성
        for (String suit : SUITS) {
            for (int i = 1; i <= 13; i++) {
                // 1과 11~13은 특수 카드, 2~10은 일반 카드로 생성
                if (i == 1 || i > 10) {
                    deck.add(new SpecialCard(suit, RANKS.get(i)));
                } else {
                    deck.add(new RegularCard(suit, i));
                }
            }
        }
    }

    // 덱에 새로운 카드를 추가하는 메소드
    public void addCard(Card card) { deck.add(card); }

    // 덱의 모든 카드를 출력하는 메소드
    public void showDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    public static void main(String[] args) {
        // 덱을 생성하고 조커를 추가한 후 모든 카드 출력
        Deck deck = new Deck();

        // practice.week12.Card Type으로 추가되므로 업케스팅이 이루어짐
        deck.addCard(new SpecialCard("조커"));
        deck.showDeck();
    }
}
