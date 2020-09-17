
public class ExceptionTest {
	public static void main(String[] args) {
		String[] s = { "10", "20", "1.23", "40" };
		// 각 문자열 값을 정수로 변환
		int num;
		// 문자열 값을 정수로 변환
		//예외발생 가능성이 있는부분블럭->마오 ->둘러싸기 도구 ->try~catch블록
		
			for (int i = 0; i < s.length; i++) {
				try {//1.예외발생시 예외객체생성
				num = Integer.parseInt(s[i]);
				System.out.println("정수값" + num);
				
				} catch (NumberFormatException e) {//2.catch에서 예외객체 잡아서
					System.out.println(s[i]+"은 정수로 변환 안됨.");//3.예외처리
		}
		// "1.23":NumberFormatException->강제종료
	}

}
}
