package salearraylist;
//★★★★★★★매우중요
/* 여러 메서드 중 단 1개라도 미완성된 추상 메서드가 있으면 추상 클래스가 된다. 
 * 추상 클래스:미완성 클래스
 * 1. 객체 생성 불가
 * 2. 추상 클래스를 부모 타입으로 선언 후 자식 객체 저장 가능
 */
abstract class Product { // 제품-부모 :자식의 공통된 특성
	// 부모의 필드: 자식의 공통된 속성
	final String Makecountry = "대한민국";
	int Price; // 제품 가격
	int bonusPoint; // 제품의 포인트

	// 생성자
	Product(int price) {// 가격(이 있는)을 매개값으로 하는 제품 생성
		super();
		this.Price = price;
		bonusPoint = (int) (price / 10.0);
	}

	// 미완성 메서드 :필드의 값을 출력
	abstract void show(); // 반드시 자식에서 재정의
	//부모object의 toString()을 그대로 사용:패키지명.클래스명16진수해쉬코드
}

class Tv extends Product {//Tv객체이지만 Product로 출력됨  
	final String maker = "삼성";

	Tv() {
		super(200);
	}

	@Override
	void show() {
		System.out.println(
				"TV 제조국:" + Makecountry + ", TV 제조사:" + maker + ", Tv 가격" + Price + ", TV 보너스포인트:" + bonusPoint);

	}

	@Override
	public String toString() {
		return "TV";
	}
	

}

class Computer extends Product {
	final String brand = "LG";

	Computer() {
		super(100);
	}

	@Override
	void show() {
		System.out.println("Computer 제조국:" + Makecountry + ", Computer 제조사:" + brand + ", Computer 가격:" + Price
				+ ", Computer 보너스포인트:" + bonusPoint);

	}
	@Override
	public String toString() {
		return "Computer";
	}
	
}

class Buyer {
	int money;
	int bonusPoint = 0;// 구매자의 보너스 점수
	// 구매자의 제품 목록 (배열: 반드시 같은 타입만 저장,크기고정됨)
	Product[] item = new Product[10];// 제품을 저장할 배열,기본값인 null로 ★ Product 배열을 통해서 상황에 따라서 자동형변환이 가능해진다.
	int i = 0;// 제품 item배열 추가 할 때마다 1씩 증가->필드

	Buyer(int money) {// 돈을 가진 구매자
		super();
		this.money = money;//this.생략불가:필드명과 매개변수 이름을 구분하기위해서
	}
	//Product겍체 또는 Product의 자식겍체-> Product로 자동형변환
	void buy(Product p) {
		if(money <p.Price) {//구매자가 가진 돈<제품 가격
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
		return;//해당 메서드(buy매서드) 종료
		}
		money -= p.Price;//구매자의 돈은 제품의 가격만큼 감소
		bonusPoint += p.bonusPoint;//구매자의 보너스 점수는 증가
		
		item[i++]=p;//배열목록에 제품 추가 후 i값 1증가
		System.out.println(p+"을(를) 구입하셧습니다.");

	}
	void summary() {//구매한 물품 정보 요약
		int sum=0;//구매한 물품 가격합계
		String itemlist=""; //지역변수는 초기화(기본값이 없다.),""는 length가 0인객체이다.
		for(int i=0;i<item.length;i++) {
			if(item[i]==null) break;//가장가까운 반복문을 빠져나감
			sum+=item[i].Price;
			
			itemlist += (i==0)?""+ item[i] :","+ item[i];//item[i]: 물품의 주소		
		}
		System.out.println("구입하신 제품의 총금액은 "+sum+"만원 입니다.");
		System.out.println("구입하신 제품은"+itemlist+"입니다.");
	}
	
}


class Audio extends Product {
	Audio() {
		super(50);
	}

	@Override
	void show() {
		System.out.println("Audio 제조국:" + Makecountry + ", Audio 가격:" + Price + ", Audio 보너스포인트:" + bonusPoint);

	}
	@Override
	public String toString() {
		return "Audio";
	}
}

/** 오류가 뜨는 이유 는 자식에서 재정의를 하지 않아서, 부모 클래스에서 생성자의 매개값이 자식클래스에는 없기때문에 **/

//1개의 파일에서 여러게의 클래스가 있다면 public 붙일 수 있는 클래스 단1개 
/*
 * ★★★★★★★ 반드시 public은 실행용, main()이 있는 클레스명=파일명 에만 붙일수 있다.
 */

/*
 * 미완성 product<= Tv+maker super(price=200)상속을 받음 ,Com+bard super(price=100)상속을
 * 받음 ,Audio
 * 
 * 
 */
public class PolyArgumentTestAbstractArrayList {

	public static void main(String[] args) {
		Buyer b=new Buyer(1000);//1000원 가진 구매자
		
		Tv tv = new Tv();
		Computer com=new Computer();
		Audio audio=new Audio();
		
		b.buy(tv);//"Tv를 구입 하셨습니다."
		b.buy(com);//"Computer를 구입 하셨습니다."
		b.summary();
		
	}
}
