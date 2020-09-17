package tv3;

//import TV;
public class TVmain {//같은 클래스안에서만 접근 가능. 정보은익 =>캡슐화
	// 속성 => 필드 = 맴버변수

	int a;//<-클래스 안에서는 필드 //라이브러리용

	//기본생성자

	// 기능 => 메서드
	public static void main(String[] args) {// 메서드안에 적용되는 것은 무조건 지역변수//실행용
		TVmain t=new TVmain();
		t.a=10;
		System.out.println(t.a);//this는 객체 안에서만 존재함
		
		TVmain t2=new TVmain();
		t2.a=20;
		System.out.println(t2.a);//this는 객체 안에서만 존재함
		
		//static 맴버에 접근방법 -1:클래스이름.static 맴버(권장)
		//System.out.println(TV.maker);
		System.out.println(TV.CONTRY);
		//TV.setMaker("한국");
		
		//static 맴버에 접근방법 -2:객체생성 후 주소.static 맴버
		TV tv1 = new TV();
		System.out.println(tv1.maker);//노란줄 :경고
	
		System.out.println("매개 값 "+tv1.getChannel());
		tv1.setChannel(10);//메소드를 필드에 간접접근하여 값을 변경
		System.out.println("매개변수 입력 "+tv1.getChannel());
		
		tv1.power=true;//바로 필드에 접근하여 값을 대입
		tv1.channel=20;
		System.out.println("바로 필드에 접근하여 값을 대입 :"+tv1.getChannel());
		System.out.println("메개값 "+tv1.getColor());
		tv1.setColor("black");
		System.out.println("매개변수 입력 "+tv1.getColor());
		int antena = tv1.getAntena();
		System.out.println(antena);
		TV tv2=new TV(100, 200, "pink", true, 37, 15, 20,"LG");
		System.out.println(tv2);//주소 만으로도 값이 출력되도록 하려면  toString()메서드 재정의
		//재정의하지 않으면 Object의 toString() 호출되어 "클래스 @16진수 해쉬 코드" 리턴
		String s="행복";//toString()메서드: 값을 리턴하도록 재정의함
		System.out.println(s);//주소만으로도 값이 출력
		
		
	}

}
