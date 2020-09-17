package ifswitch;

import java.util.Scanner;//설계도

public class IfSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//객체 생성
		
		System.out.print("점수 입력(0~100):");
		int n1=sc.nextInt();//버퍼로부터 정수 입력받아 n1에 대입
		
		//(조건문-참 또는 거짓을 결과로 가지는 것)
		// && : 양쪽에 참 또는 거짓. 둘다 참일때만 참
		if(n1>=90)  System.out.println("A");		
		if(n1>=80 && n1<90) System.out.println("B");		
		if(n1>=70 && n1<80) System.out.println("C");		
		if(n1>=60 && n1<70) System.out.println("D");		
		if(n1<60)  System.out.println("F");	
		
		//if문:각if문은 단독
		//if~else if....else : 한 덩어리이므로 하나만 참이 될수 있다.
		if(n1>=90) System.out.print("A");		
		else if(n1>=80) System.out.print("B");//else:n1<90		
		else if(n1>=70) System.out.print("C");//else:n1<80		
		else if(n1>=60) System.out.print("D");		
		else System.out.print("F");//else:n1<60
		
		System.out.println("학점");
		
		//(중첩if문-정석144)
		if(n1>=90) {//{}한줄 생략
			if(n1>=95) System.out.print("A+");
			else System.out.print("A");
		}else if(n1>=80) {
			if(n1>=85) System.out.print("B+");
			else System.out.print("B");
		}else if(n1>=70) {
			if(n1>=75) System.out.print("C+");
			else System.out.print("C");
		}else if(n1>=60) {
			if(n1>=65) System.out.print("D+");
			else System.out.print("D");
		}else System.out.print("F");
		
		System.out.println("학점");
		
		/**switch()문-여러 개중 하나만 선택하여 실행****/
		//()안에 들어갈 수 있는 것-정수, '문자', "문자열"을 결과로 가지는 것
		//case 올수 있는 것-정수, 문자, 문자열 만(7, 'a', "행복")
		switch(1+1) {
		case 1:System.out.println(1); break;
		case 2:System.out.println(2); break;
		case 3 :System.out.println(3); break;
		default:System.out.println("나머지"); //break;//위의 case 이외
		}//
		
		switch('2') {
		case '1':System.out.println('1'); break;
		case '2':System.out.println('2'); break;
		case '3' :System.out.println('3'); break;
		default:System.out.println("나머지"); //break;//위의 case 이외
		}
		
		switch("1") {
		case "1":System.out.println("1"); break;
		case "2":System.out.println("2"); break;
		case "3" :System.out.println("3"); break;
		default:System.out.println("나머지"); //break;//위의 case 이외
		}
		
		//성적 산출-4 :switch문 이용
		switch(n1/10) {//정수/정수=몫
		case 10:System.out.println("A");break;//100
		case 9:System.out.println("A");break;//90~99
		case 8:System.out.println("B");break;//80~89
		case 7:System.out.println("C");break;//70~79
		case 6:System.out.println("D");break;//60~69
		default:System.out.println("F");break;//0~59
		}
		
		//카페에서 주문(손님 주문(입력)->switch문으로 처리->결과 출력)
		int i;//1 2 3(참) 4(거짓)
		for(i=1;i<=3;i++) {//카운팅,실행에 참여
			System.out.print("메뉴(아메리카노, 카페라떼, 카푸치노)중에서 주문:");
			String menu=sc.next();//"아메리카노" 엔터->버퍼에 들어감->버퍼에서 단어를 읽어들이는 역할
			                      //엔터는 구분자로 무시
			switch(menu) {
			case "아메리카노":System.out.println(menu+"를 주문하셨습니다.");
							 break;
			case "카페라떼"	:System.out.println(menu+"를 주문하셨습니다.");
			 				 break;
			case "카푸치노"  :System.out.println(menu+"를 주문하셨습니다.");
			 				 break;
			default:System.out.println("메뉴에 없습니다.");//break;
			}		
		}
		System.out.println("주문한 횟수="+(i-1)+"\n");
		
		/****카페 주문 반복************/
		int totalcnt, am, cp, cf;
		for(totalcnt=0,am=0,cp=0,cf=0;;) {//(;true;) 무한루프(=계속 반복)->멈추려면 조건
			System.out.print("메뉴(아메리카노, 카페라떼, 카푸치노, 그만요, 주문안함(=Stop))중에서 주문:");
			String menu=sc.next();//"아메리카노" 엔터->버퍼에 들어감->버퍼에서 단어를 읽어들이는 역할
			                      //엔터는 구분자로 무시
			//조건("주문안함")을 달고 멈춰야 함
			if(menu.equals("주문안함") || menu.equalsIgnoreCase("Stop")) //equals():대소문자 구분
				break;//가장 가까운 반복문을 빠져나감
			switch(menu) {
			case "아메리카노":System.out.println(menu+"를 주문하셨습니다.");
							am++; totalcnt++; break;
			case "카페라떼"	:System.out.println(menu+"를 주문하셨습니다.");
							cp++; totalcnt++; break;
			case "카푸치노"  :System.out.println(menu+"를 주문하셨습니다.");
							cf++; totalcnt++; break;
			case "그만요": if(am>0) System.out.print("아메리카노 "+am+"잔 ");
						  if(cp>0) System.out.print("카페라떼 "+cp+"잔 ");
						  if(cf>0) System.out.print("카푸치노 "+cf+"잔 "); 				
				          break;
			default:System.out.println("메뉴에 없습니다.");//break;
			}
		}
		/*
		 * if(am>0) System.out.print("아메리카노 "+am+"잔 "); if(cp>0)
		 * System.out.print("카페라떼 "+cp+"잔 "); if(cf>0)
		 * System.out.print("카푸치노 "+cf+"잔 ");
		 */		
		if(totalcnt>0) System.out.println("총 "+totalcnt+"잔을 주문하셨습니다.");
		
		System.out.println("주문 끝");
	}

}
