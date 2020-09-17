
public class FlowEx33 {

	public static void main(String[] args) {
	int i;
	int j;
	System.out.println("=====break=====가장 가까운 반복문을 빠져나옴");	
	for(i=2;i<10;i++) {
			for(j=1;j<10;j++){
				if(j==5) break;
				System.out.println("[제"+i+"단]"+i+"x"+j+"="+i*j);
			}
			System.out.println();
			
		}System.out.println("=====continue=====멈추는게 아니라 위(j++)로 올라감");
		for(i=2;i<10;i++) {
			for(j=1;j<10;j++){
				if(j==5) continue  ;
				System.out.println("[제"+i+"단]"+i+"x"+j+"="+i*j);
			}
			System.out.println();
		}
	}

}
