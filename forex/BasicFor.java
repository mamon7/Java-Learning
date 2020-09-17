package forex;
//import java.lang.*;//이클립스가 자동으로 삽입
import java.util.Scanner;
 
/*
 * 클래스 2가지
 * 1.실행용:main() 있어서 프로그램이 실행
 * 2.라이브러리용:main() 없어서 참조용 (import 해서 참조)
 */

public class BasicFor {

	public static void main(String[] args) {//프로그램의 시작(메모리에 실행)
	
		/***** 반복문 사용안하면 **********************/
		System.out.println("오늘도 평화를...!!");
		System.out.println("오늘도 평화를...!!");
		System.out.println("오늘도 평화를...!!");
		System.out.println("오늘도 평화를...!!");
		System.out.println("오늘도 평화를...!!");
		
		/***키보드로 입력받은 수, 단어, 문장을 읽어들이는 법****/
		Scanner sc=new Scanner(System.in);//키보드로부터 읽어들이려면
		System.out.print("단어 입력:");//커서가 옆에 오도록 ln 삭제
		String s=sc.next();//단어 읽어들이는 메서드-구분자(엔터,스페이스바,탭)는 무시
		//next():버퍼로부터 단어를 읽으들여 문자열 객체(단어)를 생성
		
		System.out.println(s);//s(단어객체의 주소)가 참조하는 값이 출력
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
		
		//★★변화하는 실행문을 반복 : '반복문'을 사용하려면 반드시 '일정한 규칙성'이 있어야 한다.
		/***** 반복문 for()사용하면**********************/
		/*
		 * for(1.변수 초기화(최초의1번만);2.조건문(참/거짓);4.변수 증가 또는 감소){
		 *    3.조건문이 참이면 반복할 실행문;을 실행
		 * }
		 * 3.조건문이 거짓이면 실행하지 않고 for문을 빠져나옴
		 */
		int i;//main()에서 변수 선언->main() 끝(=프로그램이 끝)나면 메모리에서 소멸
		for(i=1;i<=5;i++) { //i:카운팅(수를 세다) (i)6<=5
			System.out.println("반복문 사용:"+s);//5번 출력
		}
		//조건문이 거짓이면 for문을 빠져나옴
		System.out.println("i="+i);//6
		
		System.out.println();//구분위한 빈줄
		
		for(i=1;i>=-3;i--) {//1 0 -1 -2 -3
			System.out.println("반복문 사용:"+s);
		}
		System.out.println();//구분위한 빈줄
		
		for(int j=1;j<=5;j++) { //j:1 -> 2 ...->5(참)->6(거짓)
			System.out.println("행복");//5번 출력
		}
		System.out.println();//구분위한 빈줄
		
		for(i=1;i<=5;i++) {//i:1 -> 2..->5
			System.out.print(i+" ");//출력결과 1 2 3 4 5 
		}
		System.out.println("\nfor문 빠져나온 후 i="+i);
		 
		for(i=5;i>=1;i--) {  //i : 5 4 3 2 1 출력
			System.out.print(i+" ");
		}
		System.out.println("\n");//커서를 아래로->구분위한 빈줄
		
		//i++    ++i  :  i=i+1
		for(i=2;i<=10;i+=2) { //i+=2    i=i+2
			System.out.print(i+" ");//출력결과 2 4 6 8 10 (2씩 증가)
		}
		System.out.println();//커서를 아래로
		
				
		//10(초기값) 8 6 4 2출력  2씩 감소
		for(i=10;i>=2;i-=2) {
			System.out.print(i+" ");
		}
		System.out.println();//커서를 아래로
		
		int j;//변수 선언
		for(j=10;j<=14;j++) {// (;조건문;) 1.몇번? 초기값 중요하지 않음
			System.out.print("1 ");//반복해서 실행할 부분
		}//10 11 12 13 14
		
		System.out.println("\nj="+j);//커서를 아래로		
		
		for(j=1;j<=10;j++) { //(;조건문;) 1.몇번? 2.반복실행할 부분에도 영향을 줌
			System.out.print(j+" ");//1~10출력
		}
		System.out.println();//커서를 아래로
		
		//문제 1 3 5 7 9 출력
		for(j=1;j<=9;j=j+2) { //j+=2
			System.out.print(j+" ");
		}
		System.out.println();//커서를 아래로
		
		//문제 100 97 94 91 88 출력
		for(j=100;j>=88;j=j-3) {
			System.out.print(j+" ");
		}
		System.out.println();//커서를 아래로
		
		//2의 제곱수:2 4=2*2 8=4*2 16=8*2...
		int hap=0;
		System.out.print("1~100사이에서 2의 제곱수만 더한 결과:");
		for(i=2;i<=100;i*=2) {
			hap+=i; //hap=hap+i;
		}
		System.out.println(hap);
		
		/********* 1~입력받은 정수까지 더한 결과 *********/
		System.out.println("1~당신이 입력한 정수까지 더하는 프로그램");
		System.out.print("마지막 정수 입력:");
		int lastnum = sc.nextInt();//5엔터
		
		hap=0;
		for(i=1;i<=lastnum;i++) {
			hap+=i;
		}
		System.out.println("1~"+lastnum+"까지 더한 결과="+hap);
		
		/*********
		 * firstnum(시작값)~lastnum(끝값) 2개의 입력받은 정수까지 더한 결과
		 *********/
		System.out.print("시작값(정수) 입력:");
		int firstnum = sc.nextInt();
		System.out.print("마지막 정수 입력:");
		lastnum = sc.nextInt();
		
		hap=0;
		for(i=firstnum;i<=lastnum;i++) {
			hap+=i;
		}
		System.out.println(firstnum+"~"+lastnum+"까지 더한 결과="+hap);
		//시작값~마지막 값까지 더한 합=?
		
		System.out.print("시작값(정수) 입력:");
		firstnum = sc.nextInt();
		System.out.print("마지막 정수 입력:");
		lastnum = sc.nextInt();
		System.out.print("증가되는 값 입력:");
		int increnum = sc.nextInt();//2
		
		hap=0;
		for(i=firstnum;i<=lastnum;i+=increnum) {
			hap+=i;
		}
		System.out.println(firstnum+"~"+lastnum+"까지 "+increnum+"씩 증가한 수를 더한 합="+hap);
		//시작값~마지막 값까지 몇씩 증가한 수를 더한 합=?
		
		for(i=1;i<=10;i++) {//10번 반복
			System.out.println(i);//1~10 출력
		}
		hap=0;
		for(i=1;i<=10;i++) {//10번 반복 (1~10참, 11거짓)
			hap=hap+i;//0+1+2+...+10
		}
		System.out.println(hap);//55
		
		hap=0;
		for(i=1;;i++) {			
			hap=hap+i;
			if(hap>100) break;
		}
		System.out.println(i+","+hap);
		
		/****** 구구단 중 5단만 출력 ******/
		System.out.println("5 X" + 1 + "=" + (5 * 1));
		System.out.println("5 X" + 2 + "=" + (5 * 2));
		System.out.println("5 X" + 3 + "=" + (5 * 3));
		System.out.println("5 X" + 4 + "=" + (5 * 4));
		System.out.println("5 X" + 5 + "=" + (5 * 5));
		System.out.println("5 X" + 6 + "=" + (5 * 6));
		System.out.println("5 X" + 7 + "=" + (5 * 7));
		System.out.println("5 X" + 8 + "=" + (5 * 8));
		System.out.println("5 X" + 9 + "=" + (5 * 9));
		
		System.out.println();//구분위한 빈줄
		
		for(i=1;i<=9;i++) {//9번 반복, 반복실행
			System.out.println("5 X" + i + "=" + (5 * i));
		}
		
       // System.out.println();//구분위한 빈줄
		
		/***** 정석158-초기화 여러개, 증감식 여러개 가능 ******/
		int k;
		for(i=1,k=10;k>=1 ;i++,k--) {//10번반복
			System.out.println(i+" X " + k + " = " + (i * k));
		}
		
	}//끝
}
