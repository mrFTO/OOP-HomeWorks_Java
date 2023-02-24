package units;

public class Crossbowman extends Fighters {
    
    public Crossbowman(String name, Point pointXY) {
        super(name, 3, 2, 3, 10, 4, 6, 16, pointXY);
    }

    @Override
    public String getInfo() {
        return "Crossbowman " + name + " (" + "Attack - " + attack + ", Defence - " + defense + ", Shooting Range - "
                + shots + ", Damage - " + minDamage + "-" + maxDamage + ", Health - " + hp + ", Speed - " + speed
                + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Crossbowman " + name + " (" + "Speed - " + speed + ", Health - " + hp + ")";
    }
}
