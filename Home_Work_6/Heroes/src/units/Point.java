package units;

public class Point {
    protected int posX;
    protected int posY;

    public Point(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    protected boolean isLeft(Point opponent) {
        return posX < opponent.posX;
    }

    protected double getDistance(Point opponent) {
        return Math.sqrt(Math.pow(posX - opponent.posX, 2) + Math.pow(posY - opponent.posY, 2));
    }

    protected Point chooseWay(Point opponent) {

        return new Point(posX - opponent.posX, posY - opponent.posY);
    } 
    
    
    
    
    
    // protected int x, y;

    // public Point(int x, int y) {
    //     this.x = x;
    //     this.y = y;
    // }

    // protected boolean isLeft(Point opponent) {
    //     return x < opponent.x;
    // }

    // public double getDistance(Point opponent) {
    //     return Math.sqrt(Math.pow(this.x - opponent.x, 2) + Math.pow(this.y - opponent.y, 2));
    // }
}