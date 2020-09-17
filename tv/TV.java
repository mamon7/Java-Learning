package tv;
//라이브러리용-main() 없다.
/*
 * 접근제한자(4가지)
 * 1.public:클래스(같은 패키지는 public 없어도 자동import,
 *                 다른 패키지에서는 public 있어야 import 가능) 
 *          메서드, 필드(어디서든지 접근 가능)
 *          
 * 2.default(기본값)=접근제한자 없는 상태:같은 패키지에서만 접근 가능
 */
public class TV {//public 있고 없고	
	//1.필드=멤버변수:클래스의 속성
	//static:공유-객체 생성없이 바로 메모리에 올라옴.
	//final:값 변경 불가(static에 final 붙이는 이유:공유용이므로 값 변경하면 안됨)
	public static final String MAKER="대한민국"; //static final:상수, 대문자로 
	
	public final String color;//클래스 타입의 기본값 null, final:값 변경 불가
	public boolean power;//boolean 기본값 false
	public int channel;//기본값 수-정수 0, 실수 0.0
	
	//2.클래스에는 반드시 생성자가 존재해야 함(필드와 메서드 옵션)
	/*
	 * 생성자 역할:필드에 초기값을 주어 객체 생성
	 *            만약 구체적인 초기값이 없을 경우, 기본값으로 필드를 채워줌
	 * 
	 * 구체적인 생성자가 없을 때 컴파일러가 컴파일 이전에 
	 * 자동으로 기본 생성자를 삽입 후 컴파일함
	 * 기본생성자  public TV(){}
	 * 
	 * 모든 생성자의 {}안에 super(); 첫줄에 없다면 컴파일러가 
	 * 컴파일 이전에 super();을 첫줄에 자동 삽입
	 * 
	 * 생성자 오버로딩 가능
	 */
	
	public TV(){//인수가 없는 생성자
		super();//부모의 생성자를 호출->부모(Object) 객체 생성
		//자식 객체의 필드에 값을 채움
		color="black";//final 필드 값을 변경 불가
		//channel=10;
	}	
	
	public TV(boolean power, int channel) {//(지역변수이자 매개변수)
		super();
		color="red";//이 값을 변경 불가
		this.power = power;
		this.channel = channel;//this:자기자신의 주소
		//클래스의 필드= 매개변수
		//(이름이 같으면 구별하기 위해 필드앞에 this.)
	}
	
	public TV(String color2, boolean power, int channel) {
		super();
		color = color2;//this 생략 가능? 이름이 달라서
		this.power = power;
		this.channel = channel;
	}

	//3.메서드:클래스의 기능
	public void show(){
		System.out.println("색="+color+", 파워="+power+", 채널="+channel);
	}
	
	public void power(){
		power = !power;//참<->거짓
		if(power==true) System.out.println("TV 전원 켜짐");
		else System.out.println("TV 전원 꺼짐");
	}
	
	public void channelUp(){
		if(this.power==true) {//this.생략 가능
			if(0<=this.channel && this.channel<=100) this.channel++;
			if(this.channel==101) this.channel=1;
		}
		else System.out.println("전원을 켜세요~");
	}
		
	public void channelDown(){
		if(power==true) {
			if(1<=channel && channel<=100) channel--;
			if(channel==0) channel=100;
		}
		else System.out.println("전원을 켜세요~");
	}
}
