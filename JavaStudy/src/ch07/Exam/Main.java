package ch07.Exam;

public class Main {
 public static void main(String[] args) {
	/*������ ����*/
	 Human human= new Human();
	 human.setName("��");
	 human.setType('O');
	 human.setAge(20);
	 
	 
	 /*BloodHouse ��ü ���� */
	 BloodHouse b = new BloodHouse();
	 String result=b.action(human); // action() �޼ҵ� ȣ�� ��� ����
	 /* action() �޼ҵ带 ȣ���ϸ鼭 �Ű������� ������ ���� �Ѱ���*/
	 b.action(human);
	 /* action() �޼ҵ� ȣ�� ��� ���*/
	 System.out.println(result);
}
}
