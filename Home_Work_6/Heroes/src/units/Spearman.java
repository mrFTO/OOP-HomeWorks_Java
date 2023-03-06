package units;

public class Spearman extends BaseHero {

    public Spearman(String name, int pointX, int pointY) {
        super(name, 4, 5, 1, 3, 10, 4, pointX, pointY);
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d",
                state, "Spearman", name, "Attack:", attack, "Defense:", defense, "Damage:", minDamage, maxDamage,
                "Health:", hp,
                "Speed:", speed);
    }
}
