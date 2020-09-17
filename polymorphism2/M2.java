package polymorphism2;

//static:겍체 생성없이 바로 메모리에 올라옴
//다형성 ★★★★★
public class M2 {
	void w(A a) {
		if (a instanceof C) {
			a.a(); ((C) a).b(); ((C) a).c();
			
		}
		else if(a instanceof B) {
			a.a();((B) a).b();
			
		}else  a.a();
	
	}
	

	public static void main(String[] args) {// 매서드
	A a=new A();
	
	B b=new B();
	
	C c=new C();
	
	M2 m=new M2();
	
	m.w(a);
	System.out.println();
	m.w(b);
	System.out.println();
	m.w(c);
}
}
