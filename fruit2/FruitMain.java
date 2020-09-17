package fruit2;

public class FruitMain {

	public static void main(String[] args) {
		//구매자 객체 생성
		Buyer b=new Buyer(0, 10000);
		
		//판매자1 객체 생성
		Seller s1=new Seller("판매자1", 100, 0, 1000);
		
		//판매자2 객체 생성
		Seller s2=new Seller("판매자2", 50, 0, 2000);
				
		//s1.numofApple=0;->정보 은익이기 때문에 불가함
		//구매자 주체
		b.ask(s1);	
		b.asknumofApple(s1);
		b.buy(s1, s1.getAPPLE_PRICE()*5);
		System.out.println();
		
		b.ask(s2);		
		b.asknumofApple(s2);
		b.buy(s2, s2.getAPPLE_PRICE()*2);
		System.out.println();
		
		System.out.println("구매자의 현재상황");
		b.showBuy();
		System.out.println("-----------------------");
		
		System.out.println("판매자1의 현재상황");
		s1.showSale();
		System.out.println("-----------------------");
		
		System.out.println("판매자2의 현재상황");
		s2.showSale();
		
	}

}
