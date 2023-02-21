package units;

public class Wizard extends Priest {

    public Wizard(String heroID) {
        super(heroID, 12, 23, 34, 45);
    }

    @Override
    public String getInfo() {
        return "Wizard " + heroID;
    }
}
