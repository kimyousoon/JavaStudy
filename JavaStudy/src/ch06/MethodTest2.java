package ch06;

public class MethodTest2 {
	public static boolean hasNegative(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
			int[] arr= { 1, 2, 3, 4, -9};
			boolean b = hasNegative(arr);
			System.out.println(b);
			
			// �� �迭�� ������ �ִ��� �˻�
		
	
	}
}
