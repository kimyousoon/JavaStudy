package ch06;

import java.util.Calendar;

public class Exam6_3_3 {
	//ctrl + d :���ٻ���
	public static int getLastYear(int month) {

		int date =0;
		if(month ==1 || month ==3 || month ==5) {
			date=31;
//			return 31;
		} else if(month==2) {
			date=28;
//			return 28;
		}else {
		date=30;
		}
		return date;
		
	}
	
	public static int getLastYear2(int month) {
		Calendar cal = Calendar.getInstance();
		//������ ��¥�� �޷� ����
		cal.set(2019,month-1,1);
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		
		
		return lastDate;
		
	}
	public static void main(String[] args) {
		int lastDate = getLastYear2(2);
		System.out.println(lastDate);
	}
}
