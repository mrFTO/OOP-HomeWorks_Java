package units;

import java.util.ArrayList;

public abstract class Priest extends BaseHero {
    protected int mana;
    protected int maxMana;

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        for (BaseHero human: team1) {
            if (human.hp < human.maxHp & !human.state.equals("Die")) {
                human.getDamage(damageMax);
                return;
            }
        }
    }

    public Priest(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
               int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;
    }
}
