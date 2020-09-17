package tvvcr4;

abstract class Electronics {// 전자제품-추상클래스 :추상매서드가 가 1개라도 있으면
	// Object가 부모로 있음
	// 전자제품을 만든나라와 회사

	final String country = "한국";// 만든 나라 "한국" 값이 고정
	String maker;// 만든 회사
	boolean power;

	// 기본생성자 Electronics(){super();} :컴파일러가 생성자 없으면 자동 삽입

	public abstract void power();// 추상메스드=미완성 메서드
	// public void power(){}
	// 중괄로 자체가 완성된 매서드
}

class TV extends Electronics {
	/*
	 * 있다고 생각해라 boolean power;
	 * 
	 * void power(){ power = !power; }
	 */

	// 기본생성자 TV(){super();} :컴파일러가 생성자 없으면 자동 삽입

	// 매개변수가 있는 생성자,생성자 반환타입 없음
	TV(String maker) {//매개변수 있음"삼성"
		super();
		this.maker = maker;
	}
	//기본생성자 아님
	TV(){super();}
	
	
	int channel;

	void channelUp() {// void:반환값 없음,():매개변수 없음
		channel++;
	}

	void channelDown() {// void:반환값 없음
		channel--;
	}

	// power() 재정의
	// 재정의 방법:마오 -> 소스->매서드 대체/구현->재정의 할 메소드
	@Override // 반드시 재정의 -미완성된 추상매서드는 자식 클래스에서 반드시 재정의
	public void power() {
		power = !power;
		if (power == true)
			System.out.println("TV 전원 on");
		else
			System.out.println("TV 전원 off");
	}
}

class VCR extends Electronics {
	/*
	 * 있다고 생각해라 boolean power;
	 * 
	 * void power(){ power = !power; }
	 */
	// 실질적 기능
	void play() {// 매소드
		System.out.println("재생");
	}

	void stop() {
		System.out.println("멈춤");
	}

	@Override // 반드시 재정의-미완성된 추상매서드는 자식 클래스에서 반드시 재정의
	public void power() {
		power = !power;
		if (power == true)
			System.out.println("VCR 전원 on");
		else
			System.out.println("VCR 전원 off");

	}

}

/*
 * 1개의 파일에 여러 클래스가 있다면 반드시 public은 1개의 클래스에만 붙일 수 있다. (public 붙일 수 있는 클래스명=파일명)
 */
public class TVCR extends TV {// TV(부모1)+VCR(포함관계)기능을 합친 것
	private VCR v;// 포함관계,정보은익 (캡슐화)
//String maker;
	// 생성자 중요
	public TVCR(String maker) {// "삼성"
		super();// 매개변수가 없는 TV() 생성자 호출
		v = new VCR();
		this.maker=maker;
	}

	@Override // 그냥 필요에 따라 재정의
	public void power() {
		power = !power;
		if (power == true)
			System.out.println("TVCR 전원 on");
		else
			System.out.println("TVCR 전원 off");

	}

	public void play() {
		v.play();
	}

	public void stop() {
		v.stop();
	}

	public void show() {// 필드의 값 출력(만든나라 ,만든회사,전원 ,채널)
		System.out.println("TVCR 만든나라:" + country + ", 만든회사:" + maker + ", 전원:" + power + ", 채널" + channel);

	}

}
