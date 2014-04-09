package ce1002.e2.s102502044;

import java.util.Scanner;
import java.util.Random;

public class E2
{
	private static Scanner input = new Scanner(System.in);
	private static Random ran = new Random();
	private static int in(String msg)
	{
		int tmp = -1;
		while(true)
		{
			System.out.print(msg);
			tmp = input.nextInt();

			if(3<=tmp && tmp<=10)
				break;
			else
				System.out.println("Out of range!");
		}
		return tmp;
	}
	public static void main(String[] argv)
	{
		//讀入數字
		int lx = in("Please input first number (3~10): ");
		int ly = in("Please input second number (3~10): ");

		//宣告參數
		int[] dx={0, 1};
		int[] dy={1, 0};

		//宣告變數
		int total = 0;

		
		//宣告陣列
		int[][] arr = new int[lx][ly];

		//填入 rand %2
		for(int i=0 ; i<lx ; i++)
			for(int j=0 ; j<ly ; j++)
				arr[i][j] = ran.nextInt(2);

		//輸出 + 計算total
		for(int i=0 ; i<lx ; i++)
		{
			for(int j=0 ; j<ly ; j++)
			{
				System.out.printf("%d ", arr[i][j]);
				if(arr[i][j] == 1)
					for(int k=0 ; k<2 ; k++)
						//檢查邊界
						if(0<=i+dx[k] && i+dx[k]<lx)
							if(0<=j+dy[k] && j+dy[k]<ly)
								if(arr[i+dx[k]][j+dy[k]] == 1)
									total++;
			}
			System.out.println("");
		}

		//輸出total
		System.out.println("total: " + total);
	}
}
