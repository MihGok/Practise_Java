package Practise_Java.Practice2;

public class ball {
    private float xkord = 0f;
    private float ykord = 0f;
    public ball(float xkord, float ykord) {
        this.xkord = xkord;
        this.ykord = ykord;
    };

    public float getXkord() {
        return xkord;
    }

    public float getYkord() {
        return ykord;
    }

    public void setXkord(float xkord) {
        this.xkord = xkord;
    }

    public void setYkord(float ykord) {
        this.ykord = ykord;
    }

    public void setXY(float xkord,float ykord){
        this.xkord = xkord;
        this.ykord = ykord;
    };
    public void move(float new_x, float new_y){
        this.xkord = new_x;
        this.ykord = new_y;
    };

    @Override
    public String toString() {
        return "ball{" +
                "xkord=" + xkord +
                ", ykord=" + ykord +
                '}';
    }

    ;
}
