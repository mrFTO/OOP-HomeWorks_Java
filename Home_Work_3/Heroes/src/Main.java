import units.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> blue = new ArrayList<>();
        ArrayList<BaseHero> red = new ArrayList<>();
        ArrayList<BaseHero> queueForAMove = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    blue.add(new Spearman(Spearman.getName(), new Point(1, i + 1)));
                    break;
                case 1:
                    blue.add(new Crossbowman(Crossbowman.getName(), new Point(1, i + 1)));
                    break;
                case 2:
                    blue.add(new Monk(Monk.getName(), new Point(1, i + 1)));
                    break;
                case 3:
                    blue.add(new Peasant(Peasant.getName(), new Point(1, i + 1)));
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < 10; i++) {

            switch (new Random().nextInt(4)) {
                case 0:
                    red.add(new Robber(Robber.getName(), new Point(10, i + 1)));
                    break;
                case 1:
                    red.add(new Sniper(Sniper.getName(), new Point(10, i + 1)));
                    break;
                case 2:
                    red.add(new Wizard(Wizard.getName(), new Point(10, i + 1)));
                    break;
                case 3:
                    red.add(new Peasant(Peasant.getName(), new Point(10, i + 1)));
                    break;
                default:
                    break;
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("House Atreides:");
        blue.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        System.out.println("House Harkonen:");
        red.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        queueForAMove.addAll(blue);
        queueForAMove.addAll(red);

        queueForAMove.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero hero1, BaseHero hero2) {
                if (hero2.getSpeed() == hero1.getSpeed())
                    return hero2.getHp() - hero1.getHp();
                else {
                    return hero2.getSpeed() - hero1.getSpeed();
                }
            }
        });

        System.out.println("Queue to move");
        queueForAMove.forEach(n -> n.step(blue, red));

    }
}
