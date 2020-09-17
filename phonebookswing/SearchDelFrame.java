package phonebookswing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.Border;

public class SearchDelFrame extends JFrame{
	//필드
	JTextField srchField=new JTextField(15);
	JLabel searchname=new JLabel("이름:");
	JButton srchBtn=new JButton("검색");
	
	JTextField delField=new JTextField(15);
	JLabel deletename=new JLabel("이름:");
	JButton delBtn=new JButton("삭제");
	
	JTextArea textArea=new JTextArea(20, 25);
	
	public SearchDelFrame(String title){
		super(title);//창 제목
		setBounds(100, 200, 450, 450);
		//(x,y,width,height) : x y(창의 위치), width height(가로 세로 크기)
		
		setLayout(new BorderLayout());//기본배치관리자이므로 생략 가능
		
		Border border=BorderFactory.createEtchedBorder();
		//현재 배경색을 사용하여 "에치된" 모양으로 경계를 작성
		Border srchBorder=BorderFactory.createTitledBorder(border, "검색");
		//경계에 제목"검색"을 추가
		JPanel srchPanel=new JPanel();
		srchPanel.setBorder(srchBorder);
		srchPanel.setLayout(new FlowLayout());
		srchPanel.add(searchname);
		srchPanel.add(srchField);		
		srchPanel.add(srchBtn);
		
		
		Border delBorder=BorderFactory.createTitledBorder(border, "삭제");
		JPanel delPanel=new JPanel();
		delPanel.setBorder(delBorder);
		delPanel.setLayout(new FlowLayout());
		delPanel.add(deletename);
		delPanel.add(delField);		
		delPanel.add(delBtn);
		
		//JTextArea 컴포넌트를 JScrollPane에 삽입하여야 스크롤바 지원을 받을 수 있다.
		JScrollPane scrollTextArea=new JScrollPane(textArea);
		//프레임(창) 크기를 조절하면 자동으로 수평 또는 수직 스크롤바가 나타남.
		
		Border textBorder=BorderFactory.createTitledBorder(border, "전화번호 정보");
		scrollTextArea.setBorder(textBorder);
		
		this.add(srchPanel, "North");
		this.add(delPanel, "South");
		this.add(scrollTextArea, "Center");
		
		//버튼(이벤트소스)에 이벤트 처리 객체를 등록(연결)
		srchBtn.addActionListener(new SearchEventHandler(srchField, textArea));
		delBtn.addActionListener(new DeleteEventHandler(delField, textArea));
				
		this.setVisible(true);//창이 화면에 나타남.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//프레임(창)이 닫힐 때 프로그램도(=main()) 함께 종료		
	}
}
