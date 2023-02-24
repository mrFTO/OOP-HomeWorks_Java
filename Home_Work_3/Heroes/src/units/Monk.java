package units;

public class Monk extends Priest {

    public Monk(String name, Point pointXY) {
        super(name, 7, -4, -4, 30, 5, 1, pointXY);
    }

    @Override
    public String getInfo() {
        return "Monk " + name + " (" + "Defence - " + defense + ", Damage - " + minDamage + "-"
                + maxDamage + ", Health - " + hp + ", Speed - " + speed + ", Magic - " + magic + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Monk " + name + " (" + "Speed - " + speed + ", Health - " + hp + ")";
    }
}
