package units;

public class Robber extends BaseHero {

    public Robber(String name, int pointX, int pointY) {
        super(name, 3, 2, 4, 10, 6, pointX, pointY);
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d",
                state, "Robber", name, "Attack:", attack, "Defense:", defense, "Damage:", minDamage, maxDamage,
                "Health:", hp,
                "Speed:", speed);
    }

}