package practice.week8;

public class Main {
    public static void main(String[] args) {
        // Person 클래스의 객체 person을 생성함
        // 생성자를 통해 이름, 나이, 주소를 설정함
        Person person = new Person("홍길동", 13, "서울시 강남구");
        // 기초 설정된 person의 정보를 출력함
        person.printInfo();

        // 변경할 값을 변수에 저정함
        String name = "박지우";
        int age = 15;
        String address = "서울시 송파구";

        // 변경될 값들을 출력하여 알림
        System.out.println("이름을 설정합니다: " + name);
        System.out.println("나이를 설정합니다: " + age);
        System.out.println("주소를 설정합니다: " + address);

        // person의 setter들을 통해 이름, 나이, 주소를 설정
        person.setName(name);
        person.setAge(age);
        person.setAddress(address);

        // 변경된 정보를 출력함
        person.printInfo();

        // 유효하지 않은 값을 setAge 함수의 인자로 하여 호출해 유효성 검사 메세지가 출력되는지 확인
        person.setAge(-5);
    }
}
