package units;

public class Wizard extends Priest {

    public Wizard(String name, int pointX, int pointY) {
        super(name, 17, 12, -5, -5, 30, 9, 10, pointX, pointY);
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d %10s %3d",
                state, "Wizard", name, "Attack:", attack, "Defense:", defense, "Damage:", minDamage, maxDamage,
                "Health:", hp,
                "Speed:", speed, "Mana:", mana);
    }

}
