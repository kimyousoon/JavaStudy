package Exam04;

public class Exam04_03 {
	public static void main(String[] args) {
		int year = 2500; // ����
		/* �ڵ� �ۼ� */
		if (year % 400 == 0) {
			System.out.println("�����Դϴ�");
		} else if (year % 100 == 0) {
			System.out.println("����Դϴ�");
		} else if (year % 4 == 0) {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("����Դϴ�.");
		}
	}
}