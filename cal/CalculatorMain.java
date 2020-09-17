package cal;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// 계산기 객체 생성
		Calculator cal = new Calculator();

		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		String tmp=null;
		int num1=0,num2=0;
		while (true) {
			System.out.println("계산할 두 정수 입력(단,stop 입력하면 종료됨):");
			// 두 정수를 입력받아 num1,num2 에 대입
			
			tmp = sc.next();//10->"10","stop"
			if(tmp.equalsIgnoreCase("stop"))break;//가장 가까운 반복문 빠져나감
			
			 num1= Integer.parseInt(tmp);//"10"->10정수
			
			 num2 = sc.nextInt();

			System.out.println("연산자 입력(+-*/):");
			
			String opr = sc.next();
		
			switch (opr) {//정수, 문자열,문자
			case "+":
				System.out.println("더하기:" +cal.add(num1, num2));
				break;
			case "-":
				System.out.println("뺴기:" + cal.sub(num1, num2));
				break;
			case "*":
				System.out.println("곱하기" + cal.mul(num1, num2));
				break;
			case "/":
				System.out.println("나누기" + cal.div(num1, num2));
				break;
			
			default:
				System.out.println("잘못된 연산자입니다.");
			
			}
		} // 반복문 끝
		cal.showoperatingTimes();
		System.out.println("*****계산 종료*****");
	}

}
