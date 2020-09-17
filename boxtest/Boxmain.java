package boxtest;

import box.Box;

public class Boxmain {

	public static void main(String[] args) {
	System.out.println(Box.money);//클래스이름.static변수	
		
	Box	b1=new Box("길동이", 100, 200);
	System.out.println(b1);//주소만으로도 값이 출력되도록 하세요~	
	
	}

}
