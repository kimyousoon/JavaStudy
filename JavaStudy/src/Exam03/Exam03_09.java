package Exam03;

public class Exam03_09 {
	public static void main(String[] args) {
		 char ch = 'T';
		 //char lowerCase = ( /* A ���� ũ�� Z ���� ���� ��� */ ) ? ( /* ch + 32 */ ) : ch;
		 char lowerCase = (ch > 'A' && ch < 'Z' ? (char) (ch+32 ) : ch);
		 System.out.println("ch : " + ch);
		 System.out.println("ch to lowerCase : " + lowerCase);
		 }

}
