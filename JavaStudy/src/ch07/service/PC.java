package ch07.service;

public class PC {
	public void show() {
		Member[] mem = select();
		for(Member m: mem) {
			System.out.println(m.id);
			System.out.println(m.pw);
		}
	}
	public Member[] select() {
		Member[] mem = new Member[5];
		Member m = new Member();
				for(int i = 0; i <5; i++) {
					//DB ��ȸ-> �迭�� ����
					m.id ="id" +i;
					m.pw = "pw" +i;
					mem[i]=m;
				}
				return mem;
	}
}
