package ch07.printer;

public class Main {
	public static void main(String[] args) {
		Printer p = new Printer();
		pc pc1 = new pc();
		pc1.request2(p);		
		pc pc2 = new pc();
		pc2.request2(p);	
	}
}
