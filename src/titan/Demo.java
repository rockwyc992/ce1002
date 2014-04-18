package titan;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Controller;
import org.lwjgl.input.Controllers;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

import java.util.Random;

public class Demo {

    static Controller controller;
    static Random rand = new Random();

    Demo() {
    }

    public static void main(String[] args) {
        initDisplay();
        init_Gamepad();
        gameLoop();
        cleanUp();
    }

    static void cube(Point p, float dr, Point r, Point c) {
        glPushMatrix(); {
            glColor3f(1.0f,0.5f,0f);
            glTranslatef(p.x,p.y,p.z);
            glRotatef(dr,r.x,r.y,r.z);

            glBegin(GL_QUADS); {
                //FrontFace
                glColor3f(c.x,c.y,c.z);
                glVertex3f(-1,-1,1);
                glVertex3f(1,-1,1);
                glVertex3f(1,1,1);
                glVertex3f(-1,1,1);

                //BackFace
                glColor3f(0f,1f,0f);
                glVertex3f(-1,-1,-1);
                glVertex3f(-1,1,-1);
                glVertex3f(1,1,-1);
                glVertex3f(1,-1,-1);

                //BottomFace
                glColor3f(0f,0f,1f);
                glVertex3f(-1,-1,-1);
                glVertex3f(-1,-1,1);
                glVertex3f(-1,1,1);
                glVertex3f(-1,1,-1);

                //TopFace
                glColor3f(1f,1f,0f);
                glVertex3f(1,-1,-1);
                glVertex3f(1,-1,1);
                glVertex3f(1,1,1);
                glVertex3f(1,1,-1);

                //LeftFace
                glColor3f(0f,1f,1f);
                glVertex3f(-1,-1,-1);
                glVertex3f(1,-1,-1);
                glVertex3f(1,-1,1);
                glVertex3f(-1,-1,1);

                //Right Face
                glColor3f(1f,0f,1f);
                glVertex3f(-1,1,-1);
                glVertex3f(1,1,-1);
                glVertex3f(1,1,1);
                glVertex3f(-1,1,1);
            }
            glEnd();
        }
        glPopMatrix();
    }

    public static void gameLoop() {
        Camera cam = new Camera(70,(float)Display.getWidth()/(float)Display.getHeight(),0.3f,1000);
        float X = 0;
        boolean[] status = new boolean[controller.getButtonCount()];

        while(!Display.isCloseRequested()) {
            if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE))
                break;
            boolean forward = Keyboard.isKeyDown(Keyboard.KEY_W);
            boolean backward = Keyboard.isKeyDown(Keyboard.KEY_S);
            boolean left = Keyboard.isKeyDown(Keyboard.KEY_A);
            boolean right = Keyboard.isKeyDown(Keyboard.KEY_D);
            boolean up = Keyboard.isKeyDown(Keyboard.KEY_SPACE);
            boolean down = Keyboard.isKeyDown(Keyboard.KEY_LSHIFT);

            boolean ro_up = Keyboard.isKeyDown(Keyboard.KEY_UP);
            boolean ro_down = Keyboard.isKeyDown(Keyboard.KEY_DOWN);
            boolean ro_left = Keyboard.isKeyDown(Keyboard.KEY_LEFT);
            boolean ro_right = Keyboard.isKeyDown(Keyboard.KEY_RIGHT);

            if(forward)
                cam.move(0f,0f,0.1f);
            if(backward)
                cam.move(0f,0f,-0.1f);
            if(left)
                cam.move(0.1f,0f,0f);
            if(right)
                cam.move(-0.1f,0f,0f);
            if(up)
                cam.move(0f,0.1f,0f);
            if(down)
                cam.move(0f,-0.1f,0f);

            if(ro_up)
                cam.rotate(-1f, 0f);
            if(ro_down)
                cam.rotate(1f, 0f);
            if(ro_left)
                cam.rotate(0f, -1f);
            if(ro_right)
                cam.rotate(0f, 1f);

            for(int i=0 ; i<controller.getButtonCount() ; i++)
            {
                if(status[i] != controller.isButtonPressed(i))
                {
                    status[i] = controller.isButtonPressed(i);
                    System.out.print(controller.getButtonName(i) + " is ");
                    if(status[i])
                        System.out.println("pressed.");
                    else
                        System.out.println("release.");
                }
            }
            float x=0f, y=0f, z=0f, rx=0f, ry=0f, rz=0f, t=0f;
            for(int i=0 ; i<controller.getAxisCount() ; i++)
            {
                String name = controller.getAxisName(i);
                float value = controller.getAxisValue(i);
                if(name.matches("x"))
                    x = value;
                else if(name.matches("y"))
                    y = value;
                else if(name.matches("z"))
                    z = value;
                else if(name.matches("rx"))
                    rx = value;
                else if(name.matches("ry"))
                    ry = value;
                else if(name.matches("rz"))
                    rz = value;
                else
                    t = value;
            }
            z = z - rz;

            cam.move(x/-10f, z/10f, y/-10f);
            cam.rotate(ry*2f, rx*2f);

            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
            glLoadIdentity();
            cam.useView();

        /*    for(int i=-100 ; i<100 ; i+=2)
                for(int j=-100 ; j<100 ; j+=2) {
                    Point p = new Point(i, j, -300f);
                    Point r = new Point(0f, 0f, 0f);
                    Point c = new Point((i+100)/200f, (j+100)/200f, (i+j+200)/400f);
                    cube(p,x, r, c);
                }*/
            Point p = new Point(0,0,-10);
            Point r = new Point(1f,1f,1f);
            Point c = new Point(1f,0f,0f);
            cube(p,X, r, c);
            glPushMatrix(); {
                glColor3f(0.5f,0.5f,0.5f);
                glTranslatef(0f,-2f,-10f);

                glBegin(GL_QUADS); {
                    glColor3f(0.5f,0.5f,0.5f);
                    glVertex3f(10f,0f,10f);
                    glVertex3f(10f,0f,-10f);
                    glVertex3f(-10f,0f,-10f);
                    glVertex3f(-10f,0f,10f);
                }
                glEnd();
            }
            glPopMatrix();

            X += 1f;
            Display.update();
        }
    }

    public static void cleanUp() {
        Display.destroy();
    }

    public static void initDisplay() {
        try {
            Display.setDisplayMode(new DisplayMode(800,600));
            Display.setFullscreen(true);
            Display.create();
        }
        catch (LWJGLException ex) {
        }
    }

    static void init_Gamepad() {
        try {
            Controllers.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
        Controllers.poll();

        for(int i=0;i<Controllers.getControllerCount() ; i++) {
            controller = Controllers.getController(i);
            if(controller.getName().matches(".*Gamepad.*"))
            {
                System.out.println(controller.getName());
                break;
            }
        }
    }
}


class Point {
    float x, y, z;
    Point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
