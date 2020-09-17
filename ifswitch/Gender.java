package ifswitch;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		/**
		 * 주민등록번호를 입력받아 switch문으로 처리하여 '남성/여성/2000년 이전/2000년 이후' 결과출력
		 */

		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 입력(예: 123456-4111111):");
		String s = sc.nextLine(); // 엔터까지 읽어들인 후 엔터 버리고 나머지로 문자열 객체 생성
		char gender = s.charAt(7);// '1'==49

		// 입력받은 주민등록번호 중 gender를 가지고 switch문으로 처리
		switch (gender) {
		case '1':// System.out.println("남성입니다."); break;
		case '3':
			switch (gender) {
			case '1':
				System.out.print("2000 이전 출생한 ");
				break;
			case '3':
				System.out.print("2000 이후 출생한 ");
				break;
			}

			System.out.println("남성입니다.");
			break;

		case '2':// System.out.println("여성입니다."); break;
		case '4':
			switch (gender) {
			case '2':
				System.out.print("2000 이전 출생한 ");
				break;
			case '4':
				System.out.print("2000 이후 출생한 ");
				break;
			}

			System.out.println("여성입니다.");
			break;
		}
		// "2000년 이후 남성입니다." 또는 "2000년 이전 여성입니다."

	}
}