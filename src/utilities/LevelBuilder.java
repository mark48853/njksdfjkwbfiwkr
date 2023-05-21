    package utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import objects.PathPoint;

public class LevelBuilder {

	static ArrayList<int[]> q = new ArrayList<int[]>();
	static int RIGHT = 0, UP = 1, LEFT = 2, DOWN = 3;
	static int x, y;
	static PathPoint endPoint = new PathPoint(17, 1);
	static PathPoint startPoint;
	
	public static int[][] getLevelData() {

		int[][] lvlRand = { 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
		};
		
		Random rand = new Random();
		
		int pre = -1;

		int size = 0;
		
		f();
		
		/*
		q.add(new int[] {2, RIGHT}); y+=2;

		while (x > 2 || y < 19) {

			int rng = rand.nextInt(100);

			if (rng % 4 == 0 && y < 19) {
				int dis = Math.min(rand.nextInt(4) + 2, 19 - y);
				q.add(new int[] { dis, RIGHT });
				y += dis;
				pre = RIGHT;
			} else if (rng % 4 == 1 && x > 2) {
				int dis = Math.min(rand.nextInt(4) + 2, x - 2);
				q.add(new int[] { dis, UP });
				x -= dis;
				pre = UP;
			} else if (rng % 8 == 3 && x < 19 && pre == RIGHT) {
				int dis = Math.min(Math.min(rand.nextInt(4) + 2, 19 - y), 19 - x);
				q.add(new int[] { dis, DOWN });
				q.add(new int[] { dis, RIGHT });
				x += dis;
				y += dis;
				pre = RIGHT;
			}
			else
				continue;
		}
		*/
		
		

		pre = -1;
		//x = 19; y = 0;
		for (int[] it : q) {

			int dis = it[0];
			int dir = it[1];
			System.out.println(x + " " + y + " " + dis + " " + dir);
			
			if(dir == LEFT) {
				for(int i = 0; i < dis; i++) {
					if(pre == UP) {
						lvlRand[y][x] = 5; // btol
					}
					else if(pre == DOWN) {
						lvlRand[y][x] = 6;
					}
					else {
						lvlRand[y][x] = 2;
					}
					x--;
					pre = LEFT;
				}
			}
			
			if(dir == RIGHT) {
				for(int i=0;i<dis;++i) {
					if(pre == UP) {
						lvlRand[y][x] = 4;
					}
					else if(pre == DOWN) {
						lvlRand[y][x] = 7;
					}
					else {
						lvlRand[y][x] = 2;
					}
					x++;
					pre = RIGHT;
				}
			}
			
			if(dir == UP) {
				for(int i=0;i<dis;++i) {
					if(pre == RIGHT) {
						lvlRand[y][x] = 6;
					}
					else if(pre == LEFT) {
						lvlRand[y][x] = 7;
					}
					else {
						lvlRand[y][x] = 3;
					}
					y--;
					pre = UP;
				}
			}
			
			if(dir == DOWN) {
				for(int i=0;i<dis;++i) {
					if(pre == RIGHT) {
						lvlRand[y][x] = 5;
					}
					else if(pre == LEFT) {
						lvlRand[y][x] = 4;
					}
					else {
						lvlRand[y][x] = 3;
					}
					y++;
					pre = DOWN;
				}
			}
			
		}

		if(lvlRand[2][18] != 0) lvlRand[2][19] = 2;
		if(lvlRand[3][19] != 0) lvlRand[2][19] = 4;
		
		// generate water
		q = new ArrayList<int[]>();
		int waterZone = 20;
		while(waterZone-- > 0) {
			x = rand.nextInt(20);
			y = rand.nextInt(20);
//			if(lvlRand[y][x] != 0) continue;
			if(lvlRand[y][x] == 0) {
				size = rand.nextInt(6)+2;
				q.add(new int[] {x,y,size});
			}
		}
		
		for(int[] it : q) {
			x = it[0];
			y = it[1];
			size = it[2];
			
			for(int i=x; i<Math.min(19, x+size); ++i)
			for(int j=y; j<Math.min(19, y+size); ++j)
				if(lvlRand[i][j] == 0) lvlRand[i][j] = 1;
		}
		
		// remove water with 3 open side
		for(int i=0; i<20; ++i) for(int j=0; j<20; ++j)
		{
			int cnt = 0;
			if(lvlRand[i][j] != 1) continue;
			if(i > 0 && lvlRand[i-1][j] == 0) cnt++;
			if(j > 0 && lvlRand[i][j-1] == 0) cnt++;
			if(i < 19 && lvlRand[i+1][j] == 0) cnt++;
			if(i < 19 && lvlRand[i][j+1] == 0) cnt++;
			if(cnt >= 3) lvlRand[i][j] = 0;
		}
		
		// make line
		for(int i=0; i<20; ++i) for(int j=0; j<20; ++j)
		{
			if(lvlRand[i][j] == 1 && j > 0 && lvlRand[i][j-1] == 0) lvlRand[i][j] = 15;
			if(lvlRand[i][j] == 1 && j < 19 && lvlRand[i][j+1] == 0) lvlRand[i][j] = 13;
			if(lvlRand[i][j] == 1 && i > 0 && lvlRand[i-1][j] == 0) lvlRand[i][j] = 12;
			if(lvlRand[i][j] == 1 && i < 19 && lvlRand[i+1][j] == 0) lvlRand[i][j] = 14;
		}
		
		
		// fix double line	
		for(int i=0; i<20; ++i) for(int j=0; j<20; ++j) {
			if(lvlRand[i][j] == 12) {
				if (j > 0 && lvlRand[i][j-1] == 0) lvlRand[i][j] = 9;
				if (j < 19 && lvlRand[i][j+1] == 0) lvlRand[i][j] = 10;
			}
			if(lvlRand[i][j] == 13) {
				if (i > 0 && lvlRand[i-1][j] == 0) lvlRand[i][j] = 10;
				if (i < 19 && lvlRand[i+1][j] == 0) lvlRand[i][j] = 11;
			}
			if(lvlRand[i][j] == 14) {
				if (j > 0 && lvlRand[i][j-1] == 0) lvlRand[i][j] = 8;
				if (j < 19 && lvlRand[i][j+1] == 0) lvlRand[i][j] = 11;
			}
			if(lvlRand[i][j] == 15) {
				if (i > 0 && lvlRand[i-1][j] == 0) lvlRand[i][j] = 9;
				if (i < 19 && lvlRand[i+1][j] == 0) lvlRand[i][j] = 8;
			}
		}
			
		return lvlRand;
	}
	
