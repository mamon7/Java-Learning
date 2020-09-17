package polymorphism;
//this.:자신의 주소 super.:부모의 주소
//this():생성자 안에서만 사용, 다른 생성자 호출 super():부모 생성자 호출
public class B extends A{
	
	@Override
	void a() {
		System.out.println("B에서 a() 재정의");
		
	}

	void b() {
		System.out.println("B에서 정의");
	}
}
