package Practise_Java.Practice6;

public class MovablePoint extends Movable {
    private int pointX, pointY, xSpeed, ySpeed;

    public String toString() {
        return "Coordinates are: " + pointX + " " + pointY + " It moves with speed " + xSpeed + " " + ySpeed;
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
