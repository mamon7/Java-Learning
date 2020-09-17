package tv2;

public class TV {
	//1. 속성=>필드(=멤버변수)
	String maker;//제조회사
	
	double width;//가로
	double height;//세로
	
	boolean power;//전원
	int channel;//채널
	int volume;//볼륨
	
	
	//2. 생성자:반드시 존재-기본 생성자:기본값으로 필드에 값을 주어 객체 생성
	//public TV(){}
	
	//3. 기능=>메서드
	@Override//메서드 오버라이딩(=부모의 메서드를 덮어쓰기)
	public String toString() {
		return "TV [제조회사=" + maker + ", 가로=" + width + ", 세로=" + height + ", 전원=" + power + ", 채널="
				+ channel + ", 볼륨=" + volume + "]";
	}

//get~메서드():필드의 값을 얻을 때
	public String getMaker() {
		return maker;
	}

//set~메서드():매개변수(=인수)의 값으로 필드를 변경할 때
	public void setMaker(String maker) {
		this.maker = maker;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public boolean isPower() {//리턴타입=반환타입 boolean 때
		return power;
	}


	public void setPower(boolean power) {
		this.power = power;
	}


	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
