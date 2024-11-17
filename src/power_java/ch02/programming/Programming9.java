package power_java.ch02.programming;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Programming9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> ans = getBinary(n, list);
        System.out.print(n + ": ");
        for(int i=ans.size()-1; i >= 0; i--)
            System.out.print(ans.get(i));

//        String result = ans.stream().map(String::valueOf).collect(Collectors.joining());
//        System.out.println(result);
    }

    public static ArrayList<Integer> getBinary(int n, ArrayList<Integer> list) {
        if (n != 0) {
            int remainder = n % 2;
            n /= 2;
            list.add(remainder);
            return getBinary(n, list);
        } else {
            return list;
        }
    }
}
