
public class BreakTest {

	public static void main(String[] args) {
		/***1부터 계속 더해 나가서 몇까지 더하면 합이 100을 넘는지(초과) 알아보기
         * (정석-175참조) if(조건문) break;. 이상:크거나 같다. 초과:크다
         * ***/
		int i, hap=0;//1->2->3->4->5
		for(i=1; ;) {//조건문 생략 가능 true 무한루프			
			
			hap+=i;//0+1+2+3+4+5
			if(hap>100) break;//15
			i++;			
		}
		System.out.println(i+", "+hap);//5 15
		
		hap=0;
		i=0;
		while(true){//조건문 생략 불가
		   if(hap > 100) break;		  
		   i++;//1->2->3->4->5
		   hap = hap + i;//0+1...+5
		}
		System.out.println(i+", "+hap);//5 15
		
		hap=0;
		i=0;
		do{//조건문 생략 불가
		   if(hap > 100) break;		  
		   i++;//1->2->3->4->5
		   hap = hap + i;//0+1...+5
		}while(true);
		System.out.println(i+", "+hap);//5 15
	}
}


