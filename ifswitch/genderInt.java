package ifswitch;

import java.util.Scanner;

public class genderInt {

	public static void main(String[] args) {
		// 스캐너 객체 생성하여 키보드로 입력받기
				Scanner sc = new Scanner(System.in);
				System.out.println("주민등록번호 입력(예: 123456-41111111)");
				String s = sc.nextLine();// 엔터까지 읽어들인 후 엔터 버리고 나머지로 문자열 객체 생성
				char gender = s.charAt(7);
				// 입력받은 주민등록번호 중 gender를 가지고 switch문으로 처리
				switch (gender) {
				case '1':
					// System.out.println("man");break;
				case '3':
					System.out.println("man");
					break;
				case '4':
					// System.out.println("woman");break;
				case '2':
					System.out.println("woman");
					break;
				}

				// "남성입니다." 또는 "여성입니다."
long n=sc.nextLong();
n=(n/1000000)%2;
int i=(int)(n%2);
switch(i) {
case 1:System.out.println("man");
break;
case 0:System.out.println("woman");
break;
}
				
	}

}
