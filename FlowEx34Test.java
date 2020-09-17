import java.util.Scanner;

public class FlowEx34Test {

	public static void main(String[] args) {//메서드 안에 선언된 지역: 지역변수(번두사 초기화)
		
		int num=0; 
		int menu=0;
		Scanner sc=new Scanner(System.in);
//		System.out.println("(1) 제 곱");
//		System.out.println("(2) 루 트");
//		System.out.println("(3) 로 그");
//	System.out.println("원하는 메뉴(1~3)를 선택하세요 (종료:0) : ");
//	menu=sc.nextInt();
//	System.out.println("계산할 값을  입력하세요 : ");
//	num=sc.nextInt();
//	switch(menu) {
//	case 1:System.out.println("result,"+num*num); break;
//	case 2:System.out.println("result,"+Math.sqrt(num));break;
//	case 3:System.out.println("result,"+Math.log(num));
//	}
	for(;true;) {
		System.out.println("(1) 제곱 ");
		System.out.println("(2) 루트 ");
		System.out.println("(3) 로그 ");
	System.out.println("원하는 메뉴(1~3)를 선택하세요(종료 : 0):");
	menu=sc.nextInt();
	 if(menu==0) {
		 
	 }else if(!(menu>=1 && menu<=3)) {
		 
	 }
	
	
	
	
	
	
	
	
	}
	
	}
	
}
