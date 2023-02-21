package units;

public class Crossbowman extends Shooter {
    
    public Crossbowman(String heroID) {
        super(heroID, 43, 12, 54, 32);
    }

    @Override
    public String getInfo() {
        return "Crossbowman " + heroID;
    }
}
