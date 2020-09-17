package phonebookswing;

import java.util.Scanner;

public class MenuViewer {//키보드로 입력+메뉴
	//static:객체 생성없이 바로 사용할 수 있도록
	public static Scanner sc=new Scanner(System.in);

	public static void showMenu() {
		System.out.println("1. 데이터 입력");
		/*-----Swing : 검색과 삭제-----*/
		System.out.println("4. 프로그램 종료");
		System.out.print("선택: ");		
	}
}
