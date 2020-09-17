/*
 * 생성자(필드를 초기화)와 초기화 블럭은 상속되지 않는다.
 * 맴버(필드와 매서드)만 상속된다.
 * 자손 클래스의 맴버의 수>=조상 클래스의 맴버수
 */

package tvvcr;

class TV{
	boolean power;
	int channel;
	void power() {
		power =!power;
		if(power==true)System.out.println("TV 전원  on");
		else System.out.println("TV 전원  off");
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
class VCR{
	//기본생성자
	boolean power;
	int channel;
	void power() {
		power =!power;
		if(power==true)System.out.println("VCR 전원  on");
		else System.out.println("VCR 전원  off");
	}
	//실질적인 기능
	void play() {System.out.println("재생");}
	void stop() {System.out.println("멈춤");}
	void rew() {System.out.println("되감기");}
	void ff() {System.out.println("빨리감기");}
}
public class TVCR extends TV{//TV(부모) +VCR(포함관계). 자바는 단일 상속(부모 1개)
	//TV(부모)의 멤버(필드,메서드)만 상속. (생성자와 초기화 블럭은 상속되지 않는다.)
	private	VCR v;//필드 -포함관계
public TVCR() {//TV()생성자를 호출 -> TV의 부모인 object 객체 생성->TVCR 객체 생성
	super();//VCR 객체 생성
	v=new VCR();//마지막으로 VCR을 포함하는 TVCR 객체 생성
	v.power();
}
@Override//재정의 
void power() {	
	power =!power;
	if(power==true)System.out.println("TVCR 전원  on");
	else System.out.println("TVCR 전원  off");
}
public void play() {v.play();}
public void stop() {v.stop();}
public void rew() {v.rew();}
public void ff() {v.ff();}
}
