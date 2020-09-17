/*
 * 상속-정석310p
 * 상속? 기존의 클래스를 재사용하여 새로운 클래스를 작성
 * 코드의 재사용성을 높이고 코드의 중복을 제거하여
 * 프로그램의 생산성과 유지보수에 크게 기여
 * 316p-상속의 포함관계
 */

package cal;
// 상속의 클래스간의 포함관계
//(~은 ~을 가지고 있다.예:계산기는 더하기 기능을 가지고 있다.)를 이용하여 상속 구현☆☆☆☆☆☆
class Adder{
	private int cntAdd; //메서드가 호출될때마다 1씩 증가하는 카운터 변수
	
	int getCntAdd() {
		return cntAdd;
	}

	int add(int num1, int num2)	{
		cntAdd++;  //메서드가 호출될때마다 1씩 증가
		return num1 + num2;
	}
}

class Suber{
	private int cntSub; //메서드가 호출될때마다 1씩 증가하는 카운터 변수
	
	int getCntSub() {
		return cntSub;
	}

	int sub(int num1, int num2)	{
		cntSub++;  //메서드가 호출될때마다 1씩 증가
		return num1 - num2;
	}
}

class Multier{
	private int cntMul; //메서드가 호출될때마다 1씩 증가하는 카운터 변수
	
	int getCntMul() {
		return cntMul;
	}

	int mul(int num1, int num2)	{
		cntMul++;  //메서드가 호출될때마다 1씩 증가
		return num1 * num2;
	}
}

class Divider{
	private int cntDiv; //메서드가 호출될때마다 1씩 증가하는 카운터 변수
	
	int getCntDiv() {
		return cntDiv;
	}

	double div(int num1, int num2)	{
		cntDiv++;  //메서드가 호출될때마다 1씩 증가
		return (double)num1 / num2;//10/3=3.33333
	}
}

/*
 * 하나의 파일에 여러 개의 클래스를 만들 때 
 * public은 반드시 1개의 클래스에만 붙일 수 있다.
 * 파일이름은 public을 붙일 수 있는 클래스이름으로 한다.
 */
public class Calculator {
	//필드
	private Adder a;//정보은닉 => 캡슐화
	private Suber s;
	private Multier m;
	private Divider d;
	
	//생성자
	public Calculator() {//계산기 객체 생성할 때
		super();
		a=new Adder();//1.더하기 부품객체 생성
		s=new Suber();//2.빼기 부품객체 생성
		m=new Multier();//3.곱하기 부품객체 생성
		d=new Divider();//4.나누기 부품객체 생성

	}//5.계산기 객체가 생성됨
	public int add(int num1,int num2){
		return a.add(num1, num2);
	}
	public int sub(int num1,int num2){
		return s.sub(num1, num2);
	}
	public int mul(int num1,int num2){
		return m.mul(num1, num2);
	}
	public double div(int num1,int num2){
		return d.div(num1, num2);
	}
	
	public void showoperatingTimes()//실행횟수 출력
	{
		System.out.println("덧셈 횟수:"+a.getCntAdd());
		System.out.println("뺄셈 횟수:"+s.getCntSub());
		System.out.println("곱셈 횟수:"+m.getCntMul());
		System.out.println("나눗셈 횟수:"+d.getCntDiv());

		
	}
}











