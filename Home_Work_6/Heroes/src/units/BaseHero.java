package units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements Interface {

    protected String name, state;
    protected int attack, defense, minDamage, maxDamage, hp, maxHp, speed;
    protected Point pointXY;
    protected static int heroCount;

    // @Override
    // public String toString() {
    // return name +
    // " H:" + Math.round(hp) +
    // " D:" + defense +
    // " A:" + attack +
    // " Dmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) +
    // " " + state;
    // }

    public int[] getCoords() {
        return new int[] { pointXY.x, pointXY.y };
    }

    public BaseHero(String name, int attack, int defense, int minDamage, int maxDamage, int hp, int speed, int pointX,
            int pointY) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        pointXY = new Point(pointX, pointY);
        state = "Stand";
        heroCount++;
    }

    public static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(0, Names.values().length)]);
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
    }

    @Override
    public String getInfo() {
        return "null";
    }

    public void getDamage(float damage) {
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        } else if (hp > maxHp) {
            hp = maxHp;
        }

    }

    protected int findTheNearest(ArrayList<BaseHero> team) {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (min > pointXY.getDistance(team.get(i).pointXY)) {
                index = i;
                min = pointXY.getDistance(team.get(i).pointXY);
            }
        }
        return index;
    }
}
