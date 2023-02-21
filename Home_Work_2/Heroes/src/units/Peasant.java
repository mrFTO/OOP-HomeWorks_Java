package units;

public class Peasant extends BaseHero {
    private int seeds;

    public Peasant(String heroID) {
        super(heroID, 32, 43, 54);
        this.seeds = 23;
    }

    @Override
    public String getInfo() {
        return "Peasant " + heroID;
    }
}
