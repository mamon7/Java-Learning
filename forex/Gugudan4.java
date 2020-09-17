package forex;

import java.util.Scanner;

public class Gugudan4 {

	public static void main(String[] args) {
		//구구단 중에서 "두 수를 곱해서 72가 되는 것(조건)"만 출력
		int i;
		int j;
		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++)
				if (i * j == 72)
					System.out.println(i + "*" + j + "=" + i * j);
		}
		System.out.println();
		// 구구단 중에서 "두 수를 곱해서 72가 되는 것(조건)"만 출력
		i = 0;
		j = 0;
		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++)
				if (i == 9 && j == 8)
					System.out.println(i + "*" + j + "=" + i * j);
		}
		System.out.println();
		// 구구단 중에서 "두 수를 곱해서 72가 되는 것(조건)"만 출력(이름 붙은 반복문 -정석179 참조)
		i = 0;
		j = 0;
		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++)
				if (i == 8 && j == 9)
					System.out.println(i + "*" + j + "=" + i * j);
		}

	}

}
