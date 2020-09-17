package tvtest;

import tv.TV;

//실행용: main() 있다.
public class TVmain {

	public static void main(String[] args) {
		// 객체 생성 이전                 //클래스명.static 필드나 매서드 
		System.out.println("제조국 "+TV.MAKER);
		
		//객체 생성
		TV tv1 = new TV();// 인수가 없는 생성자
		tv1.show();

		TV tv2 = new TV(true, 10);
		tv2.show();

		TV tv3 = new TV("yellow", false, 100);
		tv3.show();

		// tv3.color="blue"; //변경불가
		tv2.TV tv= new tv2.TV();
		System.out.println(tv);//tv:tv2.TV객체의 주소
		//println:출력하기 전에 toString()을 호출하여 얻은 문자열을 출력함
		System.out.println(tv.toString());
		//주소만으로도 객체의 필드 값을 얻을 수 있다.
		
		
	}

}
