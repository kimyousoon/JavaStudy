package Exam04;

public class for1 {
	public static void main(String[] args) {
		//1. ���۰� 2. ����(����) 3. ������
		
		int total=0;
		int realTotal=0;
		
		//1+(1+2+)+(1+2+3)...+(1+2+......+10)
		
	for(int start = 1; start <= 100; start += 1) {
		//System.out.println("���" + start);
		total= total +start;
		realTotal=realTotal + total;
	}
			System.out.println(realTotal);
	
//		for(int end = 10; end >=1; end --) {
//			System.out.println("���� ���" + end);
//		}
//		//�ּ� Ctrl + /
////		System.out.println("���");
////		System.out.print("�������");
////		System.out.print("�� �������");
////		System.out.println();
////		System.out.println("���� ���");
////		// 1 2 3 ������ ����� ���� �ʴ� ���
////		for(int idx = 1; ;idx ++) {
////			System.out.println(idx);
//		
//		}
	}
}
