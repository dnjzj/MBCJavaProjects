package ch5;

import java.util.Arrays;

// 2024.10.30.Wed.
public class MainMethod {

	/*
	 * 자바에서는 프로그램을 실행하기 위해서 main() 메서드를 작성하여 동작합니다.
	 * 이 main()에는 프로그램 실행 시 전달받은 값으로 String[] args를 사용하고 있습니다.
	 * - args: arguments, 인자
	 */
	public static void main(String[] args) {
		 
		/* 
		 * 테스트 방법: Run > Run Configurations > Arguments 탭 > Program arguments > 값 입력
		 * Ex) test1 test2 test3 -> [test1, test2, test3]
		 * Ex) -d test_main_args -> [-d, test_main_args]
		 * 활용 예) java -version
		 */
		
		System.out.println(args);					// [Ljava.lang.String;@7960847b
		System.out.println(Arrays.toString(args));	// []
		
		// Ex) -d test_main_args 
		// 활용 예) java -version
		if(args[0].equals("-d")) {
			System.out.println("옵션 d에 대한 작업을 진행합니다...");
			System.out.println("옵션 d의 내용은 \"" + args[1] + "\"에 대한 내용입니다.");
		}
	}
	
}
