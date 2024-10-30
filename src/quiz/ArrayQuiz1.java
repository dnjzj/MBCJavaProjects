package quiz;

import java.util.Arrays;

// 2024.10.30.Wed. (13:10~)
public class ArrayQuiz1 {
	public static void main(String[] args) {
		// Quiz 1) 1차원 배열을 활용하여 1000개 짜리 int 배열을 생성한 후 배열 요소에 모든 값을 1~100 사이의 랜덤 숫자로 채워 해당 내용을 출력하세요
		int[] arr = new int[1000];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
//		// 결과 출력
//		System.out.println(Arrays.toString(arr));
//		// 줄바꿈 출력
//		for(int i = 0; i < arr.length; i++) {
//			if(i % 100 == 0)	System.out.println();
//			else System.out.print(arr[i] + " ");
//		}
		
		// Quiz 2) 1000개의 랜덤 숫자 중 각 숫자가 몇 번씩 나왔는지 세어 출력하세요
		// 제출)
		int[] count = new int[100];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j <= count.length; j++) {
				if(j == arr[i])
					count[j-1]++;
			}
		}
		
		System.out.println("각 숫자가 출력된 횟수: " + Arrays.toString(count));
		for(int i = 1; i <= count.length; i++) {
			if(i % 10 == 1) System.out.println();
//			System.out.printf("%d -> %d회(%d) \t", i, count[i-1], i / 10);
			
			String value;
			if(i / 10 == 0) {
				value = "0" + i;
//			} else if(i / 10 < 10) {
//				value = "0" + i;
			} else {
				value = i + "";
			}
			
			System.out.printf("%s -> %d회\t", value, count[i-1]);
		}
		System.out.println();
		System.out.println();
		
		// Quiz 2) 1000개의 랜덤 숫자 중 각 숫자가 몇 번씩 나왔는지 세어 출력하세요
		// 정답)
		// 1-100 사이의 숫자 개수를 저장할 공간 선언
		int[] cnt = new int[100];
		
		// 1000개의 랜덤값에서 1-100 숫자에 대한 개수 계산
		for(int j = 1; j <= 100; j++) {				// 1~100
			for(int i = 0; i < arr.length; i++) {// 0~99
				if(j == arr[i])
					cnt[j-1]++;
			}
		}
		
		int check = 0;// 개수 체크
		for(int i = 0; i < cnt.length; i++) {
			System.out.println((i+1) + "이 나온 횟수: " + cnt[i]);
			check += cnt[i];
		}
		System.out.println("총 개수 검증: " + check + "개");
	}
}
