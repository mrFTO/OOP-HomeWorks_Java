package units;

public class Sniper extends Fighters {

    public Sniper(String name, Point pointXY) {
        super(name, 10, 8, 10, 15, 9, 12, 32, pointXY);
    }

    @Override
    public String getInfo() {
        return "Sniper " + name + " (" + "Attack - " + attack + ", Defence - " + defense + ", Shooting Range - "
                + shots + ", Damage - " + minDamage + "-" + maxDamage + ", Health - " + hp + ", Speed - " + speed
                + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Sniper " + name + " (" + "Speed - " + speed + ", Health - " + hp + ")";
    }
}
