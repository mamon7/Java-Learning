
public class ExceptionTest2 {
	public static void main(String[] args) {
		String[] s = { "10", "20", "1.23", "40" };
		int num;

		for (int i = 0; i < s.length; i++) {
			try {
				num = Integer.parseInt(s[i]);
				System.out.println("정자로 반환된 값은" + num);
			} catch (NumberFormatException e) {
				System.out.println(s[i] + "예외 처리 됨/");

			}

		}
	}
}
