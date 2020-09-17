package repeat;

public class ForwhileDowhile2 {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 5; i++) {
			System.out.print(" " + i);
		}
		System.out.println("\n i=" + i);
		i = 1;
		while (i <= 5) {
			System.out.print(" " + i);
			i++;

		}
		System.out.println("\n i=" + i);
		i = 1;
		do {
			System.out.print(" " + i);
			i++;
		} while (i <= 5);
		System.out.println("\n i=" + i);

		System.out.println("반복문을 이용하여 1~10까지의 합을 구하기");
		int r = 0;
		for (i = 1; i <= 10; i++) {

			r += i;
		}
		System.out.println("1~10 더한 합=" + r);
		// 지금부터 while, do~while
		while (i <= 10) {
			i = 0;
			i++;
			r += i;
		}
		System.out.println("while 문으로 더한 합=" + r);
		i = 1;
		r =0;
		do {
			r += i;
			i++;
			
		} while (i <= 10);
		System.out.println("do~while문으로 더한 합=" + r);
	}
}
