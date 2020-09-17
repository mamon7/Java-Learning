/*
 * 배열은 크기를 늘리거나 줄일 수 없다.
 * 따라서
 * 더 많은 저장 공간이 필요하면 큰 배열 만들고
 * 이전 항목들을 복사해야 된다.
 * 
 * 배열 복사 방법-3
 * Arrays클래스 : 배열을 조작하기 위해 나온 클래스
 */
package Copy;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyExample {

	public static void main(String[] args) {

		/*
		 * 초기갑을 내가 원하는 값으로 한꺼번에 채우고 싶을 때
		 */
		int[] a1 = new int[5];// 기본값 0으로 채워짐
		Arrays.fill(a1, 2); // 초기값 2으로 채워짐
		System.out.println(Arrays.toString(a1));
		// for문을 이용하여 항목값을 모두 3으로 변경 후 출력
		int i = 0;
		for (i = 0; i < a1.length; i++) {
			a1[i] = 3;
		}
		System.out.println(Arrays.toString(a1));
		System.out.println(a1);
		/** 문자형 배열 선언 */
		char[] a2 = new char[3];
		System.out.println(Arrays.toString(a2));
		// 초기값으로 문자 'a'로 채워보세요~
		Arrays.fill(a2, 'a');
//for문을 이용하여 항목값을 모두 'A'으로 변경후 출력	
//단 , 기존의 값('a'=>97의 2진수)을 이용하여 'A'(=>65의 2진수)으로 변경
		for (i = 0; i < a2.length; i++) {
			a2[i] = 'a' - 32;

		}
		System.out.println(Arrays.toString(a2));
		System.out.println((a2));
		System.out.println('a' - 32);
		System.out.println((char) ('a' - 32));
		// 배열 복사 방법

		char[] arr1 = { 'J', 'A', 'V', 'A' };// arr1.length==4

		System.out.println("늘릴 배열 크기 입력:");

		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		// 배열 복사 방법 -1(정석 193p 참조)
		char[] arr2 = new char[arr1.length + len];
		for (i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];

		}
		System.out.println(Arrays.toString(arr2));

		// 배열 복사 방법 -2(정석 194p 참조)
		char[] arr3 = new char[arr1.length + len];
		System.out.println(Arrays.toString(arr3));

		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		// arr1의 인덱스0부터 복사해서
		// arr3의 인덱스 0부터 저장하는데
		// arr1.length의 수만큼 복사
		System.out.println(Arrays.toString(arr3));
		// ★★배열 복사 방법-3
		char[] arr4 = Arrays.copyOf(arr1, arr1.length + len);
		System.out.println(Arrays.toString(arr4));

		/** 빈방에 문자'!'과 문자 '~' 직접 대입 **/
		/*
		 * arr4[4]='!'; arr4[5]='~'; System.out.println(Arrays.toString(arr4));
		 * 
		 * java.lang.ArrayIndexOutOfBoundsException=>배열의 공간이 초과되었다.
		 *
		 */
		// 사용자로부터 값을 입력받아 대입
		String s = null;
		for (i = arr1.length; i < arr4.length; i++) {
			System.out.print("빈 방의 널을  문자 입력: ");
			s = sc.next();// "!"문자열 (객체):객체 안에 메서드를 이용하여 문자 추출
			arr4[i] = s.charAt(0);// '!'문장중에 인덱스 위치에 해당되는 문자 추출하기
		}
		System.out.println(Arrays.toString(arr4));

		System.out.println(arr4);
		int j;
		// for문 이용하여 arr4가 참조하는 값을 출력(J,A,V,A,!,~)
		// 조건연산자: (조건문)?참:거짓
		for (i = 0; i < arr4.length; i++) {

			System.out.print((i != arr4.length - 1) ? arr4[i] + "," : arr4[i]+"\n");
		}

		// 배열 복사 방법-4(배열의 활용 196p)
		arr4 = Arrays.copyOfRange(arr1, 1, 3);
		// 인덱스1~3전까지, 인덱스1~2까지 복사하여 새로운 배열 생성
		System.out.println(Arrays.toString(arr4));
	}

}
