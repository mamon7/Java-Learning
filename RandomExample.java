import java.util.Arrays;
import java.util.Random;//java.util -> ex)조미료 같은 역할

//1~45 사이의 로또 번호 선택하여 당첨 여부
public class RandomExample {

	public static void main(String[] args) {
		//선택번호 
		int[] select = new int[6];//000000
		System.out.println(Arrays.toString(select));
		
		//생성자를 호출때마다 다른 씨드값=()안에있는 값이 현재시간이용하여 자동 설정
		Random r=new Random(3); //씨드 값이 3 같으면 같은 난수(랜덤값)가 발생한다.
		//int nextInt(int n) 0<=  <n 정수인 난수를  결과로 리턴
		System.out.print("선택번호:");
		
		int i;
		for(i=0;i<select.length;i++) {
			select[i]=r.nextInt(45)+1;//1<= <46
			System.out.print(select[i]+" ");
		}
		System.out.println();//커서를 아래로
		
		//당첨번호 
				int[] win = new int[6];//000000
				System.out.println(Arrays.toString(win));
				
				//생성자를 호출때마다 다른 씨드값=()안에있는 값이 현재시간이용하여 자동 설정
				r=new Random(); //씨드 값이 없으면 컴퓨터 시간마다 숫자가 달리 나옴
				//int nextInt(int n) 0<=  <n 정수인 난수를  결과로 리턴
				System.out.print("당첨번호:");
				
				//int i;
				for(i=0;i<win.length;i++) {
					win[i]=r.nextInt(45)+1;//1<= <46
					System.out.print(win[i]+" ");
				}
				System.out.println();//커서를 아래로
				
				//당첨여부 
				Arrays.sort(select);//정렬
				Arrays.sort(win);//정렬
		
				if (Arrays.equals(select, win)) System.out.println("당첨");
				else System.out.println("당첨 안됨");
		
		
	}
}
