package Practise_Java.Practice6;

public class MovableCircle extends Movable {
    private int centerX, centerY, xSpeed, ySpeed,radius;

    public MovableCircle(int centerX, int centerY, int xSpeed, int ySpeed,int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "centerX=" + centerX +
                ", centerY=" + centerY +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", radius=" + radius +
                '}';
    }

    public void moveUp() {
        centerX += xSpeed;
    }
    public void moveDown() {
        centerY -= ySpeed;
    }
    public void moveLeft() {
        centerX -= xSpeed;
    }
    public void moveRight() {
        centerY += ySpeed;
    }
}
