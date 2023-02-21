package units;

public class Robber extends Warrior {

    public Robber(String heroID) {
        super(heroID, 21, 32, 43, 54);
    }

    @Override
    public String getInfo() {
        return "Robber" + heroID;
    }
}
