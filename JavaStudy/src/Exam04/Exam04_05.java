package Exam04;

public class Exam04_05 {
	public static void main(String[] args) {
		 boolean isContinue = true;
		 int count = 0;
		 //두개의 주사위를 던졌을때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
		// 눈의 합이 10이면 실행을 종료하는 코드 작성 (Math.random() 메소드)
		 while(isContinue) {
		 int num1 = (int) (Math.random() * 6 + 1);
		 int num2 = (int) (Math.random() * 6 + 1);
		 
		System.out.println("("+num1+")"+ ","+"("+num2+")");
		 if(num1+num2==10) {
			 isContinue=false;
			 break;
		 }
		 count++;
		 }
		 System.out.println("주사위를 던진 횟수 : " + count);
		 }
		}

