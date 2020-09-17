package fruit;
//판매자
public class Seller {
	int numofApple; //사과수 100-5=95
	private int money; //돈 
	final int APPLE_PRICE;//final:최초의 1번은 구체적 초기화
	
	public Seller(int numofApple, int money, int aPPLE_PRICE) {
		super();
		this.numofApple = numofApple;
		this.money = money;
		APPLE_PRICE = aPPLE_PRICE;
	}
	
	int sale(int money) {//5000
		int n=money/APPLE_PRICE;//5000/1000=5 몫
		numofApple-=n;//numofApple=numofApple-n;
		this.money+=money;//this.money=this.money+money;
		return n;//사과수5
	}
	
	void showSale(){
		System.out.println("판매 후 남은 사과:"+numofApple);
		System.out.println("판매 수익:"+money);
	}
	
	
	
	
	
	
}
