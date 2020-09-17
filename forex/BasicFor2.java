package forex;

import java.util.Scanner;

public class BasicFor2 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.print(" 안녕");
		}

		System.out.println("");
		for(int i=1;i<=9;i+=2) {
			System.out.print(" 안녕~~");
		}
		/**************************************/
		System.out.println("");
		for(int i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		System.out.println();//커서를 아래로
for( int i=2;i<=10;i+=2) {
	System.out.print(" "+i);
}
/**********************************************/
//키보드로 입력받은 숫자 5번 출력
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int i;
for( i=1;i<=5;i++){
		System.out.print(n1+"\t");
}
System.out.println("");

System.out.println("7 * 1="+7*1);
System.out.println("7 * 2="+7*2);
System.out.println("7 * 3="+7*3);
System.out.println("7 * 4="+7*4);
System.out.println("7 * 5="+7*5);
System.out.println("7 * 6="+7*6);
System.out.println("7 * 7="+7*7);
System.out.println("7 * 8="+7*8);
System.out.println("7 * 9="+7*9);


	for(int j=1; j<=9; j++){
		System.out.print(7*j+"\t");
	}System.out.println();
	System.out.println("출력할 단 입력");
	int dan = sc.nextInt();
	
	for(int a=1;a<=9;a++) {
		System.out.println(dan+"x"+a+"="+(dan*a));		
	}
	System.out.println();
	int hap=0;
	for(i=1;i<=10;i++) {//11<=10(거짓)조건문이 거짓이 되면 반복문이 
		hap+=i;//0+1+2+3+4+...+10
	}
	System.out.println(hap);


	//시작값,끝값,증가값 입력받아 합 구하기
	System.out.println("시작값 , 끝값 , 증가값 입력:");//1  20  22
	int f=sc.nextInt();//1
	int l=sc.nextInt();//20
	int x=sc.nextInt();//2  엔터/스페이스바/탭 구분자로 무시하고 정수만 읽어들임
	
	 hap=0;
	for(i=f;i<l;i+=x) {//11<=10(거짓)조건문이 거짓이 되면 반복문이 
		hap+=i;//0+1+2+3+4+...+10
	}
	System.out.println(f+"~"+l+"까지"+x+"만큼 증가한 수의 합"+hap);
}
	
	}
