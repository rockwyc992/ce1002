package ce1002.q1.s102502044;

import java.lang.Math;
import java.util.*;

class Triangle extends Graph {

    //宣告三邊（ㄨㄟˊ）
    private double a;
    private double b;
    private double c;

    //輸入
    Triangle() {
        Scanner input = new Scanner(System.in);

        setEdge(3);

		//This part is handling the input to construct the triangle object		
		System.out.println("First Graph is triangle");
		System.out.println("Please input a: ");
		a = input.nextDouble();
		System.out.println("Please input b: ");
		b = input.nextDouble();
		System.out.println("Please input c: ");
		c = input.nextDouble();
    }

    //輸出
    void status () {
        System.out.println("Area(1) = " + getArea() + " Edge = " + getEdge());
    }

    //驗證三邊皆大於零，且兩邊和小於第3邊
    public boolean Recongnization() {
        if( a<0.0 || b<0.0 || c<0.0) {
            return false;
        }
        if ( (a+b) < c || (a+c) < b || (b+c) < a) {
            return false;
        }
        return true;
    }

    //取得面積
    public double getArea() {
        if (!Recongnization()) {
            return 0.0;
        }

        double s = (a+b+c)/2.0;
        area = s * (s-a) * (s-b) * (s-c);
        area = Math.sqrt(area);
        return area;
    };
}

