import units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class main {
    static final int UNITS = 10;

    public static ArrayList<BaseHero> allTeam = new ArrayList<>();
    public static ArrayList<BaseHero> blue = new ArrayList<>();
    public static ArrayList<BaseHero> red = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner user_input = new Scanner(System.in)) {
            System.out.print("Press Enter to begin.");
            user_input.nextLine();
            createTeam(blue, 0, 1);
            createTeam(red, 3, 10);
            allTeam.addAll(blue);
            allTeam.addAll(red);
            sortTeam(allTeam);
            boolean a = true;
            int countBlue = 0;
            int countGreen = 0;
            while (a) {
                View.view();
                user_input.nextLine();
                countBlue = 0;
                countGreen = 0;
                for (BaseHero baseHero : allTeam) {
                    if (blue.contains(baseHero)) {
                        if (baseHero.step(blue, red))
                            countBlue++;
                    } else {
                        if ((baseHero.step(red, blue)))
                            countGreen++;
                    }
                    ;
                }
                if (countBlue == UNITS || countGreen == UNITS)
                    a = false;
            }
            if (countBlue == UNITS)
                System.out.print("greenTeam wins");
            else {
                System.out.print("blueTeam wins");
            }
        }
    }

    static void createTeam(ArrayList team, int offset, int posY) {
        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(4) + offset;
            switch (rnd) {
                case (0):
                    team.add(new Sniper(getName(), new Point(i + 1, posY)));
                    break;
                case (1):
                    team.add(new Robber(getName(), new Point(i + 1, posY)));
                    break;
                case (2):

                    team.add(new Wizard(getName(), new Point(i + 1, posY)));
                    break;
                case (3):
                    team.add(new Peasant(getName(), new Point(i + 1, posY)));
                    break;
                case (4):

                    team.add(new Crossbowman(getName(), new Point(i + 1, posY)));
                    break;
                case (5):

                    team.add(new Monk(getName(), new Point(i + 1, posY)));
                    break;
                case (6):
                    team.add(new Spearman(getName(), new Point(i + 1, posY)));
                    break;
            }
        }
    }

    static void sortTeam(ArrayList<BaseHero> team) {
        team.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero t0, BaseHero t1) {
                if (t1.getSpeed() == t0.getSpeed())
                    return (int) (t1.getHp() - t0.getHp());
                else
                    return (int) (t1.getSpeed() - t0.getSpeed());
            }
        });
    }

    static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
}