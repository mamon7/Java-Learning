package tv;


public class TVmain {

	public static void main(String[] args) {
	TV 	tv1	= new TV();//필드의 기본값이 저장된 객체 생성

	System.out.println(tv1.channel);
	System.out.println(tv1.color);
	System.out.println(tv1.power);
	
	
	tv1.power();
	
	int i;
	for(i=1;i<=105;i++) {
		tv1.channelDown();
		System.out.println(tv1.channel);
	}
	tv1.power();
	tv1.channelUp();
	}

}
