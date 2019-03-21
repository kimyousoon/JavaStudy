package ch07.Exam;

public class BloodHouse {
	public boolean isPossible(Human human) {
		int age=0;
		boolean isPossible = false; //ÇåÇ÷ °¡´É ¿©ºÎ
	
		/* ³Ñ°Ü¹ŞÀº Human Å¬·¡½º·ÎºÎÅÍ age Á¤º¸ È®ÀÎ age=? */
		/* age°¡ 16¼¼ ÀÌ»ó 69¼¼ ÀÌÇÏ ÀÏ¶§¸¸ ÇåÇ÷ °¡´ÉÇÏµµ·Ï Á¶°Ç¹® ¿Ï¼º*/
		age = human.getAge();
		if(age >= 16 && age <=69) {
			isPossible =true;
		}
			return isPossible;
	}
	public String action(Human human) {
		String result = ""; //ÇåÇ÷ °á°ú ÀúÀå
		String name="";
		name=human.getName();
		/* isPossible() ¸Ş¼Òµå¸¦ È°¿ëÇÏ¿© ÇåÇ÷ °¡´É ¿©ºÎ¸¦ È®ÀÎÇÏ´Â Á¶°Ç¹® ¿Ï¼º*/
		
		/* ÇåÇ÷ °¡´É½Ã result="ÇåÇ÷ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù. xx´Ô °¨»çÇÕ´Ï´Ù."*/
		if(isPossible(human) ==true) {
		result ="ÇåÇ÷ÀÌ °¡´ÉÇÕ´Ï´Ù." +name + "´Ô °¨»çÇÕ´Ï´Ù.";
		/* ÇåÇ÷ ºÒ°¡ ½Ã result = "ÇåÇ÷ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù.*/
	}else {
		result="ºÒ°¡´ÉÇÕ´Ï´Ù.";
	}
		return result;
	}

}
