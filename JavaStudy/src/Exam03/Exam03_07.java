package Exam03;

public class Exam03_07 {
	public static void main(String[] args) {
		 int num = 12345;
		 // �ڵ� �ۼ� (% ������)
		 int n1 = num % 10; //5
			
			// �ι�° 2 ���� ����
			num =num / 10; // 1234
			int n2 = num % 10; // 4
			
			// ����° 3 ���� ����
			num = num /10; // 123
			int n3 = num % 10; // 3
			
			//�׹�° 2 ���� ����
			num =num / 10;  // 12
			int n4 = num % 10; // 2
			
			num =num / 10;  // 1
			int n5 = num % 10; // 
			
			
		 int total = n1 + n2 + n3 + n4+n5;
		 System.out.println("�� �ڸ� ������ �� : " + total);
		 }
		}


