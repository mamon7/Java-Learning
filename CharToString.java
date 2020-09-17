//정석 -208p 참조
/*
 * 자바에서 char 배열이 아닌 String 
 * 클래스를 이용해서 문자열을 처리하는  이유는
 * String 클래스가 char 배열에 
 * 여러가지 기능(=메서드)를 추가하여 확장한 것이기 때문이다.
 */
public class CharToString {

	public static void main(String[] args) {
		String s="ABCDE";
		/***String을  char[]로 변환***/
		char[] ch=s.toCharArray();
		System.out.println(ch);//char[] 주소만으로 값이 출력
		
		
		/***char[]를 String로 변환***/
		String s2=new String(ch);
		System.out.println(s2);//문자열 객체의 주소
		
		
	}

}
