package math;
/*
 * static 멤버:객체를 생성하지 않고 바로 메모리에 올라옴.
 * 			1. 클래스이름으로 접근(권장)  2. 객체의 주소로 접근
 * instance(=객체) 멤버:static 없다. 객체 생성 후 메모리에 올라옴. 
 *                     객체의 주소로 접근 
 */
/*
 * [static 메서드]
   조건:메소드()가 필드 중 인스턴스 변수를 필요로 하지 않고 매개변수만을 필요로 한다.
   조건을 만족하면=>메소드 앞에 static 붙임
	
   static 필드나 메소드는 객체를 생성하지 않고도 바로 메모리에 올라간다.
*/
public class Math {
	//속성=>필드
	static final double PI=3.14;
	
	//생성자
	private Math(){}//외부에서 접근 불가하여 객체 생성을 차단시킴 
	
	//기능=>메서드
	static int add(int...a){ //...가변인수(정석287) 배열		
		int i, hap=0;
		for(i=0;i<a.length;i++) {
			hap+=a[i];
		}		
		return hap;
	}
	
	static int add(int a, int b){
		return a+b;
	}
	
	static double add(double a, double b){
		return a+b;
	}
	
	static int multi(int...a){//...가변인수(정석287) 배열	
		int i, gol=1;
		for(i=0;i<a.length;i++) {
			gol*=a[i];
		}		
		return gol;
	}
	
	static double area(int r){//반지름
		return r*r*PI;//원의 넓이
	}
	
	
}