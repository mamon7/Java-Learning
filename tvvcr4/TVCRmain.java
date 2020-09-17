package tvvcr4;

public class TVCRmain {

	public static void main(String[] args) {
		
		//new Electronics();//미완성된 추상 클래스이므로 객체 생성 불가
		
		TV tv1 = new TV();
		
		TV tv2 = new TV("삼성");
		tv2.power();
		tv2.power();
		TVCR tvcr = new TVCR("LG");
		tvcr.power();
		tvcr.power();
		
		for(int i=1;i<=10;i++) {
			tvcr.channelUp();//0->1씩 증가하여 10으로 
		}
		
		tvcr.show();//맴버변수의 값 츨력
	}

}
