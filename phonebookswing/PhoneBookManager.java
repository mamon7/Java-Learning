package phonebookswing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * Serializable 인터페이스
 *  객체가 파일에 저장되는 과정을 가리켜 '직렬화'라 하고
 *  파일로부터 객체가 복원되는 과정을 가리켜 '역직렬화'라 한다.
 *  
 *  자바는 Serializable 인터페이스를 구현한 클래스만 직렬화할 수 있도록 
 *  제한하고 있다.
 *    
 */
/*
 * Object로 입출력하기 위해서. 
 * 표시이유:직렬화가 가능한 클래스임을 알려줘서 객체 입출력위해 직렬화
*/
class PhoneInfo implements Serializable{//1.일반
	//필드
	String name; //이름
	String phoneNumber; //전화번호
	
	//생성자-반드시
	PhoneInfo(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	//메서드
	void showPhoneInfo() {
		System.out.println("name: "+name);
		System.out.println("phone: "+phoneNumber);		
	}

	@Override
	public String toString() {
		return "일반동기:이름=" + name + ", 전화번호=" + phoneNumber + "\r\n";
		//리눅스에서도 \n의 \r을 인식할 수 있도록 하기 위해
	}

	/*
	 * 같은 이름과 같은 번호가 저장되지 않도록  
	 * hashCode()와 equals()를 주소가 아니라 값을 비교하도록 재정의
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash(name, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {//PhoneInfo->Object 자동형변환되어 대입됨
		PhoneInfo cmp=(PhoneInfo)obj;
		if(this.name.equals(cmp.name) && this.phoneNumber.equals(cmp.phoneNumber))
			return true;
		else
			return false;
	}
}

class PhoneUnivInfo extends PhoneInfo {
	//추가된 필드
	String major;//전공
	int year;    //학년
	
	PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}

	@Override //재정의
	void showPhoneInfo() {
		super.showPhoneInfo(); //재활용
		System.out.println("major: "+major); //추가
		System.out.println("year: "+year);
	}

	@Override
	public String toString() {
		return "대학동기:이름=" + name + ",전화번호=" + phoneNumber +",전공=" + major + ",학년=" + year + "\r\n";
	}
	
	
	
}

class PhoneCompanyInfo extends PhoneInfo {
	//추가된 필드
	String company; //회사명

	PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}

	@Override
	void showPhoneInfo() {
		super.showPhoneInfo();//재활용
		System.out.println("company: "+company);//추가
	}
	
	@Override
	public String toString() {
		return "회사동기:이름=" + name + ",전화번호=" + phoneNumber +",회사=" + company + "\r\n";
	}
}

/**
 *[File 클래스] 
 *  파일이나 디렉토리에 대해 경로명, 크기, 타입, 수정 날짜 등의 속성 정보를 제공하고
 *  파일 삭제, 디렉토리 생성, 파일 이름 변경, 디렉토리 내의 파일 리스트 제공 등 
 *  다양한 파일 관리 작업을 지원한다.
 *  (파일 입출력 기능은 없다.)
 */

/** Set     : 순서x(인덱스 X), 중복x
 *  HashSet : 저장 순서에 상관없는 출력 결과.
 *            Set이므로 인덱스 이용안하므로 저장 순서 중요하지 않다.
 *            인덱스 없으므로 iterator()메서드를 이용하여 객체를 읽어옴
 *  그러나
 *  LinkedHashSet : 저장 순서 유지. 예외적인 클래스
 **/

public class PhoneBookManager {
	//필드
	private final File dataFile=new File("PhoneBook.txt");
	Set<PhoneInfo> infoStorage=new HashSet<PhoneInfo>();
	//Set(부모 인터페이스)로 자동형변환
	
	/******싱글톤(단1개의 객체만 생성) 만드는 방법*********/
	static PhoneBookManager inst=null;
	
	//메서드
	static PhoneBookManager createManagerInst()	{ 
		//참조하는 객체가 없으면 새로운 PhoneBookManager객체 생성
		if(inst==null) inst=new PhoneBookManager();
		return inst;//기존에 참조하는 PhoneBookManager객체의 주소를 리턴
	}
	
	private PhoneBookManager(){
		readFromFile();//텍스트 파일로부터 데이터 읽어들이는 메서드
	}
	/**************************************************/
	
	private PhoneInfo readFriendInfo(){
		//nextLine():버퍼에서 엔터까지 읽어들인 후 엔터 버리고 나머지로 문자열 객체 생성	
		System.out.print("이름: ");
		String name=MenuViewer.sc.nextLine();
		
		System.out.print("전화번호: ");
		String phone=MenuViewer.sc.nextLine();
		
		return new PhoneInfo(name, phone);//PhoneInfo객체의 주소를 리턴
	}
	
	private PhoneInfo readUnivFriendInfo(){
		System.out.print("이름: ");
		String name=MenuViewer.sc.nextLine();
		System.out.print("전화번호: ");
		String phone=MenuViewer.sc.nextLine();
		System.out.print("전공: ");
		String major=MenuViewer.sc.nextLine();
		System.out.print("학년: ");
		int year=MenuViewer.sc.nextInt();
		MenuViewer.sc.nextLine();//버퍼의 제일 앞의 엔터 처리
		return new PhoneUnivInfo(name, phone, major, year);
	  //★중요:PhoneUnivInfo(자손)객체가 PhoneInfo(부모)으로 자동 형 변환되어 리턴
	}
	
	private PhoneInfo readCompanyFriendInfo(){
		System.out.print("이름: ");
		String name=MenuViewer.sc.nextLine();
		
		System.out.print("전화번호: ");
		String phone=MenuViewer.sc.nextLine();
		
		System.out.print("회사: ");
		String company=MenuViewer.sc.nextLine();		
		
		return new PhoneCompanyInfo(name, phone, company);
	  //★중요:PhoneCompanyInfo(자손)객체가 PhoneInfo(부모)으로 자동 형 변환되어 리턴
	}

	//이 메서드를 호출한 main()이 예외 객체 처리
	public void inputData() throws MenuChoiceException { 
		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>> ");
		
        int choice = MenuViewer.sc.nextInt();//(예)1엔터(1은 choice, 버퍼앞에는 엔터)
       
      //입력한 정수가 1보다 작거나  3보다 크면 MenuChoiceException예외 객체 생성(수동)
		if (choice < INPUT_SELECT.NORMAL || choice > INPUT_SELECT.COMPANY) {
			throw new MenuChoiceException(choice);
		}
        
        MenuViewer.sc.nextLine();//버퍼의 제일 앞의 엔터 처리
        
        PhoneInfo info=null; //지역변수 초기값
        switch(choice) {
		case INPUT_SELECT.NORMAL: //1 일반
			info=readFriendInfo(); break;
			
		case INPUT_SELECT.UNIV:   //2 대학
			info=readUnivFriendInfo(); break;
			
		case INPUT_SELECT.COMPANY://3 회사 
			info=readCompanyFriendInfo(); //break;
        }
        
        boolean isAdded=infoStorage.add(info);
        if(isAdded==true) System.out.println("데이터 입력이 완료되었습니다. \n");
        else System.out.println("이미 저장된 데이터입니다. \n");
        
	}
	
	public String[] searchData(String name){//이름으로 검색
		ArrayList<PhoneInfo> info=search(name);
		String[] nameset=new String[info.size()];
		if(info.size()==0) { //size():객체 수 ==0이면 같은 이름이 없다
			return null; 
		}else { //같은 이름이 3명 있으면
			for(int i=0;i<info.size();i++) {
				nameset[i]=info.get(i).toString();
			}
			return nameset;
		}		
	}
	
	ArrayList<PhoneInfo> search(String name){
		ArrayList<PhoneInfo> samename=new ArrayList<PhoneInfo>();
		Iterator<PhoneInfo> itr=infoStorage.iterator();
		while(itr.hasNext())
		{
			PhoneInfo curInfo=itr.next();
			if(name.equals(curInfo.name)) {
				samename.add(curInfo);
			}			
		}
		return samename;
	}
	
	public boolean deleteData(String name) {
		Iterator<PhoneInfo> itr=infoStorage.iterator();
		int deletecount=0;
		
		//가져올 객체가 있으면 True, 없으면 False를 리턴
		while(itr.hasNext()) {	
	        PhoneInfo curInfo=itr.next(); 
	        if(name.equals(curInfo.name)) {
	        	itr.remove();//삭제
	        	deletecount++;		        	
	        }
		}
		if(deletecount!=0) return true;
		else return false;
	}
	
	private void readFromFile(){
		if(dataFile.exists()==false) {//파일이 존재하면 true, 없으면 false
			System.out.println("파일이 준비되어 있지 않습니다.");
			return; //메서드 종료
		}
		
		try {
			FileInputStream file=new FileInputStream(dataFile);
			ObjectInputStream in=new ObjectInputStream(file);
			
			while(true) {
				PhoneInfo info=(PhoneInfo) in.readObject();//Object타입->(PhoneInfo)강제형변환
				if(info==null) break;//더 이상 읽어올 데이터가 없으면 빠져나감
				infoStorage.add(info);//첫 번째 데이터 추가
			}
			in.close();
			
		} catch (FileNotFoundException e) {
			return;//아무 메세지없이 메서드 종료
		} catch (IOException e) {
			return;
		} catch (ClassNotFoundException e) {
			return;
		}
	}
	
	//HashSet에 저장된 데이터를 텍스트 파일에 바로 문자열로 저장
	public void storeToFile() {
		try {
			FileOutputStream file=new FileOutputStream(dataFile);
			ObjectOutputStream out=new ObjectOutputStream(file);
			
			Iterator<PhoneInfo> itr=infoStorage.iterator();//인덱스가 없어서 지팡이 
			//HashSet에 저장된 데이터 있는동안 지팡이로 데이터를 가리켜 파일에 저장
			//더 이상 저장된 데이터 없으면 false로 반복문 종료
			while(itr.hasNext()) out.writeObject(itr.next());//{}생략가능
			
			out.close();//파일 닫아준다.			
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일에 저장시 오류. 경로명 확인해보세요~");
		}
	}
}
