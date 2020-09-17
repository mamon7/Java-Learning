package ifswitch;

import java.util.Scanner;

public class IfSwitchTest {

	public static void main(String[] args) {

		// 스캐너 객체 생성 후 참조변수 sc
		Scanner sc = new Scanner(System.in);

		// 사용자한테 "점수 입력" 출력하여 알려줌
		System.out.print("점수 입력:(0~100)");

		// 입력한 정수를 읽어들여 변수 n1에 대입
		int n1 = sc.nextInt();

		// 성적 산출-1 A B C D F 출력 - if문 이용
		if (n1 >= 90)
			System.out.println("A");
		if (n1 >= 80 && n1 < 90)
			System.out.println("B");
		if (n1 >= 70 && n1 < 80)
			System.out.print("C");
		if (n1 >= 60 && n1 < 70)
			System.out.println("D");
		if (n1 < 60)
			System.out.println("F");

		// 성적 산출-2 A B C D F 출력 -if~else if~...else if~...else 이용
		if (n1 >= 90)
			System.out.print("A");
		else if (n1 >= 80)
			System.out.print("B");
		else if (n1 >= 70)
			System.out.print("C");
		else if (n1 >= 60)
			System.out.print("D");
		else
			System.out.print("F");
		System.out.println("학점");

		// 성적 산출-3 A+ A B+ B C+ C D+ D F
		if (n1 >= 90) {
			if (n1 >= 95)
				System.out.println("A+");
			else
				System.out.println("A");
		} else if (n1 >= 80) {
			if (n1 >= 85)
				System.out.println("B+");
			else
				System.out.println("B");
		} else if (n1 >= 70) {
			if (n1 >= 75)
				System.out.println("C+");
			else
				System.out.println("C");
		} else if (n1 >= 60) {
			if (n1 >= 65)
				System.out.println("D+");
			else
				System.out.println("D");
		} else
			System.out.println("F");

		/***** switch()문- 여러 개중 하나만 선택하여 실행 *****/
		//()안에 들어갈 수 있는 것-정수, 문자, 문자열을 결과로 가지는 것
		//case 올수 있는 것-정수, 문자, 문자열 만(7, 'a', "행복")
		switch (1+1) {
		case 1:
			System.out.println("a"); break;
		case 2:
			System.out.println("b"); break;
		case 3:
			System.out.println("c"); break;
		default:System.out.println("나머지"); //break; 생략가능// 위의 case 이외
		}

		switch ('2'-1) {
		case '1':
			System.out.println('1'); break;
		case '2':
			System.out.println('2'); break;
		case '3':
			System.out.println('3'); break;
		default:System.out.println("나머지"); //break; 생략가능// 위의 case 이외
		}
		switch ("1") {
		case "1":
			System.out.println("1"); break;
		case "2":
			System.out.println("2"); break;
		case "3":
			System.out.println("3"); break;
		default:System.out.println("나머지"); //break; 생략가능// 위의 case 이외
		}
	}
}
