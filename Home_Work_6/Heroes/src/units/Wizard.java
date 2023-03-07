package units;

public class Wizard extends Priest {

    public Wizard(String name, float hp, int maxHp, int attack, int damageMin, int damageMax,
                 int defense, int speed, int mana, int maxMana, int posX, int posY ) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, mana, maxMana, posX, posY);
    }

    public Wizard(String name, Point coords) {
        super(name, 50.f, 50, 9, -6, -6, 3,
                7, 5,5, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Wizard: \t").append(
                Wizard.super.name)
                .append("\t| ATK:\t").append(
                        Wizard.super.attack)
                .append("\t| HP:\t").append(
                        Wizard.super.hp)
                .append(" \t| MP:\t").append(
                        Wizard.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(
                        Wizard.super.coords.posX).append(".")
                .append(Wizard.super.coords.posY);
    }

}
