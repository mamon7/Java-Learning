package box;
//클래스 맴버=static 맴버:클래스 이름으로 접근하므로
//인스턴스 맴버(static 없다.):객체 생성 후 주소로 접근//객체
//생성자는 맴버에 들어가지않음
//맴버는 필드와 매소드에만 속함
public class Box {
	
	//속성 => 필드[초기화되는 순서 1.기본값 2.명시적 초기화 3.생성자로 초기화 4.초기화 블럭
	final String maker;// 이클립스가 파이널 값은 생략해버림..//생성자를 통해 최초의 1번만 초기화=>변경불가
	int width=100;//0->100->300->초기화 블럭
	int heigth;
	private final String content = "초콜렛과 반지";// 정보은닉=> 캡슐화
	public static int money=add();//1~1000까지의 합//0->55->생성자=> 500500
	
	//초기화 블럭-static 초기화 블럭(클래스 변수(=static 필드)를 초기화)
	static {
		//복잡한 연산식과 같은 복잡한 초기화를 할 때 사용, 메서드 호출
		int i;
		int hap=0;
		for(i=1;i<=1000;i++) {
			hap+=i;
		}
		money=hap;
	}
	//초기화 블럭-인스턴스 초기화 블록:모든 생성자에서 공통적으로 수행되어야 하는 실행문 =>간결
	{
		width++;
		heigth+=10;	
	}
	static int add(){
		int hap=0;
		for(int i=1;i<=10;i++) {
			hap+=i;
		}
		return hap;//55
	}
	
	// 기본 생성자 public Box(){super();} ,생성자는 void , int 등의 돌려주는 타입이 없다.
	public Box(String maker) {
		super();
		this.maker = maker;
		/*
		 * width++; heigth+=10;
		 */
	}


	
	public Box(String maker, int width ) {
		/*
		 * super();//생성자 안에서 사용, 반드시 첫줄 this.maker = maker; this.width = width;
		 */
		this( maker,  width, 500);//오버로딩된 매개변수가 더 많은  다른 생성자를 호출
	}

	public Box(String maker, int width, int heigth) {
		super();//생성자 안에서 사용, 반드시 첫줄
		this.maker = maker;
		/*
		 * width++; heigth+=10;
		 */
	}
	
	/*
	 * @Override public String toString() { return "Box [maker=" + maker +
	 * ", width=" + width + ", heigth=" + heigth + ", content=" + content + "]"; }
	 */


	// 기능=>매서드
	
	@Override
	public String toString() {
		return "Box [maker=" + maker + ", width=" + width + ", heigth=" + heigth + ", content=" + content + "]";
	}

	public int getWidth() {
		return width;
	}

	

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public String getContent() {
		return content;
	}

	/*
	 * public void setContent(String content) { this.content = content; }
	 */

	public String getMaker() {
		return maker;
	}

}
