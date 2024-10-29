package ch2;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("> ");
		String line = scan.nextLine();
		System.out.println("사용자가 입력한 문자열: " + line);
		
		// 띄어쓰기 전까지만 입력됨
		System.out.print("\nnext()> ");
		String word = scan.next();
		System.out.println("사용자가 입력한 단어: " + word);
		
		scan.nextLine();// 버퍼에 저장된 값 처리
		
		System.out.print("\nhas next boolean: ");
		boolean b = scan.hasNextBoolean();
		System.out.println("boolean 포함 여부: " + b);
		
		scan.nextLine();// 버퍼에 저장된 값 처리
		
		System.out.print("\nnextInt()> ");
		int i = scan.nextInt();
		System.out.println("사용자가 입력한 정수 더하기 100: " + (i+100));
		
		scan.nextLine();// 버퍼에 저장된 값 처리
		
		System.out.print("\nnextDouble()> ");
		double d = scan.nextDouble();
		System.out.println("사용자가 입력한 실수 더하기 100: " + (d+100));
		
		// 메모리 정리
		scan.close();
	}
}
