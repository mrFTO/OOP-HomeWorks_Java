package units;

public class Point {
    protected int posX;
    protected int posY;

    public Point(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    protected boolean isLeft(Point opponent){
        return posX < opponent.posX;
    }

    protected double getDistance(Point opponent){
        return Math.sqrt(Math.pow(posX - opponent.posX,2) + Math.pow(posY - opponent.posY,2));
    }
}
