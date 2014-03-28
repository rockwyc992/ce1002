package ce1002.q1.s102502044;

class Graph {

    //宣告面積，邊數
    protected double area;
    private int edge;

    //設定邊數
    public void setEdge(int e) {
        this.edge = e;
    }

    //取得邊數
    public int getEdge() {
        return edge;
    }

    //子類別override，驗證各邊是否合法
    public boolean Recongnization() {
    }

    //子類別override，取得面積
    public double getArea() {
    }

    //子類別override，輸出面積與邊數
    void status () {
    }

}
