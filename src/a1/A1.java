package ce1002.a1.s102502044;

import java.util.Scanner; //引入Scanner

public class A1
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //Scanner初始化
		int tmp = -1; //輸入暫存用

		while(true)
		{
			System.out.print("Please input a number (5~30): ");
			tmp = input.nextInt(); //讀入一個數字
			if(5<=tmp && tmp<=30) //check in range
				break;
			System.out.println("Out of range!");
		}
		for(int i=0 ; i<tmp ; i++)
		{
			for(int j=0 ; j<tmp ; j++)
			{
				if((i+j)%2 == 0)//判斷行+列的奇偶
					System.out.print("O");
				else
					System.out.print("X");
			}
			System.out.println("");
		}
	}
}
