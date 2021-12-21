
public class StringExample {
	
	public static void main(String[] args ) {
		
		// 변수 선언, 사용
		// 데이터 타입(자료형) 변수명; <-- 선언
		// 데이터 타입(자료형) 변수명 = 값; <-- 선언과 동시에 초기화
		
		String name;
		String home;
		String description;
		
		name = "길정우";
		home = "흑석동";
		description = name + "의 집은 " + home + "이다.";
		
		//문자형은 "정수형"
		char c_name = description.charAt(0);
		
		
		System.out.println(c_name);
		System.out.println(description);
	}

}
