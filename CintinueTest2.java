
public class CintinueTest2 {

	public static void main(String[] args) {
		
		/**
		 * 1과 50사이의 숫자를 출려하되 그 중7의 배수인 것은 제외 (조건)
		 * 출력시 1줄에 5개 씩 출력(탭 크기 만큼 띄워서)
		 **/
		int i, count=0;
		for(i=1;i<=50;i++) {
			if(i%7 == 0) continue;
			count++;
			if(count%5 != 0)System.out.print(i+"\t");//count가 5의 배수가 아니면 옆으로 출력
			else System.out.println(i);//5의 배수이면 출력 후 커서를 아래로 
		}
	}

}
