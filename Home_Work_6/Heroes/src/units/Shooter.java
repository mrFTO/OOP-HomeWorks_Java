package units;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero {

    protected int range;
    protected int cartridges;

    protected Shooter(String name, float hp, int maxHp, int attack, int damageMin,
            int damageMax, int defense, int speed, int cartridges,
            int range, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.range = range;
        this.cartridges = cartridges;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (state.equals("Die") || cartridges == 0)
            return;
        BaseHero victim = team2.get(findNearest(team2));
        float damage = (victim.defense - attack) > 0 ? damageMin
                : (victim.defense - attack) < 0 ? damageMax : (damageMin + damageMax) / 2;
        victim.getDamage(damage);
        for (BaseHero baseHero : team1) {
            if (baseHero.getInfo().toString().split(":")[0].equals("Peasant") && baseHero.state.equals("Stand")) {
                baseHero.state = "Busy";
                return;
            }
        }
        cartridges--;
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) +
                " Shots:" + cartridges + " " +
                state;
    }

}
