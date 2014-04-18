package titan;

class Global {

    static int Forward_Front = 0;
    static int Forward_Back  = 1;
    static int Forward_Up    = 2;
    static int Forward_Down  = 3;
    static int Forward_Left  = 4;
    static int Forward_Right = 5;

    Point[] Color(int no) {
        Point[] colors = new Point[6];

        for(int i=0 ; i<6 ; i++)
            colors[i] = Colors.Black();
        int no = i*9 + j*3 + k;

        if(no==2 || no==5 || no==8 || no==11 || no==14 || no==17 || no==20 || no==23 || no==26)
            c[0] = new Point(1f,0f,0f);
        if(no==0 || no==3 || no==6 || no==9 || no==12 || no==15 || no==18 || no==21 || no==24)
            c[1] = new Point(1f,0.65f,0f);
        if(no==0 || no==1 || no==2 || no==3 || no==4 || no==5 || no==6 || no==7 || no==8)
            c[2] = new Point(0f,0f,1f);
        if(no==18 || no==19 || no==20 || no==21 || no==22 || no==23 || no==24 || no==25 || no==26)
            c[3] = new Point(0f,1f,0f);
        if(no==0 || no==1 || no==2 || no==9 || no==10 || no==11 || no==18 || no==19 || no==20)
            c[4] = new Point(1f,1f,0f);
        if(no==6 || no==7 || no==8 || no==15 || no==16 || no==17 || no==24 || no==25 || no==26)
            c[5] = new Point(1f,1f,1f);
        cube(p, X, r, c);
    }

    return colors;
}


}
