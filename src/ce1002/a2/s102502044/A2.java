package ce1002.a2.s102502044;

import java.util.Scanner;

public class A2
{
	//產生input用的物件
	private static Scanner input = new Scanner(System.in);
	public static void main(String argv[])
	{
		int num = -1;

		//讀入數字
		while(true)
		{
			System.out.println("Please input a number (1~10): ");
			num = input.nextInt();

			if(1<=num && num<=10)
				break;
			else
				System.out.println("Out of range!");
		}
		
		//宣告不規則陣列
		int[][] arr = new int[15][];
		for(int i=0 ; i<15 ; i++)
			arr[i] = new int[i+1];

		//計算巴斯卡
		for(int i=0 ; i<15 ; i++)
			for(int j=0 ; j<=i ; j++)
				if(j == 0 || i == j)
					arr[i][j] = 1;
				else
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];

		//輸出前num排
		for(int i=0 ; i<num ; i++)
		{
			for(int j=0 ; j<=i ; j++)
				System.out.printf("%d ", arr[i][j]);
			System.out.println("");
		}
	}
}
