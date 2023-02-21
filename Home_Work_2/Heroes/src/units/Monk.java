package units;

public class Monk extends Priest {

    public Monk(String heroID) {
        super(heroID, 11, 22, 33, 44);
    }

    @Override
    public String getInfo() {
        return "Monk " + heroID;
    }
}
