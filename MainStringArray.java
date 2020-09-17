import java.util.Scanner;

public class MainStringArray {
//JVM이 main()호출할 때 length가 0인 String[]배열객체 생성하여 호출함
	public static void main(String[] args) {
		if(args.length !=4) {
			System.out.println("실행할 때  4개의 숫자를 입력주세요"
					+ "(정수2개 실수2개)");
			
		return;//해당 메소드(main) 종료 -> 프로그램 종료
		}
		String s1 = args[0];//문자열  "10"
		String s2 = args[1];//문자열  "20"
		
		String s3 = args[2];//문자열  "30.7"
		String s4 = args[3];//문자열  "40.3"
		
		int num1=Integer.parseInt(s1);//"10"->10
		
		int num2=Integer.parseInt(s2);//"20"->20
		
		double num3=Double.parseDouble(s3);	
		double num4=Double.parseDouble(s4);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("연산자 입력(+-*/):");
		String opr=sc.next();//"+"
		//클래스 맴버:static 있다.(클래스이름으로 접근)
		System.out.println();//구분을 위한 줄
		//num3와 num4의 값을 이용하여 +-*/결과 완성
		switch(opr) {
		case"+" : System.out.println(num3+"+"+num4+"="+(num3+num4));break;
		case"-" : System.out.println(num3+"-"+num4+"="+(num3-num4));break;
		case"*" : System.out.println(num3+"*"+num4+"="+(num3*num4));break;
		case"/" : System.out.println(num3+"/"+num4+"="+(num3/num4));
		}
		
		System.out.println();//구분을 위한 줄
		MainStringArray m=new MainStringArray();
		int r=m.add(3,4);//인스턴스 매서드:객체의 주소로 접근 
		System.out.println("3+4="+r);
	}

	//반환타입 메서드명 (매개변수=인수){}
	//메서드 오버로딩:같은 이름의 메서드, 매개변수의 수나 타입은 달라야 함
	int add(int a, int b){//인스턴스(객체) 맴버->static 없다(객체가 생성되면 메모리에 올라와 실행가능)
		return a+b;
		}
	void add(int d){//void는 돌려주는 값이 없기 때문에 return값이 없고
		System.out.println(d);
	}
	
}
