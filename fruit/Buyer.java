package fruit;

public class Buyer {
	int numofApple;//사과 바구니
	int money;//돈
	
	public Buyer(int numofApple, int money) {
		super();
		this.numofApple = numofApple;
		this.money = money;
	}
	
	//★메서드:구매자가 주체
	void buy(Seller s, int money){//5000원
		numofApple+=s.sale(money);//판매자가 돈을 받고 판매를 한 결과 사과를 돌려받음
		this.money-=money;
	}
	
	void showBuy(){
		System.out.println("구매한 사과수:"+numofApple);
		System.out.println("현재 잔액:"+money);
	}
	
	
	
	
	

}
