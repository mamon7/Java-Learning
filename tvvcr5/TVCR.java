package tvvcr5;


abstract class Electronics{
	final String country="korea";
	String maker;
	boolean power;
	abstract void power();
}
abstract class TV extends Electronics{
	int channel;

	public TV(String maker) {
		super();
		this.maker = maker;
	}
	public TV() {super();}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	@Override
	void power() {
		power= !power;
		if(power == true)System.out.println("TV 전원 ON");
		else System.out.println("TV 전원 OFF");
	}
	
	
	
}
 class VCR extends Electronics{
void play() {
	System.out.println("재생");
}
void stop(){
	System.out.println("멈춤");
}
@Override
void power() {
	power= !power;
	if(power == true)System.out.println("TVCR 전원 ON");
	else System.out.println("TVCR 전원 OFF");
}
 }
 
public class TVCR extends TV {
	private VCR v;
	
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
