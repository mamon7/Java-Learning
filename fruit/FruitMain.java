package fruit;

public class FruitMain {

	public static void main(String[] args) {
		//구매자 객체 생성
		Buyer b=new Buyer(0, 10000);
		
		//판매자1 객체 생성
		Seller s1=new Seller(100, 0, 1000);
		
		//판매자2 객체 생성
		Seller s2=new Seller(50, 0, 2000);
		
		
		//구매자 주체
		b.buy(s1, 5000);
		b.buy(s2, 4000);
		
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
