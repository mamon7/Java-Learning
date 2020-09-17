package fruit2;

public class Buyer {
	int numofApple;//사과 바구니
	int money;//돈
	
	public Buyer(int numofApple, int money) {
		super();
		this.numofApple = numofApple;
		this.money = money;
	}
	//★메서드:구매자가 주체	
	void ask(Seller s){
		System.out.println(s.NAME+"님, 사과 1개 가격이 얼마예요?");
		s.answer();
	}
	void asknumofApple(Seller s){
		System.out.println(s.NAME+"님, 사과 몇 개가 남았어요?");
		s.getNumofApple();
	}
	void buy(Seller s, int money){//5000원
		numofApple+=s.sale(money);//판매자가 돈을 받고 판매를 한 결과 사과를 돌려받음
		this.money-=money;
	}
	
	void showBuy(){
		System.out.println("구매한 사과수:"+numofApple);
		System.out.println("현재 잔액:"+money);
	}
	
	
	
	
	

}
