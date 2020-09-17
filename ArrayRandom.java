import java.util.Arrays;

public class ArrayRandom {

	public static void main(String[] args) {
		int[] arr=new int[10];//기본값 0으로 채워진 int[]배열 객체
	
		int i;
		for(i=0;i<arr.length;i++) 
			arr[i]=(int)(Math.random()*10);//0~9 사이의 정수값을 랜덤으로
			System.out.println(Arrays.toString(arr));
			//	0.0<=Math.random()<1.0 실수값(예:0.0000123)
			//	0.0	<=Math.random()*10<10.0
			//	0<=(int)(Math.random()*10)<10실수 ->정수
		
			//공식 (int)(Math.random()*5)+11 => 11~15 정수를 랜덤으로
			for(i=0;i<arr.length;i++)
				arr[i]=(int)(Math.random()*11)+10;		
			System.out.println(Arrays.toString(arr));

	}

}
