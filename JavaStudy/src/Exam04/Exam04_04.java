package Exam04;

import java.util.Scanner;

public class Exam04_04 {
	public static void main(String[] args) {
			Scanner scanner= new Scanner(System.in);
			System.out.println("���� 3�� �Է�>>");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if(a>=b && a<=c || a>=c && a<= b) {
				System.out.println("�߰����� a");
	}else if(b >= a && b<= c || b >= c && b <=a) {
		System.out.println("�߰����� b");
	}else {
		System.out.println("�߰����� c");
	}

	}
}
