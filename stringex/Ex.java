package stringex;

import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hap;
		int i;
		System.out.println("1~ i까지 입력받은 정수까지 더한 결과");
		System.out.print("마지막 정수를 입력:");
		int lastnum=sc.nextInt();
		hap=0;
		for(i=1;i<=lastnum;i++) {
			hap=hap+i;
			}
		System.out.println(+hap);
	}
	}