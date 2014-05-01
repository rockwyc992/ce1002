package ce1002.midterm.s102502044;

import java.awt.*;
import java.util.*;

class Rectangle extends Graph {
    protected int height;
    protected int width;

    //input width and height
    Rectangle() {
        name = "Rectangle";
        width = get_width();
        height = get_height();
    }

    //draw graph by width and height
    public void drawGraph(Graphics g) {
        g.drawRect(0, 0, width, height);
        g.drawString("Rectangle width :" + width, 0, height+20);
        g.drawString("Rectangle height :" + height, 0, height+40);
    }

    //input height
    int get_height() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Rectangle's height :");
        String input = scanner.next();
        while(!input.matches("^[1-9]\\d*")) {
            System.out.println("Out of range!");
            System.out.println("Please enter Rectangle's height again :");
            input = scanner.next();
        }
        return Integer.parseInt(input);
    }

    //input width
    int get_width() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Rectangle's width :");
        String input = scanner.next();
        while(!input.matches("^[1-9]\\d*")) {
            System.out.println("Out of range!");
            System.out.println("Please enter Rectangle's width again :");
            input = scanner.next();
        }
        return Integer.parseInt(input);
    }
}
