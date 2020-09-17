package ifswitch;

import java.util.Scanner;

public class IfSwitchTest2 {

	public static void main(String[] args) {
		// 1.스캐너 객체 생성 후 참조변수 sc
		Scanner sc = new Scanner(System.in);
		// 사용자한테 "점수 입력" 출력하여 알려줌
		System.out.print("점수 입력:");
		// 입력한 정수를 읽어들여 변수 n1에 대입
		int n1 = sc.nextInt();
		// 성적 산출-1 :if문 이용(2.처리) A B C D F 출력(3.출력)
		if (n1 >= 90)
			System.out.println("A");
		if (n1 >= 80 && n1 < 90)
			System.out.println("B");
		if (n1 >= 70 && n1 < 80)
			System.out.println("C");
		if (n1 >= 60 && n1 < 70)
			System.out.println("D");
		if (n1 < 60)
			System.out.println("F");

		// 성적 산출-2 :if~else if~...else if~...else 이용(2.처리) A B C D F 출력(3.출력)
		if (n1 >= 90)
			System.out.println("A");
		else if (n1 >= 80)
			System.out.println("B");
		else if (n1 >= 70)
			System.out.println("C");
		else if (n1 >= 60)
			System.out.println("D");
		else
			System.out.println("F");

		// 성적 산출-3 :중첩 if문 이용(2.처리) A+ A B+ B C+ C D+ D F출력(3.출력)
		if (n1 >= 90) {
			if (n1 >= 95)
				System.out.print("A+");
			else
				System.out.print("A");
		} else if (n1 >= 80) {
			if (n1 >= 85)
				System.out.print("B+");
			else
				System.out.print("B");
		} else if (n1 >= 70) {
			if (n1 >= 75)
				System.out.print("C+");
			else
				System.out.print("C");
		} else if (n1 >= 60) {
			if (n1 >= 65)
				System.out.print("D+");
			else
				System.out.print("D");
		}else
			System.out.print("F");

		sc.close();
	}

}
