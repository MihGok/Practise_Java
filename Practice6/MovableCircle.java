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
    public String toString(){
        return "Coordinates are: " + centerX + " " + centerY +" radius is " + radius + " It moves with speed " + xSpeed+ " " + ySpeed;
    }
    public void moveUp() {
        centerX += xSpeed;
    }

    ;

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
