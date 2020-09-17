package Copy;

public class StringExample {
//정석 206참조
	public static void main(String[] args) {
		String str="김미강";
		System.out.println(str);//주소만으로도 값이 출력
		
		//배열안에 주소
		String[] s= {"홍길동","광개토대왕","김구"};
		System.out.println(s);
		
		System.out.println(s[0]);//s[1]: 홍길동 객체의 주소
		System.out.println(s[1]);
		System.out.println(s[2]);
		int i;
		for(i=0;i<s.length;i++) {
			System.out.print(s[i]+"  ");
		}
		System.out.println();//커서를 아래로
		//"광개토대왕"에서'토' 문자 추출 
		char ch=s[1].charAt(2);
		System.out.println(ch);
		
		
		
		
	}
}
