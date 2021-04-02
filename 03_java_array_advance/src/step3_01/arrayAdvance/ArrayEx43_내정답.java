package step3_01.arrayAdvance;
//2021/04/02 16:35 ~ 
import java.util.Random;
import java.util.Scanner;

// # 소코반

public class ArrayEx43_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 7;
		final int PLAYER = 2;
		final int BALL = 3;
		final int GOAL = 7;
		final int WALL = 9;
		
		int[][] map = new int[SIZE][SIZE];
		
		int wallCount = 0;
		int pY = 0;
		int pX = 0;
		int ballY = 0;
		int ballX = 0;
		int goalY = 0;
		int goalX = 0;
		
		// 벽 설치
		
		System.out.print("설치하고 싶은 벽의 개수를 입력하세요: ");
		wallCount = scan.nextInt();
		
		int temp = wallCount;
		while(temp != 0) {
			int rX = ran.nextInt(SIZE);
			int rY = ran.nextInt(SIZE);
				if(map[rY][rX]==0) {
					map[rY][rX] = WALL;
					temp --;
				}
		}		
		
		// 공 설치
		
		while (true) {
			int rX = ran.nextInt(SIZE-2)+1;
			int rY = ran.nextInt(SIZE-2)+1;
				if(map[rY][rX]==0) {
					map[rY][rX] = BALL;
					break;
				}
		}
		
		// 골대 설치
		
		while (true) {
			int rX = ran.nextInt(SIZE);
			int rY = ran.nextInt(SIZE);
				if(map[rY][rX]==0) {
					map[rY][rX] = GOAL;
					break;
				}
		}
		
		//화면 출력
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		// 플레이어 배치
		
		while(true) {
			System.out.println("플레이어를 배치하고 싶은 위치를 입력하세요.");
			System.out.print("X좌표: ");
			pX = scan.nextInt();
			System.out.print("Y좌표: ");
			pY = scan.nextInt();
			if(map[pY][pX] == 0) {
				map[pY][pX] = PLAYER; 
				break;
			}
		}
		
		//게임 시작
		  //화면출력
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				
			}
		}
		
		
		
		scan.close();
		
	}

}
