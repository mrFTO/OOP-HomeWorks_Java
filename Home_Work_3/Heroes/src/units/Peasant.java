package units;

public class Peasant extends Fighters {
    int delivery;

    public Peasant(String name, Point pointXY) {
        super(name, 1, 1, 1, 1, 3, 1, 0,  pointXY);
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return "Peasant " + name + " (" + "Attack - " + attack + ", Defence - " + defense + ", Damage - " + minDamage
                + "-" + maxDamage + ", Health - " + hp + ", Speed - " + speed + ", Delivery - " + delivery + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Peasant " + name + " (" + "Speed - " + speed + ", Health - " + hp + ")";
    }
}
