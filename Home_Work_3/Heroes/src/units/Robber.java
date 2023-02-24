package units;

public class Robber extends Fighters {

    public Robber(String name, Point pointXY) {
        super(name, 3, 2, 4, 10, 6, 8, 0, pointXY);
    }

    @Override
    public String getInfo() {
        return "Robber " + name + " (" + "Attack - " + attack + ", Defence - " + defense + ", Damage - " + minDamage + "-"
                + maxDamage + ", Health - " + hp + ", Speed - " + speed + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Robber " + name + " (" + "Speed - " + speed + ", Health - " + hp + ")";
    }
}
