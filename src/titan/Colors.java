package titan;

class Colors extends Point {

    Colors(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    static Point Black() {
        Point color = new Point(0f, 0f, 0f);
        return color;
    }
}
