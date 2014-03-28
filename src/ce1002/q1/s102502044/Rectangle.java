package ce1002.q1.s102502044;

import java.util.*;

class Rectangle extends Graph{

    //宣告長、寬
    private double height;
    private double width;

    //輸入
    Rectangle() {
        Scanner input = new Scanner(System.in);

        setEdge(4);

        //This part is handling the input to construct the rectangle object
		System.out.println("First Graph is rectangle");
		System.out.println("Please input Weight: ");
		width = input.nextDouble();
		System.out.println("Please input Height: ");
		height = input.nextDouble();
    }

    //輸出
    void status () {
        System.out.println("Area(0) = " + getArea() + " Edge = " + getEdge());
    }

    //驗證兩邊皆大於零
    public boolean Recongnization() {
        if(height < 0.0 || width<0.0) {
            return false;
        }
        return true;
    }

    //取得面積
    public double getArea() {
        if(!Recongnization()) {
            return 0.0;
        }
        area = height * width;
        return area;
    }
    
}

