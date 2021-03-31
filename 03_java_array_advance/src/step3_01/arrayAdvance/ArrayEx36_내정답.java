package step3_01.arrayAdvance;
//2021/03/31 16:29 ~ 17:37
/*
 *	# 2차원배열 기본문제[2단계]
*/

import java.util.Scanner;

public class ArrayEx36_내정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		
		System.out.print("인덱스1 입력: ");
		int idx1 = scan.nextInt();
		System.out.print("인덱스2 입력: ");
		int idx2 = scan.nextInt();
		
		System.out.println("값 = " + arr[idx1][idx2]);
		System.out.println();
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
		System.out.print("값 입력: ");
		int value = scan.nextInt();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == value) {
					System.out.print("인덱스1 출력: " + i +" " + "인덱스2 출력: " + j);
				} 
			}
		}
		System.out.println();
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		
		value = 0;
		idx1 = 0;
		idx2 = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(value < arr[i][j]) {
					value = arr[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println();
		System.out.print("인덱스1: " + idx1 + " " + "인덱스2: " + idx2);
		System.out.println();
		
		
		// 문제 4) 값 2개를 입력받아 값 교체

		System.out.println();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("값1: ");
		int value1 = scan.nextInt();
		System.out.print("값2: ");
		int value2 = scan.nextInt();
		
		int idx1_i = 0;
		int idx1_j = 0;
		int idx2_i = 0;
		int idx2_j = 0;
		int temp = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(value1 == arr[i][j]) {
					idx1_i = i;
					idx1_j = j;
				}
				if(value2 == arr[i][j]) {
					idx2_i = i;
					idx2_j = j;
				}
			}
		}
		
		temp = arr[idx1_i][idx1_j];
		arr[idx1_i][idx1_j] = arr[idx2_i][idx2_j];
		arr[idx2_i][idx2_j] = temp;
		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		scan.close();

	}

}
