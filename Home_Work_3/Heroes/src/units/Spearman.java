package units;

public class Spearman extends Fighters {

    public Spearman(String name, Point pointXY) {
        super(name, 5, 1, 3, 10, 4, 4, 0, pointXY);
    }

    @Override
    public String getInfo() {
        return "Spearman " + name + " (" + "Attack - " + attack + ", Defence - " + defense + ", Damage - " + minDamage + "-"
                + maxDamage + ", Health - " + hp + ", Speed - " + speed + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Spearman " + name + " (" + "Speed - " + speed + ", Health - " + hp + ")";
    }
}
