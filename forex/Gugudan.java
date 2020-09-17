package forex;

public class Gugudan {

	public static void main(String[] args) {
		//구구단 출력
		int i,j;
		for(i=2;i<=9;i++) {
			System.out.println("");
			for(j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+(i*j));//2x1~9
			}
			System.out.println();
			//
			for(i=2;i<=9;i++) {
				System.out.println("");
				for(j=1;j<=9;j++) {
					System.out.println("\t"+i+"단 "+i+"x"+j+"="+(i*j));//2x1~9
				}
		}
	}
	}}

