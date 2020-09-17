import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		/** 배열 사용하지 않았을 때 **/
		int s1 = 83;
		int s2 = 88;
		int s3 = 87;
		int s4 = 95;
		int hap = s1 + s2 + s3 + s4;
		System.out.println("전체 합 :" + hap);
//	int i;
		hap = 0;
//	
//	for(i=1;i<arr.length;i++) {
//
//	} 
		// 점수사이에 일정한 규칙이 없어서 반복문 사용 불가
		int[] scores = { 83, 88, 87, 95 };// int만 저장
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		hap = 0;
		hap = scores[0] + scores[1] + scores[2] + scores[3];
		System.out.println(hap);
		int i;
		hap = 0;
		// a=i+i;
		// a+=i;

		for (i = 0; i < 4; i++) {
			// hap=scores[i]+scores[i];
			hap += scores[i];
		}
		System.out.println("배열 for문 합:" + hap);

		hap = 0;

		for (i = 0; i <scores.length; i++) {//i:카운팅(인덱스번호),반복문 실행
			// hap=scores[i]+scores[i];
			hap += scores[i];
		}
		System.out.println("배열 for문 합(length 이용):" + hap);
		// 배열 객체 :length=4(가장 마지막 인덱스 번호+1)
		double avg=(double)hap/scores.length;
		System.out.println("평균="+(double)hap/scores.length);
		
		scores[1]=100;//88->100 변경
		hap = 0;

		for (i = 0; i <scores.length; i++) {//i:카운팅(인덱스번호),반복문 실행
			// hap=scores[i]+scores[i];
			hap += scores[i];
		}
		System.out.println("배열 for문 합(length 이용):" + hap);
		// 배열 객체 :length=4(가장 마지막 인덱스 번호+1)
		avg=(double)hap/scores.length;
		System.out.println("평균="+(double)hap/scores.length);
		
		
		char[] ch = { 'a', 'b','c' };
		// 옆으로 출력 -반복문 이용x
		System.out.print(ch[0] + "\t");
		System.out.print(ch[1] + "\t");
		System.out.print(ch[2] + "\t");

		System.out.println();// 커서를 아래로

		for (i = 0; i <ch.length; i++) {
			
			System.out.print(ch[i]+"\t");
		}
		System.out.println();//ch:문자형 배열의 주소 abc값이 출력
		
		System.out.println(ch);//scores:정수형 배열의 주소,[I@15db9742 출력
		System.out.println(scores);
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(scores));//[값,값,값]
		//Arrays 배열을 위한 메소드
		/****************/
		String str1="내면의 ";//문자열 객체 생성 방법-문자열 상수
		String str2=new String("평안");//생성자 호출->객체 생성
		
		System.out.println(str1);//문자열 객체의 주소. 참조하는 값이 출력
		System.out.println(str2);
		
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		/****************/
		
		
	}//toString:메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드 입니다.



}
