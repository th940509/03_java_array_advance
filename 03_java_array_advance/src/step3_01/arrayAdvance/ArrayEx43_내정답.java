package step3_01.arrayAdvance;
//2021/04/06 22:30 ~ 23:11
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
		while (true) {
		  //화면출력
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				if(map[i][j]==PLAYER) System.out.println("옷");
				else if(map[i][j]==WALL) System.out.println("!");
				else if(map[i][j]==GOAL) System.out.println("G");
				else if(map[i][j]==BALL) System.out.println("*");
				else                     System.out.println(map[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
		//골대에 공을 넣으면 게임 종료
		if (ballY == goalY && ballX == goalX) {
			System.out.println("게임 종료");
			break;
		}
		
		System.out.print("상1하2좌3우4 입력: ");
		int move = scan.nextInt();
	
		//현재 위치 저장하기
		int yy = pY;
		int xx = pX;
		
		if(move==1) yy--;
		else if(move==2) yy++;
		else if(move==3) xx--;
		else if(move==4) xx++;
		
		//예외처리
		if(SIZE <= xx || xx < 0) continue;
		if(SIZE <= yy || yy < 0) continue;
		if(map[yy][xx] == WALL || map[yy][xx] == GOAL) continue;
		
		//공을 만났을때
		if (map[yy][xx] == BALL) {
			int yyy = ballY;
			int xxx = ballX;
			if		(move == 1) yyy--;
			else if (move == 2) yyy++;
			else if (move == 3) xxx--;
			else if (move == 4) xxx++;

			// 예외처리
			if (SIZE <= xxx || xxx < 0) continue;
			if (SIZE <= yyy || yyy < 0) continue;
			if (map[yyy][xxx] == WALL)  continue;
			
			// 공 이동시키기
			map[ballY][ballX] = 0;
			ballY = yyy;
			ballX = xxx;
			map[ballY][ballX] = BALL;
		}
		
		// 캐릭터 이동시키기
		map[pY][pX] = 0;
		pY = yy;
		pX = xx;
		map[pY][pX] = PLAYER;
		
		
		}
		
		scan.close();
	}

}
