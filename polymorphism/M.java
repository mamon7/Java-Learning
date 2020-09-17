package polymorphism;

//static:겍체 생성없이 바로 메모리에 올라옴
//다형성 ★★★★★
public class M {
	static void w(A a) {// 부모는 자식겍체를 받아들임.단 자식 겍체를 받아 들일때 부모타입으로 변환되어 받아들인다.
		a.a();// 부모의 정의된 맴버(메소드,필드)들만 사용가능
		// a.b();
		// a.c();
	}

	static void w2(A a) {// 부모는 자식겍체를 받아들임.단 자식 겍체를 받아 들일때 ☆부모타입으로 변환되어 받아들인다.
		// if~else if~...else:1개만 선택되어 실행
		// ★instanceof 사용하여 가장 마지막 자식부터 걸러낸다.
		if (a instanceof C) {// ★★★instanceof 연산자: a 가 참조하는 객체가 c객체이가나 c자식겍체이면 참
			a.a();// 가장 마지막 C에서 재정의된 매서드 호출
			((C) a).b();
			((C) a).c();// <=위의 C자리에 A를 넣으면 예외 발생: A객체를 C객체로 만들려하여 예외발생함.
		} else if (a instanceof B) {
			a.a();// B에서 재정의된 매서드 호출
			((B) a).b();
		} else
			a.a();// A객체 하나만 참이 되어 실행됨

	}

	/**
	 * A a() ^ ★w(A a) => w2(A a)★ B a() b() ^ C a() b() c()
	 * 
	 * 
	 **/

	public static void main(String[] args) {// 매서드
		A a = new A();// 기본생성자 호출 ->객체 생성
		w2(a);
		System.out.println();//구분줄
		B b = new B();
		w2(b);// b:A의 자식겍체의 주소
		System.out.println();//구분줄
		C c = new C();
		w2(c);// c:A의 자식겍체의 주소
		System.out.println();//구분줄
		/********************/
		B b2 =new C();//부모<=자식 (자동 부모타입 변환) a() b() c()
		b2.a();  b2.b();  
		if(b2 instanceof C)((C)b2).c();
		System.out.println();
		A a2=new B();//B객체
		a2.a();
		//C객체:문법적 오류는 없지만 실행시 예외발생->P/G 강제 종료
		//if절에 instanceof를 사용하는 이유는 강제 형변환시 예외발생이 일어나지않게 해준다. 
		System.out.println();
		if(a2 instanceof C)((C)a2).c();//C객체:문법적인 오류X  
		else if(a2 instanceof B)((B)a2).b();
		
		System.out.println("다형성 끝");
	}

}
