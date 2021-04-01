package step3_01.arrayAdvance;
//2021/04/01 8:02

/*
 *	# 2차원배열 기본문제[3단계]
*/

public class ArrayEx37_내정답 {

	public static void main(String[] args) {
		
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 
		
		int[] garo = new int[3];
		int[] sero = new int[4];
		
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		
		int total = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==0) {
					total += arr[i][j];
					garo[i] = total;
				}
				if(i==1) {
					total += arr[i][j];
					garo[i] = total;
				}
				if(i==2) {
					total += arr[i][j];
					garo[i] = total;
				}
			}
		}
		
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612



	}

}
