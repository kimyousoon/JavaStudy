package ch07.Exam;

public class BloodHouse {
	public boolean isPossible(Human human) {
		int age=0;
		boolean isPossible = false; //���� ���� ����
	
		/* �Ѱܹ��� Human Ŭ�����κ��� age ���� Ȯ�� age=? */
		/* age�� 16�� �̻� 69�� ���� �϶��� ���� �����ϵ��� ���ǹ� �ϼ�*/
		age = human.getAge();
		if(age >= 16 && age <=69) {
			isPossible =true;
		}
			return isPossible;
	}
	public String action(Human human) {
		String result = ""; //���� ��� ����
		String name="";
		name=human.getName();
		/* isPossible() �޼ҵ带 Ȱ���Ͽ� ���� ���� ���θ� Ȯ���ϴ� ���ǹ� �ϼ�*/
		
		/* ���� ���ɽ� result="������ �Ϸ�Ǿ����ϴ�. xx�� �����մϴ�."*/
		if(isPossible(human) ==true) {
		result ="������ �����մϴ�." +name + "�� �����մϴ�.";
		/* ���� �Ұ� �� result = "������ �Ұ����մϴ�.*/
	}else {
		result="�Ұ����մϴ�.";
	}
		return result;
	}

}
