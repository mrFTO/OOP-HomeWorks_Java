package units;

public abstract class Fighters extends BaseHero {
    protected int attack;
    protected int shots;

    public Fighters(String name, int defense, int minDamage, int maxDamage, int hp, int speed, int attack, int shots, Point pointXY) {
        super(name, defense, minDamage, maxDamage, hp, speed, pointXY);
        this.attack = attack;
        this.shots = shots;
    }
}
