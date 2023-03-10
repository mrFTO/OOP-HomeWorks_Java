package units;

public abstract class BaseHero implements Interface {
    protected String heroID;
    protected int health;
    protected int endurance;
    protected int speed;

    public BaseHero(String heroID, int health, int endurance, int speed) {
        this.heroID = heroID;
        this.health = health;
        this.endurance = endurance;
        this.speed = speed;
    }

    @Override
    public void step() {
    }

    @Override
    public String getInfo() {
        return "null";
    }

}