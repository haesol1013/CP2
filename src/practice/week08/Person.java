package practice.week08;

public class Person {
    // Person 클래스의 필드 설정
    // Person 클래스는 name, age, address의 속성을 가짐
    private String name;
    private int age;
    private String address;

    // Person 클래스의 생성자
    // 이름, 나이, 주소를 초기화함
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // name의 setter
    public void setName(String name) {
        this.name = name;
    }

    // age의 setter
    // 함수의 인자가 0 이하면 유효성 검사 메세지를 출력함
    public void setAge(int age) {
        // age 값 검사
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("유효한 나이를 입력하세요.");
        }

    }

    // address의 setter
    public void setAddress(String address) {
        this.address = address;
    }

    // Person 클래스의 속성들을 출력
    public void printInfo() {
        System.out.println("-------------------------");
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
        System.out.println("주소: " + this.address);
        System.out.println("-------------------------");
    }
}
