package Exam03;

import java.util.Scanner;

public class Exam03_06 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		 int n = scanner.nextInt();
		 int ten = 0; // 10�� �ڸ� ���� ������ ����
		 int one = 0; // 1�� �ڸ� ���� ������ ����
		 
		 ten = n /10;
		 one = n % 10;
		  
		 boolean isMatch = false; // �� �ڸ� �� �� ���� ������ ����
		 /* ten ������ 10�� �ڸ� �� ���� */
		 /* one ������ 1�� �ڸ� �� ���� */
		 /* isMatch ������ �� ���� �ڸ� �� �� �� ���� */

		 isMatch = ten == one;
		 
		 System.out.println(isMatch);
		 scanner.close();
		 }

}