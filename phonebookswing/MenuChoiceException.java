package phonebookswing;

public class MenuChoiceException extends Exception{//1.Exception를 부모
	int wrongChoice;    //잘못된 번호 

	public MenuChoiceException(int wrongChoice) {
		super("잘못된 선택이 이뤄졌습니다.");//getMessage()리턴받는 문자열;
		this.wrongChoice = wrongChoice;
	}
	
	public void showWrongChoice()
	{
		System.out.println(wrongChoice+"에 해당하는 선택은 존재하지 않습니다.");
	}	
}
