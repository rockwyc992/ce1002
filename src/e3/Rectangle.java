package ce1002.e3.s102502044;

public class Rectangle
{
	private int width;
	private int height;

	Rectangle()
	{
	}

	Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	int width()
	{
		return width;
	}

	int height()
	{
		return height;
	}

	void setWidth(int width)
	{
		this.width = width;
	}

	void setHeight(int height)
	{
		this.height = height;
	}

	int getArea() //return 面積
	{
		return width * height;
	}

	void show_status() //輸出所有資訊
	{
		System.out.println("The width of this rectangle is "  + width());
		System.out.println("The height of this rectangle is " + height());
		System.out.println("The area of this rectangle is "   + getArea());
	}

}

