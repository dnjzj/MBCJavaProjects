package ch5;

import java.util.Arrays;

/*
 * 다차원 배열
 * - 1차원 배열, 2차원 배열
 */
public class ArrayExample2 {

	public static void main(String[] args) {
		// 1차원 배열 : 하나의 배열 값을 가지고 만들어진 배열(* 값 하나하나를 배열 요소(element)라고 함)
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("배열의 길이 : " + numbers.length);// 배열의 길이 : 10
		
		
		// 2차원 배열: 배열의 요소를 int[](배열)로 가지고 있는 배열
		int[][] arr2 = {
				{1,2,3},	// arr2[0]
				{4,5,6},	// arr2[1]
				{7,8,9},	// arr2[2]
				numbers		// arr2[4]
		};

		System.out.println(Arrays.toString(arr2[0]));
		System.out.println(Arrays.toString(arr2[1]));
		System.out.println(Arrays.toString(arr2[2]));
		System.out.println(Arrays.toString(arr2[3]));
		/*
		 * 결과:
			[1, 2, 3]
			[4, 5, 6]
			[7, 8, 9]
			[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		*/
		
		System.out.println("6 출력: " + arr2[1][2]);
		System.out.println("8 출력: " + arr2[2][2]);
		
		System.out.println("arr2[1] 배열의 길이: " + arr2[1].length);
		System.out.println("arr2[3] 배열의 길이: " + arr2[3].length);
		System.out.println("arr2[3] 배열의 마지막값은? " + arr2[3][numbers.length-1]);
		/*
		 * 결과:
			6 출력: 6
			8 출력: 9
			arr2[1] 배열의 길이: 3
			arr2[3] 배열의 길이: 10
			arr2[3] 배열의 마지막값 출력: 10
		*/
		
		// 3차원 배열: int[][](2차원 배열)을 요소로 가지고 있는 배열
		// int[][][] arr3 = {arr2, arr2, arr2, arr2};
		int[][][] arr3 = new int[4][][];
		// {null, null, null, null}
		arr3[0] = arr2;
		arr3[1] = arr2;
		arr3[2] = arr2;
		arr3[3] = arr2; // numbers는 1차원 배열이기 때문에 대입 안됨. 현재 코드에선 2차원 배열 대입만 가능
		
		// 4차원 배열: int[][][](3원 배열)을 요소로 가지고 있는 배열
		int[][][][] arr4 = { arr3, arr3, arr3, arr3 };
				
		// n차원 배열: 배열의 요소로 (n-1)차원 배열을 가지고 있는 배열
		
	}
}
