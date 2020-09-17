/*
 * java.lang.Math 클래스는 수학 계산에 사용할 수 있는 메서드를 제공한
 * 이 메서드는 모두  static 이므로 객체 생성없이 Math클래스로 바로 사용가능
 */
public class MathExample {

	public static void main(String[] args) {
		System.out.println(Math.abs(-5));//절대치		
		System.out.println(Math.ceil(5.3));//보다 큰 정수를 double형으로 
		System.out.println(Math.floor(5.3));//보다 작은 정수를 double형으로 
		System.out.println(Math.max(1,2));//두 수 중 큰 수
		System.out.println(Math.min(1,2));//두 수 중 작은 수
		System.out.println(Math.rint(5.3));//가장 가까운 정수를 double형으로
		System.out.println(Math.round(5.7));//반올림한 값을 long형으로
		System.out.println(Math.random());//0.0<=실수값<1.0
		
		//1~6 사이의 정수값을 랜덤
		int r=(int)(Math.random()*6)+1;
		System.out.println(r);
	
		//80~103 사이의 정수값을 랜덤(103-80+1=24)
		
		r= (int)(Math.random()*24)+80;
		System.out.println(r);
	}

}
