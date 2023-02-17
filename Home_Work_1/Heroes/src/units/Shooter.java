package units;

public class Shooter extends BaseHero{
    
    private int ammunition;

    protected boolean aiming() {
        if (endurance < 100) {
            return false;
        }
        else return true;
    }
}
