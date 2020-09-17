package string;

public class StringMethod {

	public static void main(String[] args) {
		String s1="자바";//"문자열 상수"만으로도 객체 생성

		String s2=s1.concat("프로그램");//두 문자열을 결합하여 새로운 문자열 생성
		System.out.println(s2);
		//indexOf()-해당 문자열의 시작 인덱스번호 리턴
		//주어진 문자나 문자열의 존재 여부 확인 가능(-1:해당 문자열이 없으면)
		if(s2.indexOf("자바") != -1)System.out.println("자바와 관련");
		else System.out.println("자바와 관련 X");
		
		String s3=s2.replace("자바", "JAVA");//"자바"->"JAVA" 변경
		System.out.println(s3);
		
		//대문자"JAVA"->소문자 "java"로 변경
		String s4=s3.toLowerCase();
		System.out.println(s4);
		
		//s3와 s4 참조하는 값 비교(대소문자 무시하고 비교)=>true/false
		System.out.println(s3.equalsIgnoreCase(s4));//true
		
		
		//split("구분자"): 문자열을 구분자로 분리
		String animals ="cat,dog,rabbit";
		String[] arr=animals.split(",");//"cat""dog""rabbit"로 분리
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}System.out.println();//커서를 아래로
	
		//join("구분자",join할 문자열들) :"cat""dog""rabbit"을 구분자를 넣어서 하나로 결합
		
		String s5=String.join("/", arr);//"cat/dog/rabbit"
		System.out.println(s5);
	}
	

}
