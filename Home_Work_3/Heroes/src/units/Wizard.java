package units;

public class Wizard extends Priest {

    public Wizard(String name, Point pointXY) {
        super(name, 12, -5, -5, 30, 9, 1, pointXY);
    }

    @Override
    public String getInfo() {
        return "Wizard " + name + " (" + "Defence - " + defense + ", Damage - " + minDamage + "-"
                + maxDamage + ", Health - " + hp + ", Speed - " + speed + ", Magic - " + magic + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Wizard " + name + " (" + "Speed - " + speed + ", Health - " + hp + ")";
    }
}
