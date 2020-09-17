package repeat;

public class ForWhileDowhile {

	public static void main(String[] args) {
		/**반복문 3가지 정리***/
		int i;//1 2 3 4 5(참) 6(거짓)
		for(i=1;i<=5;i++) {//i:카운팅, 실행에도 관련
			System.out.print(i+" ");
		}
		System.out.println("\n i="+i);//커서를 아래로
		
		//(참 또는 거짓을 결과로 가지는 조건)
		i=1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n i="+i);//커서를 아래로
		
		//do~while(조건);
		//참이든 거짓이든 관계없이 무조건 한번은 실행
		i=1;
		do {
			System.out.print(i+" ");//1 2 3 4 5
			i++;//2->3->4->5->6
		}while(i<=5);//조건이 참이면 반복, 거짓이면 끝
		System.out.println("\n i="+i);//커서를 아래로
		
		System.out.println("***반복문을 이용하여 1~10까지의 합을 구하기***");
		
		int hap=1+2+3+4+5+6+7+8+9+10;
		System.out.println("1~10 더한 합="+hap);//55
		
		//i=1 2 3 4...10 변하는 수를 담을 변수(1씩 증가)
		hap=0;//★반드시 0으로 초기화
		for(i=1;i<=10;i++) {//1~10(참) 11(거짓)
			hap=hap+i;//0+1+2+3+4...+10
		}
		System.out.println("1~10 더한 합="+hap);
		//지금부터 while, do~while 
		
		hap=0;
		i=1;
		while(i<=10) {
			hap=hap+i;
			i++;
		}
		System.out.println("1~10 더한 합="+hap);
		
		hap=0;
		i=1;
		do {
			hap=hap+i;
			i++;
		}while(i<=10);
		System.out.println("1~10 더한 합="+hap);//55
		
		//2+4+6+8+10 합을 반복문
		hap=0;//중요
		for(i=2;i<=10;i=i+2) {//i:카운팅, 실행 영향
			hap=hap+i;
		}
		System.out.println("1~10 사이 중 짝수 더한 합="+hap);
		
		//1+3+5+7+9 합을 반복문
		hap=0;
		i=1;
		while(i<=9) {
			hap=hap+i;//0+1
			i=i+2; //i+=2;
		}
		System.out.println("1~10 사이 중 홀수 더한 합="+hap);
		
		//1~100사이의 3의 배수(조건) 더하기  3 6 9 12...99
		hap=0;
		i=3;
		do {
			hap=hap+i;//0+3+6...+99(참)
			i+=3;//6...->99(참)->102
		}while(i<=100);//102<=100(거짓)		
		System.out.println("1~100 사이 중 3의 배수를 더한 합="+hap);
		
		hap=0;//1~100사이에서 3의 배수만 더하기
		for(i=1;i<=100;i++) {//1 2 3 4 ....100(100번 반복)
			if(i%3==0) hap=hap+i;//3 6 9 12...3의 배수일 때만 참
		}
		System.out.println("1~100 사이 중 3의 배수를 더한 합="+hap);
		
	 /**1부터 계속 더해 나가서 몇(i)까지 더하면 합이 100을 넘는지 알아보기
	  * 반복문을 빠져나오는 방법 : if(조건) break; 
	  *                         //가장 가까운 반복문을 빠져나옴
	  * */
		
		for(;;) {
			
		}
		
		
		
		
		
		
	}

}
