
public class ContinueTest {

	public static void main(String[] args) {
	    /**
	     * 1과 10사이의 숫자를 출력하되 그 중 3의 배수인 것은 제외(조건)
	     * 1 2 4 5 7 8 (3 6 9제외)
	     */
		 int i;//1 1
         for(i=1;i<=10;i++) {//continue 바로 위로 i++ 올라감
        	 if(i%3 == 0) continue; //조건문이 어디? 출력하기 전에 조건문으로
        	 System.out.print(i+" ");//1 2 4 5 7 8 10
         }
         System.out.println();//커서를 아래로
         
         /*주의:초기값이 어떤 수로?
          *    조건문에서 <=에서 = 부분을 넣어야 할지 빼야 할지 고민
          *    반복부분에서 순서 중요
         */ 
         i=0;
         while(i<10) {//9<10(참)
        	 i++;//10
        	 if(i%3 == 0) continue;
        	 System.out.print(i+" ");//1 2 4 5 7 8 10
         }
         System.out.println();//커서를 아래로
         
         i=0;
         do {
        	 i++;//10
        	 if(i%3 == 0) continue;
        	 System.out.print(i+" "); //1 2 4...8 10
         }while(i<10);//10<10
         
         
	}

}
