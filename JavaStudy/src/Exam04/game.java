package Exam04;

import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		System.out.println("����:0, ����:1, ��:2");
		Scanner s = new Scanner(System.in);
		boolean isContunue= true;
		while(isContunue) {
	        int player = s.nextInt();
			int com = (int)(Math.random() *3);
			
			
			if ((player + 1) % 3 == com) {
				System.out.println("���� ��");
			} else {
				if (player == com) {
					System.out.println("���");
				} else {
					System.out.println("�����̱�");
					isContunue=false;
				}
			}
		}
	}
}