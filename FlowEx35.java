
public class FlowEx35 {

	public static void main(String[] args) {
		int i;
		int j;
		for (i = 1; i < 10; i++) {
			
		outer:for (j = 2; j < 10; j++) {
				if (i * j == 72) {
					System.out.print(j + "*" + i + "=" + i * j + "\t");
				break outer;
				}
			}

			System.out.println();
			
		}

	}
}
