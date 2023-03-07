package units;

import java.util.ArrayList;

public interface Interface {
    StringBuilder getInfo();

    void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2);

}
