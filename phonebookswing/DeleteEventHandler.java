package phonebookswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DeleteEventHandler implements ActionListener{
	JTextField deField; //이름
	JTextArea textArea;
	
	public DeleteEventHandler(JTextField deField, JTextArea textArea) {
		super();
		this.deField = deField;
		this.textArea = textArea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name=deField.getText();
		PhoneBookManager manager=PhoneBookManager.createManagerInst();
		
		boolean isDeleted=manager.deleteData(name);
		
		if(isDeleted) {
			textArea.append("데이터 삭제를 완료하였습니다. \n");
		}else {
			textArea.append("해당하는 데이터가 존재하지 않습니다. \n");
		}
	}
	
	
}
