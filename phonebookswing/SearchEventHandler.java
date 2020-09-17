package phonebookswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//ActionListener 인터페이스이므로 미완성된 메서드를 재정의
public class SearchEventHandler implements ActionListener{
	//필드
	JTextField searchField;//이름
	JTextArea textArea;//이름으로 검색하면 전화번호정보 
	
	//생성자
	public SearchEventHandler(JTextField searchField, JTextArea textArea) {
		super();
		this.searchField = searchField;
		this.textArea = textArea;
	}

	@Override//메서드 재정의
	//이벤트(단추클릭)가 발생하면 자동호출되어 이벤트 객체를 받아 처리해줌
	public void actionPerformed(ActionEvent e) {
		String name=searchField.getText();
		//TextField에 입력된 "이름문자열"을 얻어와
		PhoneBookManager manager=PhoneBookManager.createManagerInst();
		
		String[] srchResult=manager.searchData(name); //이름으로 검색
		
		
		if(srchResult==null) {
			textArea.append("해당하는 데이터가 존재하지 않습니다.\n");
		}else {
			textArea.append("찾으시는 정보를 알려드립니다. \n");
			/**
			 * 향상된 for문 (인덱스 이용하지 않고도 값을 얻어옴)
			 * 제약조건:인덱스를 이용하지 않으므로 인덱스로 접근하여 값을 변경할 수 없다.
			 * 단지, 해당값을 참조하는 상황일때만 향상된 for 사용가능
			 * 
			 */
			for(String s:srchResult) {//같은 이름의 정보들을 
				textArea.append(s);//TextArea에 한줄 씩 추가
			}	
			textArea.append("\n");//빈줄
		}
	}
}
