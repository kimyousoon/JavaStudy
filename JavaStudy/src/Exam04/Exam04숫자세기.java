package Exam04;

import java.util.Scanner;

public class Exam04���ڼ��� {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��Ͻÿ�.=>");
		Scanner s =new Scanner(System.in);
		int num = s.nextInt();
		int count=0;
		for(int i =1; i<=num; i++ ) {			
			int n = i;
			while(num >0) {				
				int n2 =n % 10;
				if(n2==8) {
					count++;
				}
				n= n / 10;
			}		
		}
		System.out.println(count);		
	}

}


