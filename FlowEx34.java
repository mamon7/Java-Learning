import java.util.Scanner;

public class FlowEx34 {

	public static void main(String[] args) {//메서드 안에 선언된 지역: 지역변수(번두사 초기화)
	int i;
	int j;
		System.out.println("=====continue=====멈추는게 아니라 위(j++)로 올라감");
	in:for(i=2;i<10;i++) {
			for(j=1;j<10;j++){
				if(j==5) continue in ;
				System.out.println("[제"+i+"단]"+i+"x"+j+"="+i*j);
				//
			}System.out.println();
		}
		System.out.println("=====continue=====멈추는게 아니라 위(j++)로 올라감");
		outer: for (i = 2; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				if (j == 5)
					continue outer;
				System.out.println("[제" + i + "단]" + i + "x" + j + "=" + i * j);
			}
			System.out.println();
		}
		outer: for (i = 2; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				if (j == 5)
					break outer;
				System.out.println("[제" + i + "단]" + i + "x" + j + "=" + i * j);
			}
			System.out.println();
		}
		
		
		 int menu=0, num=0;
		 Scanner sc = new Scanner(System.in);
		System.out.println("(1) 제 곱");
		System.out.println("(2) 루 트");
		System.out.println("(3) 로 그");
		
		System.out.println("원하는 메뉴(1~3)를 선택하세요:");
		menu=sc.nextInt();
		System.out.println("계산할 값을 입력하세요:");
		num=sc.nextInt();
		switch(menu) {//():정수 ,'문자',"문자열"을 결과로 가지는 것
		case 1:System.out.println("result,"+num * num); break;
		case 2:System.out.println("result,"+Math.sqrt(num));break;
		case 3:System.out.println("result,"+Math.log(num));//break 생략가능
		}
	}
}

