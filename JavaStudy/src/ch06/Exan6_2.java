package ch06;

public class Exan6_2 {
	public static void main(String[] args) {
		int n = 1000;
		int total = getTotal(n);
		System.out.println("1 ~ " + n + " ������ �� : " + total);
	}

	// �޼ҵ� �ۼ�
	public static int getTotal(int number) {
		int total = 0;
		for (int i = 1; i <= number; i++) {
			total += i;

		}
		return total;

	}
}
