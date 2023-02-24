package units;

public abstract class Priest extends BaseHero {
    protected int magic;

    public Priest(String name, int defense, int minDamage, int maxDamage, int hp, int speed, int magic, Point pointXY) {
        super(name, defense, minDamage, maxDamage, hp, speed, pointXY);
        this.magic = magic;
    }
}
