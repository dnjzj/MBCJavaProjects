package quiz;

/*
 * 2차원 배열
 * 
 */
public class ArrayQuiz2 {
	public static void main(String[] args) {
		// Q. 다음 numArr의 값의 총합과 평균을 구하여 출력하세요
		int[][] numArr = {
				{5,5,5,5,5},		// 5개
				{10,10,10,10,10},	// 5개
				{20,20,20},			// 3개
				{30,30,30}			// 3개
		};
		
		int sum = 0;
		int count = 0;				// item(배열 요소, elements) 개수
		double avg = 0;
		
		for(int i = 0; i < numArr.length; i++) {
//			count += numArr[i].length;// 여기서 카운트하는 것도 가능
			for(int j = 0; j < numArr[i].length; j++) {
				sum += numArr[i][j];
				count += 1;
			}
		}
		avg = sum / (double)count;
		
		System.out.println("총합: " + sum);			// 225
		System.out.println("평균: " + avg);			// 14.0625
//		System.out.println("배열 요소 개수: " + count);	// 16
		/* 결과
		총합: 225
		평균: 14
//		배열 요소 개수: 16
		*/
		
		
	}
}
