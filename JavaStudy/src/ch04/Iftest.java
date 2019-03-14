package ch04;

public class Iftest {
	public static void main(String[] args) {
		//주석처리 : 범위지정(Shift드래그) 후 Ctrl + /
		int score = 87;
		if(score >= 90) {
		 System.out.println("A");
		} else if( score >= 80) {
		 System.out.println("B");
		} else if(score >= 70) {
		 System.out.println("C");
		} else if(score >= 60) {
		 System.out.println("D");
		} else {
		 System.out.println("F");
		}
	
		}
	}
