package polymorphism2;

public class C extends B{

	void c() {
		System.out.println("C에서 정의");
	}
	@Override
	void b() {
		System.out.println("C에서 b()재정의");
	}

	@Override
	void a() {
	System.out.println("C에서 a()재정의");
	}

	
	

}
//다형성★★★★★ object-> A a()추가->B a()재정의 b()추가->C a(),b()재정의 c()추가
