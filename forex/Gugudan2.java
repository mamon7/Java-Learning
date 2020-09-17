package forex;

public class Gugudan2 {

	public static void main(String[] args) {
		for(int a=2;a<=9;a++) {
			System.out.print(a+"단"+"\t");
		}
		int i,j;
		for(i=1;i<=9;i++) {
		System.out.println();	
			for(j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
		}System.out.println();

	}

}
