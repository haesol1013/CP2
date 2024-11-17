package practice.week4;

public class NumberGuessing {
    public static void main(String[] args) {
        char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();
       for (double i = 0; i < 10000000000000000L; i++) {
           int ranN = (int) (Math.random() * 26);
           System.out.print(a[ranN]);
       }
    }
}
