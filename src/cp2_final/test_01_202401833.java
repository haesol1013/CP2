package cp2_final;

import java.util.Scanner;

public class test_01_202401833 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("202401833_신해솔");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n2 < n1) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		
		int printed = 0;
		
		for (int i = n1; i <= n2; i++) {
			if (isPrime(i)) {
				if (printed < 4) {
					System.out.print(i + " ");
					printed++;
				} else {
					System.out.println(i + " ");
					printed = 0;
				}
			}	
		}		
	}
	
	static boolean isPrime(int n) {
		if (n == 1) { return false;}
		
		for (int i = 2; i < n ; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
}
