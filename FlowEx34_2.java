import java.util.Scanner;

public class FlowEx34_2 {

	public static void main(String[] args) {//메서드 안에 선언된 지역: 지역변수(번두사 초기화)
		
		int menu=0, num=0;
		String tmp=null; 
		Scanner sc = new Scanner(System.in);
		 
		outer:for(;true;) {
		 System.out.println("(1) 제 곱");
		 System.out.println("(2) 루 트");
		 System.out.println("(3) 로 그");
		
		System.out.println("원하는 메뉴(1~3)를 선택하세요(전체종료 :stop)>");
		tmp=sc.next();//단어 "stop" "1" "2" "3"
		if(tmp.equalsIgnoreCase("stop")) {
			System.out.println("프로그램을 종료합니다.");
		break;
		}
		menu=Integer.parseInt(tmp);//"1"->1  "2"->2  "3"->3
		//menu=sc.nextInt();1~3
		
		if(!(menu>=1 && menu<=3)) {
			System.out.println("메뉴를 잘못 선택하셨습니다.");
			continue;
		}
		while(true) {//for(;;) {
			System.out.println("계산할 값을 입력하세요(계산종료:0,전체종료 :stop)>");
			tmp=sc.next();

			if(tmp.equalsIgnoreCase("stop")) {
				System.out.println("프로그램을 종료합니다.");
			break outer;
			}
			num=Integer.parseInt(tmp);//"0"->0 "4"->4
			//num=sc.nextInt();
			if(num == 0) {
				System.out.println("계산 종료");
				break;
			}
			switch(menu) {//():정수 ,'문자',"문자열"을 결과로 가지는 것
			case 1:System.out.println("result,"+num * num); break;
			case 2:System.out.println("result,"+Math.sqrt(num));break;
			case 3:System.out.println("result,"+Math.log(num));//break 생략가능
			}
		}
	}				
  }
}

