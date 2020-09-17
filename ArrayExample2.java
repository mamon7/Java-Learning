import java.util.Arrays;

//2차원 배열
public class ArrayExample2 {

	public static void main(String[] args) {
		/*** 2차원 배열 선언하는 방법-1 ***/
		int[][] m = new int[2][3]; // [행] [열]		
		System.out.println(Arrays.toString(m[0]));
		System.out.println(Arrays.toString(m[1]));
		
		for(int i=0;i<m.length;i++) {
			System.out.println(Arrays.toString(m[i]));
		}
		
		System.out.println(m[0][0]);//기본값 출력
		System.out.println(m[0][1]);
		System.out.println(m[0][2]);
		System.out.println(m[1][0]);
		System.out.println(m[1][1]);
		System.out.println(m[1][2]);
		
		//조건 연산자: (조건문)?참:거짓
		int i, j;
		for(i=0;i<m.length;i++) {
			for(j=0;j<m[i].length;j++) {//0 1 2
				System.out.print(m[i][j]+((j!=m[i].length-1)?",":""));
			}
			System.out.println();//커서를 아래로
		}
		System.out.println();//커서를 아래로
		
		
		
		/*** 2차원 배열 선언하는 방법-2(가변배열-정석219) ***/
		int[][] e = new int[2][];
		System.out.println(Arrays.toString(e));
		
		e[0]=new int[2];//0:기본값
		e[1]=new int[3];
		
		e[0][0]=85;
		e[0][1]=99;
		
		e[1][0]=88;
		e[1][1]=100;
		e[1][2]=95;
		
		System.out.println("출력방법-1");
		System.out.println(Arrays.toString(e[0]));//[85,99]
		System.out.println(Arrays.toString(e[1]));//[88, 100, 95]
		
		System.out.println("출력방법-2");
		for(i=0;i<e.length;i++) {
			System.out.print("[");
			for(j=0;j<e[i].length;j++) {
				System.out.print(e[i][j]+((j==e[i].length-1)?"":", "));
			}
			System.out.println("]");//]출력 후 커서를 아래로
		}
		System.out.println();//커서를 아래로
		
		/***2차원 배열 선언하는 방법-3***/		
		int[][] s = new int[2][];
		
		s[0]=new int[] {87, 93};
		s[1]=new int[] {97, 88, 100};
		
		for(i=0;i<s.length;i++) {
			for(j=0;j<s[i].length;j++) {
				System.out.print(s[i][j]+((j==s[i].length-1)?"":", "));
			}
			System.out.println();//커서를 아래로
		}
		System.out.println();//커서를 아래로
		
		 /***2차원 배열 선언하는 방법-4***/	
		int[][] java = { 
				{95, 97},         //1반     
				{98, 99, 100, 75},//2반   
				{100, 88, 92}     //3반
			       };
		//총합계와 총평균 구하기
		int hap=0, len=0;
		for(i=0;i<java.length;i++) {
			len+=java[i].length;//0+2+ 4+ 3
			
			for(j=0;j<java[i].length;j++) {
				hap+=java[i][j];
			}
		}
		System.out.println("java의 총합="+hap);
		System.out.println("java의 총평균="+(double)hap/len);
		
		
		//각 반의 java 성적의 합계와 평균을 구하기

		 hap=0; 

		 len=0;

		 //1반

		for(i=0;i<1;i++){

			len+=java[0].length;

			System.out.println("1반 인원은 "+len+"명");

			for(j=0;j<java[0].length;j++) {

				System.out.println((i+1) + "반의 학생(" + (j) + ")의 점수?  "+java[0][j]+"점");

							hap+=java[0][j];

			}

		}

		System.out.println("1반 의 총합="+hap);

		System.out.println("1반 의 총평균="+(double)hap/len);

		System.out.println();

		hap=0; 

		 len=0;

		 //2반

		for(i=0;i<1;i++){

			len+=java[1].length;

			System.out.println("2반 인원은 "+len+"명");

			for(j=0;j<java[1].length;j++) {

				System.out.println((i+2) + "반의 학생(" + (j) + ")의 점수?  "+java[1][j]+"점");

							hap+=java[1][j];

			}

		}

		System.out.println("2반 의 총합="+hap);

		System.out.println("2반 의 총평균="+(double)hap/len);

		System.out.println();

		hap=0; 

		 len=0;

		 //3반

		for(i=0;i<1;i++){

			len+=java[2].length;

			System.out.println("3반 인원은 "+len+"명");

			for(j=0;j<java[2].length;j++) {

				System.out.println((i+3) + "반의 학생(" + (j) + ")의 점수?  "+java[2][j]+"점");

							hap+=java[2][j];

			}

		}

		System.out.println("3반 의 총합="+hap);

		System.out.println("3반 의 총평균="+(double)hap/len);

				
		
		
		
		
		

	}

}
