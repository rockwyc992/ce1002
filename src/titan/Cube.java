package titan;

import static org.lwjgl.opengl.GL11.*;

class Cube{

    int no;
    int locate;
    int forward;
    Point[] c;

    Cube(int no) {
        this.no = no;
        locate = no;
        forward = Global.Forward_Up;
        c = Global.Color(int no);
    }

    void cube() {
        glPushMatrix(); {
            glTranslatef(p.x,p.y,p.z);
            glRotatef(dr,r.x,r.y,r.z);

            glBegin(GL_QUADS); {
                //FrontFace
                glColor3f(c[0].x,c[0].y,c[0].z);
                glVertex3f(-1,-1,1);
                glVertex3f(1,-1,1);
                glVertex3f(1,1,1);
                glVertex3f(-1,1,1);

                //BackFace
                glColor3f(c[1].x,c[1].y,c[1].z);
                glVertex3f(-1,-1,-1);
                glVertex3f(-1,1,-1);
                glVertex3f(1,1,-1);
                glVertex3f(1,-1,-1);


                //TopFace
                glColor3f(c[3].x,c[3].y,c[3].z);
                glVertex3f(1,-1,-1);
                glVertex3f(1,-1,1);
                glVertex3f(1,1,1);
                glVertex3f(1,1,-1);

                //BottomFace
                glColor3f(c[2].x,c[2].y,c[2].z);
                glVertex3f(-1,-1,-1);
                glVertex3f(-1,-1,1);
                glVertex3f(-1,1,1);
                glVertex3f(-1,1,-1);
                //LeftFace
                glColor3f(c[4].x,c[4].y,c[4].z);
                glVertex3f(-1,-1,-1);
                glVertex3f(1,-1,-1);
                glVertex3f(1,-1,1);
                glVertex3f(-1,-1,1);

                //Right Face
                glColor3f(c[5].x,c[5].y,c[5].z);
                glVertex3f(-1,1,-1);
                glVertex3f(1,1,-1);
                glVertex3f(1,1,1);
                glVertex3f(-1,1,1);
            }
            glEnd();
        }
        glPopMatrix();
    }
}

