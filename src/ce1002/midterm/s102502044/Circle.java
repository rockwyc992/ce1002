package ce1002.midterm.s102502044;

import java.awt.*;
import java.util.*;

class Circle extends Graph {

    protected int diameter;

    //config diameter
    Circle() {
        name = "Circle";
        diameter = get_diameter();
    }

    //draw circle by diameter
    public void drawGraph(Graphics g) {
        g.drawOval(0, 0, diameter, diameter);
        g.drawString("Circle diameter :" + diameter, 10, diameter+20);
    }

    //input diameter
    int get_diameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Circle's diameter :");
        String input = scanner.next();
        while(!input.matches("^[1-9]\\d*")) {
            System.out.println("Out of range!");
            System.out.println("Please enter Circle's diameter again :");
            input = scanner.next();
        }
        return Integer.parseInt(input);
    }
}
