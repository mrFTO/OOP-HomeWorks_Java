package units;

import java.util.ArrayList;

public class Peasant extends BaseHero {
    protected int cartridges;

    public Peasant(String name, Point coords) {
        super(name, 50.f, 50, 1, 1, 1, 1,
                3, coords.posX, coords.posY);
        this.cartridges = 1;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (!state.equals("Die")) state = "Stand";
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Peasant: \t").append(Peasant.super.name)
                .append("\t| ATK:\t").append(Peasant.super.attack)
                .append("\t| HP:\t").append(Peasant.super.hp)
                .append(" \t| Arrows: ").append(Peasant.this.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(Peasant.super.coords.posX).append(".").append(Peasant.super.coords.posY);
    }
}