package practice.week07;

class Student1 {
    String name;
    int age;
    double grade;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 0.0;
    }

    public Student1() {
        this("익명", 0);
    }

    public void printInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
        System.out.println("학점: " + this.grade);
        System.out.println("----------------");
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

public class StudentTest{
    public static void main(String[] args) {
        Student1 s1 = new Student1("신해솔", 20);
        s1.setGrade(3.0);
        s1.printInfo();

        Student1 s2 = new Student1("김종규", 36);
        s2.printInfo();

        Student1 s3 = new Student1();
        s3.printInfo();
    }
}