	private static void f() {
		Random random = new Random();
		ArrayList<int []> points = new ArrayList<int []>();
		int currentX = 18, currentY = 1;
		
		while(currentY < 17) {
			int targetX, targetY;
			
			targetX = currentX;
			while(Math.abs(targetX - currentX) <= 3) {
				if(currentY > 1) {
					targetX = random.nextInt(19);
				}
				else {
					targetX = random.nextInt(16);
				}
			}
			if(currentX <= targetX) {
				q.add(new int[]{targetX - currentX, LEFT});
			}
			else {
				q.add(new int[]{currentX - targetX, RIGHT});
			}
			currentX = targetX;
			
			targetY = currentY;
			while(Math.abs(targetY - currentY) <= 1 || currentY % 2 != targetY % 2) {
				targetY = currentY + random.nextInt(Math.min(18 - currentY, 4));
			}
			q.add(new int[] {targetY - currentY, UP});
			currentY = targetY;
		}
		
		q.add(new int[] {19 - currentY, UP});
		
		int targetX;
		
		if(currentX <= 9) {
			targetX = 19;
		}
		else {
			targetX = 0;
		}
		
		if(currentX <= targetX) {
			q.add(new int[]{targetX - currentX, LEFT});
			x = 19;
			y = 19;
		}
		else {
			q.add(new int[]{currentX - targetX, RIGHT});
			x = 0;
			y = 19;
		}
		startPoint = new PathPoint(x, y);
		Collections.reverse(q);
	}
	
	public static PathPoint getStartPoint() {
		return startPoint;
	}

	public static PathPoint getEndPoint() {
		return endPoint;
	}

}
