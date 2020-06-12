package first;

public class HiFirst {//대문자로 시작: 클래스와 인터페이스

	public static void main(String[] args) {//main->프로그램의 시작,메서드=함수()
		//주석:설명 컴파일러가 무시(컴파일안함)
		//실행할 내용
	System.out.print("오늘 자바가 처음인가요><??\n");//sysout + ctrl,스페이스바
	System.out.println("오늘은 날씨가 덥네요;;");
	System.out.println("하늘이 너무 맑아서 피곤하네요 ㅡㅡ");
	System.out.println("우리 덥지만 힘내봐요^^");
	System.out.println("문자열-그대로 출력");
	System.out.println("3+7="+(3+7));//더하기,문자열을 연결
	//"문자열"+수=>"문자열"+"수"=>"문자열수"
	//+중심으로 양쪽에 하나라도 문자열이 있으면 다른것도 자동으로 문자열로 변환됨.
	
	System.out.println(3+7+"=3+7");
	System.out.println("3+7="+(3+7)+", 2+5="+(2+5));
	System.out.println("3+7="+(3+7)+"\n2+5="+(2+5));
	System.out.println("3+7="+(3+7)+"\t2+5="+(2+5));
	
	int num1 = 10;//=대입연산자 integer:정수
	int num2 = 20;//반드시 '변수'만=변수,상수
	System.out.println(num1+" "+num2);//10,10
	System.out.println(num1);
	System.out.println(num2);
	}//끝
	

}
