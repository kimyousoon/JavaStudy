package Exam04;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		//�޷� ���(���̺귯��)���
		Calendar cal= Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int mounth = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		
		//�޷��� ��¥�� ����
		cal.set(2012, 1, 1);
		int dayOfweek = cal.get(Calendar.DAY_OF_WEEK);
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		
		//�޷��� ���� ���� ����ϱ�
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("====================");
		//�ſ� 1���� ���� ���� �����ֱ�(����)
	
		for(int i = 1; i < dayOfweek; i++) {
			System.out.print("   ");
		}
		for(int i = 1; i <= lastDate; i++) {
			
		if(i<10) {
			System.out.print("0"+i+" ");
		}else {
			System.out.print(i+" ");
		}
		
		if(dayOfweek %7 ==0) {
		System.out.println();	
	}
		dayOfweek ++;
}
	}
}

