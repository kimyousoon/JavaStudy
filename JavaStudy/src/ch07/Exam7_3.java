package ch07;

public class Exam7_3 {
	public static void main(String[] args) {
		/* Class7_3의 method1(new / static ) 호출 */
		Class7_3.method1();
	}
}

class Class7_3 {
	int a; // 전역변수 자동으로 초기화 0으로...

	public static void method1() {
		System.out.println("method1 실행 시작");
		//5번 동작 -> 인스턴스 1개로 작업

		Class7_3 c = new Class7_3();
		for (int i = 0; i < 5; i++) {
			/* method2를 호출할 수 있도록 코드 작성 */
			c.method2();
		}
		System.out.println("method1 실행 종료");
	}

	public void method2() {
		/* 전역변수 a의 값을 1씩 증가 */
		a++;
		/* 전역변수 a의 값 출력 */
		System.out.println(a);
	}
}