package phonebookswing;

import java.util.InputMismatchException;

public class PhoneBookSwing {

	public static void main(String[] args) {//throws MenuChoiceException { //JVM이 처리
		PhoneBookManager manager=PhoneBookManager.createManagerInst();
		SearchDelFrame winFrame=new SearchDelFrame("전화번호 관리-검색과 삭제");
		
		int choice;
		while(true) {
			MenuViewer.showMenu();//메뉴
			
			try {
				choice = MenuViewer.sc.nextInt();//a엔터=>InputMismatchException객체 생성
				
				//입력한 정수가 1 또는 4가 아니면 MenuChoiceException예외 객체 생성(수동)
				if (choice != INIT_MENU.INPUT && choice != INIT_MENU.EXIT) {
					throw new MenuChoiceException(choice);
				}
				
				MenuViewer.sc.nextLine();//엔터 처리				
				
				switch (choice) {
					case INIT_MENU.INPUT://1. 입력
						manager.inputData(); break;
					case INIT_MENU.EXIT:// 4. 종료
						manager.storeToFile(); 
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
						//정상적인 프로그램 종료 명령어 메서드로 프레임 창까지 같이 종료됨
				}
			} catch (MenuChoiceException e) {
				//e.printStackTrace();//getMessage()호출
				System.out.println(e.getMessage());
				e.showWrongChoice();
				System.out.println("메뉴 선택을 다시 시작합니다.\n");//\n빈줄
			} catch(InputMismatchException e) {	
				MenuViewer.sc.nextLine();//★엔터 처리(없으면->무한루프)
				System.out.println("잘못 입력하셨습니다.\n메뉴 선택을 다시 진행합니다.\n");			
			} catch(Exception e) { //부모는 모든 자식예외객체 처리가능
				e.printStackTrace();
			}
		}
	}
}
