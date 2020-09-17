// 라이브러리용
package tv3;

/* 접근제한자 (4가지)      class앞 (public만 가능), 필드 앞, 매서드 앞, 생성자 앞 (protected만 안됨)
 * 접근제한자:  public 클래스- 다른 패키지에서도  import 할 수 있다.
 *  				 클래스- 같은 패키지에서   import 할 수 있다.(자동 import)
 *		      protected- 같은 패키지에서는 접근가능, 다른 패키지에서는 자식만 접근 가능  
 *  		    기본값-같은 패키지에서만 접근가능
 *  	   	  private-같은 클래스안에서만 접근 가능	
 */		

class TV {// 설계도->라이브러리용(main() 없다.)
	// 1. 속성 => 필드 = 맴버변수
	// 가로,세로,색,전원,채널,볼륨
	double width;
	double height;
	String color;
	boolean power;
	int channel;// 0 ->10
	int volume;
	private int antena;// 같은 클래스안에서만 접근 가능.정보은닉 =>캡슐화
					//같은 클래스안의 매서드를 통해 간접접근 만 허용	
	final String maker ;
	//final: 최초의 1번만 반드시 초기화. 그 이후 값 변경 불가
	final static String CONTRY="한국";//final :대문자 권장
	// 2. 생성자=> 반드시 존재. 필드에 값을 채워 객체 생성
	// 기본생성자:TV(){} =>TV(){super();}
	TV(){
		super();//없으면 생성자  첫줄에 컴파일러가 자동 삽입
		maker="삼성";
		// 나머지 필드는 기본값으로 채워짐
	}
	
	
	TV(double width, double height, String color, boolean power) {
		//super();//부모 생성
		/*
		 * this.width = width; this.height = height; this.color = color; this.power =
		 * power; maker="LG";
		 */
		//나머지 필드는 기본값으로 채워짐
		this(width, height, color, power,0,0,0,null);//오버로딩된 매개변수가 더 많은 다른 생성자 호출, 반드시 생성자 안에서만 사용가능
		//사용이유 ? 좀더 간략하게 하기 위해서~
		}


	TV(double width, double height, String color, boolean power, int channel, int volume, int antena, String maker) {
		super();//부모 객체 생성
		this.width = width;//this.:필드와 매개변수가 같은 이름이라 구분위해
		this.height = height;//this:자신의 주소, static 맴버에서 사용 불가
		this.color = color;
		this.power = power;
		this.channel = channel;
		this.volume = volume;
		this.antena = antena;
		this.maker = maker;
		//생성자는 static 없는 필드에만 값을 채움
	}

	// 3. 기능 => 메서드
	 @Override //어너태이션 역할:부모의 리턴타입과 메서드명(매개변수) 반드시 같은지 확인해줌
	public String toString() {//재정의: 반드시 접근제한자보다 넓은 범위로 설정 => 규칙 
		return "TV [width=" + width + ", height=" + height + ", color=" + color + ", power=" + power + ", channel="
				+ channel + ", volume=" + volume + ", antena=" + antena + ", maker=" + maker + "]";
	}
	String getMaker() {
		return maker;
	}

	/*
	 * void setMaker(String maker) { this.maker = maker; }
	 */

	
	 
	double getWidth() {
		return width;
	}


	void setWidth(double width) {// 5.8
		this.width = width;//같은 클래스 내에서 이기 때문에 같은 객체 안에 있기 때문에  this.사용가능 , width 딱 한개 이기 때문에
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	boolean isPower() {
		return power;
	}

	void setPower(boolean power) {
		this.power = power;
	}

	int getChannel() {
		return channel;
	}

	void setChannel(int channel) {
		this.channel = channel;
	}

	int getVolume() {
		return volume;
	}

	void setVolume(int volume) {
		this.volume = volume;
	}

	int getAntena() {// private antena에 접근가능
		return antena;
	}

	void setAntena(int antena) {
		this.antena = antena;
	}

}
