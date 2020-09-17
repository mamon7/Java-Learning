package math;
import static java.lang.Math.*;
;public class Mathtest {

	public static void main(String[] args) {
		int result=Math.add(10, 20);
		System.out.println("10+20="+result);
		
		System.out.println("반지름이 3인 원의 넓이="+Math.area(3));
		
		System.out.println("***가변변수 더하기 테스트***");
		System.out.println("10="+Math.add(10));
		System.out.println("10+20+30="+Math.add(10, 20, 30));
		System.out.println("10+20+30+40+50="+Math.add(10, 20, 30, 40, 50));
		
		System.out.println("***가변변수 곱하기 테스트***");
		System.out.println("10="+Math.multi(10));
		System.out.println("10*20*30="+Math.multi(10, 20, 30));
		System.out.println("10*20*30*40*50="+Math.multi(10, 20, 30, 40, 50));
				
		System.out.println("-3의 절대값="+abs(-3));//java.lang.Math.생략가능
		System.out.println("2와 8 중의 큰수="+java.lang.Math.max(2, 8));
	
		
	}
}
