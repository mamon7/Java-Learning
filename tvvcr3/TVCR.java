/* 정석312p-상속
 * 생성자(필드를 초기화)와 초기화 블럭은 상속되지 않는다.
 * 멤버(필드와 메서드)만 상속된다.
 * 자손 클래스의 멤버의 수>=조상 클래스의 멤버수
 */

/*
 * 문제점:자식 클래스에서 power()를 재정의하지 않아도 오류 발생안함
 *       그런데 부모입장에서는 반드시 power()를 재정의해서 사용하기를 원함
 */

/*
 * 추상 클래스:추상 메서드가 1개라도 있으면 추상 클래스가 됨.
 *            객체 생성 불가하나 부모 역할은 가능함
 *            반드시 자식 클래스에서 추상 메서드를 재정의해줘야 함(안하면 오류)
 */
package tvvcr3;
abstract class Electronics{//전자제품-추상클래스
	boolean power;
	
	abstract void power();//미완성 메서드
}

class TV extends Electronics{		
	int channel;
	
	//기본생성자TV(){super();}
	
	@Override//부모의 미완성된 메서드를 자식이 반드시 재정의해야 함
	void power() {
		power = !power;
		if(power==true) System.out.println("TV 전원 on");
		else System.out.println("TV 전원 off");		
	}	
	
	void channelUp() { channel++; }	
	void channelDown() { channel--; }
}

class VCR extends Electronics{
	//기본생성자
	
	@Override//부모의 미완성된 메서드를 자식이 반드시 재정의해야 함
	void power() {
		power = !power;
		if(power==true) System.out.println("VCR 전원 on");
		else System.out.println("VCR 전원 off");
	}
	
	//실질적인 기능
	void play() {System.out.println("재생");	} 
	void stop() {System.out.println("멈춤");}
	void rew() {System.out.println("되감기");}
	void ff() {System.out.println("빨리감기");}
}

public class TVCR extends TV{//TV(부모) + VCR(포함관계). 자바는 단일상속(부모 1개)
//TV(부모)의 멤버(필드,메서드)만 상속. (생성자와 초기화 블럭은 상속되지 않는다.)
	
	private VCR v; //필드-포함관계
	
	public TVCR() {
		super();//TV()생성자를 호출->TV의 부모인 Object 객체 생성->TV객체생성
		v=new VCR();//VCR 객체 생성
	}	            //마지막으로 VCR을 포함하는 TVCR 객체 생성	

	@Override//그냥 클래스에 맞게 재정의 
	void power() {
		power = !power;
		if(power==true) System.out.println("TVCR 전원 on");
		else System.out.println("TVCR 전원 off");
	}
	
	public void play() { v.play(); }	
	public void stop() { v.stop(); }	
	public void rew() {	v.rew(); }	
	public void ff() { v.ff(); }	
}
