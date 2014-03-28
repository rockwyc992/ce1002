package ce1002.e3.s102502044;

import java.util.*;

public class E3
{
	Scanner scanner;
	Rectangle rectangle;

	int which_type() //輸入要進行的type
	{
		String input;
		while(true)
		{
			System.out.println("Create rectangle in 2 ways.");
			System.out.println("1)create by constructor parameters,2)create by setter: ");
			input = scanner.nextLine();
			if(input.matches("^[12]$"))
				break;
			else
				System.out.println("Out of range!");
		}
		return Integer.parseInt(input);
	}

	int how_long_width() //輸入寬
	{
		String input;
		while(true)
		{
			System.out.println("Input the width: ");
			input = scanner.nextLine();
			if(input.matches("^(1?[1-9]|[12]0)$"))
				break;
			else
				System.out.println("Out of range!");
		}
		return Integer.parseInt(input);
	}

	int how_long_height() //輸入高
	{
		String input;
		while(true)
		{
			System.out.println("Input the height: ");
			input = scanner.nextLine();
			if(input.matches("^(1?[1-9]|[12]0)$"))
				break;
			else
				System.out.println("Out of range!");
		}
		return Integer.parseInt(input);
	}

	public E3() //選擇type，輸出
	{
		scanner = new Scanner(System.in);

		if(which_type() == 1)
			rectangle = new Rectangle(how_long_width(), how_long_height());
		else
		{
			rectangle = new Rectangle();
			rectangle.setWidth(how_long_width());    // set the width
			rectangle.setHeight(how_long_height());  // set the height
		}

		rectangle.show_status();
	}

	public static void main(String[] argv)
	{
		new E3();
	}
}
