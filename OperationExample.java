import java.util.Scanner;

/*
 * 클래스 2가지
 * 1. 라이브러리용 : main() 없음.
 * 2. 실행용: main() 있음.
 */
public class OperationExample {// <= 클래스 이름 변경시 패키지 탐색기에 f2를 누르면 손쉽게 변경가능.

	public static void main(String[] args) {
		/** 산술연산자 + - *나누기(몫 /, 나머지 %) -정석97**/
		int iv1 = 10;
		int iv2 = 3;

		System.out.println(iv1 + iv2);
		System.out.println(iv1 - iv2);
		System.out.println(iv1 * iv2);

		// 정수와 정수를 나누기할 때는 몫,나머지 다 구해야 함
		System.out.println("10 나누기 3의 몫 =" + (iv1 / iv2));// 몫:정수 / 정수 =정수 (결과)
		System.out.println("10 나누기 3의 나머지 =" + (iv1 % iv2));// 나머지:정수 % 정수 =정수 (결과)

		System.out.println((double) iv1 / iv2);// 3.33333..
		// '정수->실수 (강제)''나머지 정수도 자동 실수'->'' 실수'(결과)
		/**
		 * 강제로 형변환하면 데이터가 손실 가능 => 데이터의 손실이 발생하기 전 점검
		 */
		byte b1 = (byte) 123456789;
		System.out.println(b1);// 데이터 손실

		byte b = 127;// -128~127 (최대값+1=최소값) (최대값-1=최대값)
		System.out.println(b + 1);// 128(int)->(byte)
		System.out.println("byte로강제 변형변환 결과:" + (byte) (b + 1));// -128
		// ★2의보수-최대 최소 3bit 정보의 수

		int i = 128;
		System.out.println(i);// 128
		System.out.println((byte) i);// -128

		// if(조건이 참) {실행}
		// else{거짓이면 실행}
		// 조건문: 참 또는 거짓을 결과
		// 비교(=관계)) 연산자(< ,>, <= ,>= ,==같다,!=다르다): 수와 수를 비교 'A'(65의 2진수) 'B'(66의 2진수)
		// 논리 연산자: 참 과 거짓(!:반대 &&: 둘다 참이면 참 ||:둘 중 하나만 참이면 참)
		// 비교와 논리연산자는 결과가 무조건 참 또는 거짓.따라서 조건문에서 많이 활용
		if (!true) {// !참-> 거짓, !거짓->참
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		i = -128;// <=형변환 테스트 연습
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");

			System.out.println("값을 다시 확인해 주세요");
		} else {
			System.out.println("byte로 강제형변환 결과:" + (byte) i);
		}

		if ('a' > 100)
			System.out.println("참");
		else
			System.out.println(("거짓"));

		/** 자동형변환 주의사항:정수가 실수로 자동형변환시 **/
		int num1 = 123456780;
		int num2 = 123456780;

		// 오차가 있느 근사치(float 가수부:23bit) 로 변환되어 저장,가수부:23비트
		// double 가수부:52bit
		float num3 = num2;// 정수가 실수로 자동 형변환(오차) 해결법:double 사용
		System.out.println("a:"+num3);//자동형변환후 16진수
		num2 = (int) num3;
		System.out.println("b:"+num2);//자동형변환후 10진수
		//오차 생김.
		System.out.println(num1 - num2);// -4
		// int(num)부호 1비트 가수부 31비트
		// float(num)부호 1비트 가수부23비트 정수부 8비트
		/** 자료형의 값이 싸이클을 돈다. 최대값+1=최소값 **/
		byte b3 = 126;// 대입연산자를 통해서만 변수의 값이 바뀐다.
		System.out.println(b3 + 1);// 127
		System.out.println(++b3);// 단항연산자++:자신의 값을 1증가,--:1감소
		System.out.println(++b3);//
		
		/**단항연산자- 정석93**/
		int a1=10, a2=20,a3;
		a1++;//단독:1증가
		++a2;//a2=a2+1
		System.out.println(a1+","+a2);
		
		//++단독이 아닐 때:앞(제일 처음),뒤 (마지막에)
		System.out.println((++a1)+","+(a2++));
		//1.a1이 1증가 -> 출력(12,21) -> a2 1증가
		System.out.println(a1+","+a2);
		
		a1=10; a2=20;
		a3 = ++a1 + a2--;
		//a1(11) -> 11+20=31 -> 31(a3에 대입) -> a2(19)
		System.out.println(a1+","+a2+","+ a3);
		/**단항연산자(부호) +,-(-1,+1==1)**/
		int n1 =5;
		System.out.println(+n1);
		System.out.println(-n1);
		
		short n2 = 7;
		short n3 = (short) +n2;
		
		//단항연산자 : !,++,--,~
		//논리연산자!:참 <->거짓, &&:둘다 참이면 참||:둘중하나만 참이면 참
		/**비트연산자 &:둘1이면 1 |: 둘 중 하나만 1이면 1
		 *  ^: 다르면 1
		 *   ~ (단항연산자):1<->0,
		 * 비트연산자이면서 산술연산 <<:곱하기, >>:나누기(몫)**/
		
		int nu1 =5;//0101<- 4비트

		int nu2 =3; //0011<- 4비트
		
		System.out.println(Integer.toBinaryString(nu1));
		System.out.println(Integer.toBinaryString(nu2));
		
		System.out.println("5&3="+(nu1 & nu2));
		System.out.println("5|3="+(nu1 | nu2));
		System.out.println("5^3="+(nu1 ^ nu2));
		System.out.println(~nu1+1);//0101 -> 1010앞의 비트도 11...1010( 양수이면 음수, 음수이면 양수) 
								 //	-6+1=-5 ~수+1=부호가 반대인 수
		System.out.println(-nu1);
		/**비트 이동 연산자 <<(곱하기2) , >>( 나누기2)**/
		System.out.println(3<<1);//(3*2)3을 1비트 왼쪽 이동(빈부분은 0)<-수*2의 n승
		System.out.println(3<<2);//3*4
		System.out.println(3<<3);//3*8
		
		System.out.println(16>>1);//16/2=8
		System.out.println(16>>2);//16/4=4 
//<-속도가 빨라짐.
		/** 키보드(System.in)로 입력한 값을 읽어들이는 방법:Scanner**/
		Scanner sc=new Scanner(System.in);// 생성자 :객체 생성, 객체 안에 있는 것이 아니다.
		System.out.print("두 정수 입력:");
		int i1 = sc.nextInt();//버퍼로부터 정수를 읽어들임-> 변수에 저장
		int i2 = sc.nextInt();
		System.out.println(i1+"+"+i2+"="+(i1+i2));
		System.out.println(i1+"-"+i2+"="+(i1-i2));
		System.out.println(i1+"*"+i2+"="+(i1*i2));
		System.out.println(i1+"/"+i2+"="+(i1/i2));
		
		System.out.print("두 실수 입력:");
		double s1 = sc.nextDouble();//버퍼로부터 실수를 읽어들임 ->변수에 저장
		double s2 = sc.nextDouble();//20.123
	
		System.out.println(s1+"+"+s2+"="+(s1+s2));
		System.out.println(s1+"-"+s2+"="+(s1-s2));
		System.out.println(s1+"*"+s2+"="+(s1*s2));
		System.out.println(s1+"/"+s2+"="+(s1/s2));//10./3.0
	
		System.out.print("두 실수 입력2:");
		int j1 = sc.nextInt();//버퍼로부터 정수를 읽어들임-> 변수에 저장
		int j2 = sc.nextInt();
		System.out.println(j1+"+"+i2+"="+(j1+j2));
		System.out.println(j1+"-"+i2+"="+(j1-j2));
		System.out.println(j1+"*"+i2+"="+(j1*j2));
		System.out.println(j1+"/"+i2+"="+((double)j1/j2));//10./3.0
		
		System.out.println("단어 2개 입력:");//행복 엔터 소망 엔터
		String g1=sc.next();//"행복"문자열 객체
		String g2=sc.next();//"소망"문자열 객체
		System.out.println(g1);//g1	주소가 참조하는 값이 출력
		System.out.println(g1+", "+g2);//
		
		//next(), nextInt()...:엔터, 스페이스바, 탭은 구분자로 무시
		//★nextLine():엔터까지 읽어들인 후 엔터를 버리고 문자열 객체를 생성
		System.out.println("문장 입력:");//여러분 힘내세요~!
		sc.nextLine();///버퍼의 제일 앞에 남아있는 엔터 처리(끄래기 객체)
		String g3=sc.nextLine();//엔터까지 읽어들임
		System.out.println(g3);//값 없는 문자열 객체
		System.out.println(Math.abs(-10));
		sc.close();
	//Scanner.class=> 메서드 ,stack , heap(객체)Scanner(nextInt()정수,nextDouble()실수
	}

}
