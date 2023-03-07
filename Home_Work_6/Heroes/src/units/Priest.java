package units;

import java.util.ArrayList;

public class Priest extends BaseHero {
    protected int mana;
    protected int maxMana;

    @Override
    public boolean step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        for (BaseHero baseHero : team1) {
            if (baseHero.hp < baseHero.maxHp & !baseHero.state.equals("Die")) {
                baseHero.getDamage(damageMax);
                return false;
            }
        }
        return true;
    }

    public Priest(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
               int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;
    }
}
