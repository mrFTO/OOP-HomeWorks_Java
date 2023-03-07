package units;

public class Robber extends Warrior {
    int disguise;

    public Robber(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed,
            int disguise, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.disguise = disguise;
    }

    public Robber(String name, Point coords) {
        super(name, 70.f, 70, 10, 2, 6, 7,
                6, coords.posX, coords.posY);
        this.disguise = 50;
    }

    public void steal(int disguise, Shooter Shooter) {
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Robber: \t").append(Robber.super.name)
                .append("\t| ATK:\t").append(Robber.super.attack)
                .append("\t| HP:\t").append(Robber.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Robber.super.coords.posX).append(".")
                .append(Robber.super.coords.posY);
    }
}
