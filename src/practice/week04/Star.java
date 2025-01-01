package practice.week04;

public class Star {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = -5; j <= 5; j++) {
                System.out.print((abs(j) <= i) ? abs(j) : " ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static int abs(int n) {
        return (n >= 0)? n : -n;
    }
}
