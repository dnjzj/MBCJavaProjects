package ch2;

public class PrintingMethod {

	public static void main(String[] args) {

		System.out.println("나는");
		System.out.println("오늘 아침을");
		System.out.println("먹었다.");
		
		System.out.print("나는\n오늘 아침을\n먹었다\n");
		
		int a = 5, b = 7;
		System.out.printf("%d + %d = %d\n", b, a, (a+b));
		
		System.out.printf("%10d\n", a);		// 10칸 확보 후 출력
		System.out.printf("%20d\n", a);		// 20칸 확보 후 출력
		System.out.printf("%020d\n", a);	// 20칸 확보 후 빈곳을 0으로 채워 출력
		System.out.printf("%-10d\n", a);	// 10칸 확보 후 왼쪽 정렬로 출력
		System.out.printf("%+10d\n", a);	// 10칸 확보 후 출력, 부호 출력
		//결과: 
		//        5
		//                  5
		//00000000000000000005
		//5         
		//       +5
		
		double c = 1234.56789;
		System.out.printf("%f\n", c);
		System.out.printf("%.3f\n", c);
		System.out.printf("%20.3f\n", c);	// 20칸 확보 후 소수점 3자리까지 출력
		System.out.printf("%020.3f\n", c);
		System.out.printf("%-20.3f\n", c);	// 20칸 확보 후 왼쪽 정렬로 출력
		//결과:
		//1234.567890
		//1234.568
		//            1234.568
		//0000000000001234.568
		//1234.568      
		
		String str = "Hello, world!";
		System.out.printf("%s\n", str);		// 기본 왼쪽정렬 출력
		System.out.printf("%30s\n", str);	// 30칸 확보 후 출력
		System.out.printf("%-30s\n", str);	// 30칸 확보 후 왼쪽 정렬로 출력
		//결과:
		//Hello, world!
		//        Hello, world!
		//Hello, world!                 
		
		int d = 15;
		System.out.printf("%10d\n", d);	// 15
		System.out.printf("%10o\n", d);	// 17(8진수)
		System.out.printf("%10x\n", d);	// f(16진수)
		System.out.printf("%10X\n", d);	// F
		
		
	}

}
