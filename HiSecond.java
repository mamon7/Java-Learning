package first;

/*주석 설명:나중에 알아보기 쉽도록
 * 클래스 2가지
 * 1. 라이브러리용-main()없다. 참조
 * object.class는 모든 클래스의 부모 클래스이다.
 * 2. 실행용-main()있다.
 * 컨트롤+f11 저장과동시에 저장하기
 */
//import java.lang.*;//이클립스 자동으로 삽입
public class HiSecond {// 접근제한자(public)공동의,공용,누구든지 접근할수 있다.
						// 클래스이름:대문자로 시작(인터페이스)
	public static void main(String[] args) {// 매서드=함수:소문자로 시작()-프로그램의 시작담당
		System.out.println("문자열 String-입력한 그대로 출력");
		System.out.println("3+7=");
		System.out.println(3 + 7);// 수+수=연
		System.out.println("3+7=" + 3 + 7);
		// "문자열"+"수"=>"문자열수"
		System.out.println("3+7=" + (3 + 7));// ()우선순위 변경
		/**** 정수 ****/
		/*
		 * 자동형변환: 변수만=변수/상수/메서드.. (오른쪽 보다 같거나 큰그릇) 강제 형변환: (타입)오른쪽이 클 때
		 */
		int n1;// 정수 변수 선언
		n1 = 30;// 변수(이름있는 메모리) 안에 30을 대입(초기값)
		// 변하는 값을 저장
		// 상수 이름없는 메모리(정수int4바이트,실수double8바이트)
		int n2 = 70; // 정수 변수 선언 동시에 초기값;
		byte n3 = 50, n4 = 90;
		short n5 = 90;
		n2 = n3;// 변수만int = byte (int->byte으로 자동 형변환 되어 대입)
		long n6 = 990000000L;//
		// L은 상수때문에 붙인다.
		// 상수:이름없는 메모리
		System.out.println(n1 + n3);// int + byte
		byte n7 = (byte) (n3 + n4);// byte + byte
		// 강제 형변환의 문제점-데이터 손실 발생 가능
		// => 연산 int + int
		// =>결과 int를 byte에 대입 (오류):자동형변환 불가
		// =>해결법:강제형변환(프로그래머가)
		int n8 = n3 + n4; // =>따라서, 왼쪽의 변수의 표현범위를 크게 한다.
		System.out.println(n7);// 데이터 손실
		System.out.println(n8);// 결과 정확
		// 자동 줄맞춤 컨트롤 쉬프트 에프
		//'a'->메모리에 97의 2진수(연산 가능)
		System.out.println('a');//'문자' 'a' "a" "문자열"
		System.out.println('A');
		System.out.println((int)'a');//10진수 97
		System.out.println((int)'A');//10진수 65
		System.out.println('가');
		System.out.println((int)'가');//44032
		System.out.println((char)44032);//정수를 문자로 강제형변환
		/***** 실수 *****/
		float f = 1.23f;// 4=4
		double d = 1.23;

		d = 1.23456789123456789;
		System.out.println(d);// 오차 발생 가능성
		// 장점:표현할수 있는 범위가 넓다.
		// 단점:오차 발생 가능성 있음.

		f = 20 + 30;// 실수=정수int(float로 자동형변환)
		System.out.println(f);// 50.0

		d = 20 + 30.0;// 정수(int)+실수(double)
			// =>실수20.0+30.0=>50.0(결과 double)
			// 자바는 아세키 코드가 아니라 유니코드(전세계의 언어를 다표현한 언어)를 사용한다.
	}// 프로그램의 끝

}
