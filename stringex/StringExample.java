package stringex;

public class StringExample {

	public static void main(String[] args) {
		//문자열 객체 생성 방법-2가지
		String s1="문자열1";//문자열 상수,"문자열 상수" 객체 생성하면 공유상수풀에 등록
		String s2="문자열1";//s1과 s2는 주소, 같은 문자열 객체는 같은 주소로 공유

		//비교연산자(수와 수를 비교): > >= ==(같다) !=(다르다)
		//'a'(97)>'b'(98)  100<=200
		if(s1 == s2) System.out.println("같은 주소");
		else System.out.println("다른주소");//?같은 주소
		
		//String 문자열 객체 생성 방법-두번째 (보편적 방법)
		String s3=new String("문자열1");//new 생성자()로 객체 생성하면 새로운 객체 생성
		if(s1 == s3) System.out.println("같은 주소");
		else System.out.println("다른주소");//?다른 주소
		
		/*****참조변수의 주소를 비교하는 것은 중요하지 않음.
		 * 참조변수가 참조하는 객체의 값을 비교하는 것이 중요함.*****/
		
		if(s1.equals(s2))//s1이 참조하는 문자열과 s2가 참조하는 문자열이 같니? true, false(boolean 타입)
			System.out.println("같은 문자열");
		else System.out.println("다른 문자열");
		
		if(s1.equals(s3))//s1이 참조하는 문자열과 s3가 참조하는 문자열이 같니? true, false(boolean 타입)
			System.out.println("같은 문자열");
		else System.out.println("다른 문자열");
		
	}	

}
