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
		// "문자열"+"수"=>"문자열수
		System.out.println("3+7=" + (3 + 7));// ()우선순위 변경
		/**** 정수 ****/
		int n1;// 수 변수 선언
		n1 = 30;// 변수 안에 30을 대입(초기값)

		int n2 = 70;// 정수 변수 선언 동시에 초기값;
		byte n3 = 50, n4 = 90;
		short n5 = 90;
		long n6 = 99;
		System.out.println(n1 + n3);// int + byte
		byte n7 = (byte) (n3 + n4);// byte + byte
		// => 연산 int + int
		// =>결과 int를 byte에 대입 (오류):자동형변환 불가
		// =>해결법:강제형변환(프로그래머가)
		System.out.println(n7);
//자동 줄맞춤 컨트롤 쉬프트 에프
	}// 프로그램의 끝

}
