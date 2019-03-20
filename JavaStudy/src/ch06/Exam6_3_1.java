package ch06;

public class Exam6_3_1 {
	public static int checkGrade(int num) {
		int grade=0;
		if(num>10) {
			grade=1;
		}else if(num>7) {
			grade=2;
		}else if(num>4) {
			grade=3;
		}else {
			grade=4;
		}return grade;
	}
	
	public static void main(String[] args) {
		int result = checkGrade(3);
		System.out.println(result+"µî±Þ");
		
		
		}
	
}
