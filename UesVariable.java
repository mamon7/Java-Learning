/*'정수'와 '실수'를 메모리에 표현방법이 다르다.
수:정수-자료형 byte(1바이트),short(2),기본int(4),long(8)
		장점:정확하게 수를 메모리에 표현가능
		단점:그러나 표현범위가 좁다.abstract
	
		실수--자료형 float(4), 기본double(8바이트)
				장점:표현범위가 넓다.
				단점:정밀도 떨어짐(정확히 표현안될 때는 근사치로 표현됨)
				정밀도는 double이 높다.*/
package second;

//import java.lang.*;//이클립스가 기본으로 자동으로 import해줌
public class UesVariable {

	public static void main(String[] args) {
		// 논리형-참true 또는 거짓 false
		boolean b = true;// 변수-변하는 값을 저장
//		b=false;
		if (b) {// if(조건문)<-조건문이 될수 있는 조건-반드시 결과가 참true 또는 거짓false
			System.out.println("참");
		}
		System.out.println("###정수 표현방법###");// "문자열":그대로 출력
		long n = 10000000000L;// 변수(이름있는 메모리)=상수(이름없는 메모리)
		// 상수:정수(int)->long

		// 정수연산-정확한 결과
		short s1 = 12, s2 = 7;
		short s3=(short) (s1+s2);//정수 연산(int)
	//데이터손실은 값이 클경우에 일어난다.위의 예는 값이 작기때문에 손실이 없다
		System.out.println(s3);
		
		System.out.println("###실수 표현방법###");
		float f=2.5f;//상수:실수(double)- >float
		
		double e1;//변수 선언
		e1 = 1.2E-11;//0.000000000012; 지수타입으로 나타낼수 있음
		System.out.println(e1);
	
		//실수연산-정확한 연산 결과가 안나올 수도 있다.(오차발생)
		double d1=0.0000001;
		System.out.println(d1);
		double d2=1.0000001;
		System.out.println(d2);
		
		System.out.println(d1+d2);
		
		System.out.println("##문자(아스키코드나 유니코드(java)참조)##");
		// ★ 32 아스키코드, 유니코드->메모리안에 있는 것은 무조건 수로 되있다.
		char c1 = 'a';//97의 2진수 대입
		char c2 = 'b';//98의 2진수 대입
		char c3 = ' ';//  의 2진수 대입 (변수에는 수가 저장-연산가능)
		System.out.println(c1);//'a'
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println((int)c1);//97
		System.out.println((int)c2);//98
		System.out.println((int)c3);//32
		
		System.out.println(c1+c2+c3);//?227 연산
		System.out.println(c1+", "+c2+", "+c3);
	
		int n1 = 97;//97의 2진수 대입
		System.out.println(n1);//97
		System.out.println((char)n1);//a
		
		System.out.println(n1+1);//98
		System.out.println((char)(n1+1));//b
		
		System.out.println(n1);//97
		//반드시 변수는 = 대입연산자를  이용해야만 값이 바뀐다.
		n1=n1+2;//99 변수만=변수/상수(값)/연산식/매서드(=함수)
		System.out.println(n1);//99
		
		c1 = (char) (c1 - 32);//97-32=65(int (4 바이트))->char(2바이트)
		System.out.println(c1);//A
		char c4='\uAC00';//\\u:유니코드 16진수(16진수1자리=2진수4자리)
		System.out.println(c4);
		System.out.println((int)c4);//44032
		
		int n2 = 0xAC00;//char->0~65535/0x(hex:16진수)
		System.out.print(n2+"\n");//44032
		System.out.println((char)n2);// '가'
		
		/* 자바의 정석-37p참조
		 printf():format(서식) 
		-정수 decimal :10진수  (%d)
		      hex     :16진수  (%x)
		      octal  :8진수   (%o)
		      boolean  :true(0이 아닌 모든수)/false(0) 2진수   (%b)
		-실수         :%f(부동소수점 형식으로 출력)      
		             :%e, %E (지수 형식으로 출력)
		             :%g(%f(소수6째짜리까지)나 %e 중 하나를 선택하여 출력)
		
		-문자(character)   'a'  : %c
		-문자열(String)    "a"  : %s 객체로 저장
		
		-다음줄로    :   \n   (newline)
		-탭크기만큼  :   \t   (tab)
		
		*/
		int n3=10, n4=20, n5=30;
		
	System.out.printf("정수:\n10진수:%d\t16진수:%x, 8진수:%o, boolean:%b \n",n3,n3,n3,n3);
	char c5='A';//65의 2진수
	System.out.println(c5+","+(int)c5);//문자
	System.out.printf("%c %d ",c5,(int)c5);
	
	String s="문자열";//대문자로 시작:클래스 타입 "a"(객체) 'a'(문자1개)
	System.out.println("\n"+s);
	System.out.printf("%s",s);
	
	double d=1230000000.45;
	System.out.printf("\n%f %e %g",d,d,d);
	System.out.printf("%s",Integer.toBinaryString(n3));//1010
	}
	

}
