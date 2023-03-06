import units.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static final int UNITS = 10;

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        ArrayList<BaseHero> blue = new ArrayList<>();
        ArrayList<BaseHero> red = new ArrayList<>();
        ArrayList<BaseHero> allTeam = new ArrayList<>();

        createTeam(blue, 0, 1);
        createTeam(red, 3, 10);

        allTeam.addAll(blue);
        allTeam.addAll(red);

        sortTeam(allTeam);

        System.out.println("House Atreides");
        showTheTeam(blue);

        System.out.println("House Harkonen");
        showTheTeam(red);

        System.out.println("Let the battle begins!");
        String stop = "";
        while (stop.equals("")) {
            for (BaseHero hero : allTeam) {
                if (blue.contains(hero))
                    hero.step(blue, red);
                else
                    hero.step(red, blue);
            }
            showTheTeam(allTeam);
            stop = user_input.nextLine();

        }
    }

    static void showTheTeam(ArrayList<BaseHero> team) {
        team.forEach(n -> System.out.println(n.getInfo()));
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------");
    }

    static void sortTeam(ArrayList<BaseHero> team) {
        team.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero hero1, BaseHero hero2) {
                if (hero2.getSpeed() == hero1.getSpeed())
                    return hero2.getHp() - hero1.getHp();
                else {
                    return hero2.getSpeed() - hero1.getSpeed();
                }
            }
        });
    }

    static void createTeam(ArrayList<BaseHero> team, int offset, int pointX) {
        for (int i = 1; i <= UNITS; i++) {
            switch (new Random().nextInt(4) + offset) {
                case 0:
                    team.add(new Crossbowman(Crossbowman.getName(), pointX, i));
                    break;
                case 1:
                    team.add(new Spearman(Spearman.getName(), pointX, i));
                    break;
                case 2:
                    team.add(new Monk(Monk.getName(), pointX, i));
                    break;
                case 3:
                    team.add(new Peasant(Peasant.getName(), pointX, i));
                    break;
                case 4:
                    team.add(new Robber(Robber.getName(), pointX, i));
                    break;
                case 5:
                    team.add(new Sniper(Sniper.getName(), pointX, i));
                    break;
                case 6:
                    team.add(new Wizard(Wizard.getName(), pointX, i));
                    break;
                default:
                    break;
            }
        }
    }
}