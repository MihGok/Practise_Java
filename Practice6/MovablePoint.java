package Practise_Java.Practice6;

public class MovablePoint extends Movable {
    private int pointX, pointY, xSpeed, ySpeed;

    @Override
    public String toString() {
        return "MovablePoint{" +
                "pointX=" + pointX +
                ", pointY=" + pointY +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MovablePoint(int pointX, int pointY, int xSpeed, int ySpeed) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        pointY += ySpeed;
    }

    public void moveDown() {
        pointY -= ySpeed;
    }

    public void moveLeft() {
        pointX -= xSpeed;
    }

    public void moveRight() {
        pointX += xSpeed;
    }
}
