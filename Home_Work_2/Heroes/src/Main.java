import units.*;

public class Main {
    public static void main(String[] args) {
        Sniper name1 = new Sniper("Shadow");
        System.out.println(name1.getInfo());
        Crossbowman name2 = new Crossbowman("Olaf");
        System.out.println(name2.getInfo());
        Spearman name3 = new Spearman("Ice");
        System.out.println(name3.getInfo());
        Robber name4 = new Robber("RobinHood");
        System.out.println(name4.getInfo());
        Wizard name5 = new Wizard("Gendalf");
        System.out.println(name5.getInfo());
        Monk name6 = new Monk("Pope");
        System.out.println(name6.getInfo());
        Peasant name7 = new Peasant("Franky");
        System.out.println(name7.getInfo());
    }
}
