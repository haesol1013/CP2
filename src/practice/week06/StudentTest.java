package practice.week6;

class Student{
    public String name;
    public int rollNo;
    public int age;
}

public class StudentTest {
   public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "신해솔";
        obj.rollNo = 202401833;
        obj.age = 20;

        System.out.println("학생의 이름: " + obj.name);
        System.out.println("학생의 학번: " + obj.rollNo);
        System.out.println("학생의 나이: " + obj.age);
    }
}

