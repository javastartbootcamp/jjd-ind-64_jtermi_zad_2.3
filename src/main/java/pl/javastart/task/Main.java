package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Drink drink1 = new Drink("Mojito", 13, true);
        drink1.ingredients("woda", 60, "sok cytrynowy",
                100, "wódka", 50);

        Drink drink2 = new Drink("Kamikadze", 24, true);
        drink2.ingredients("wódka", 75,
                            "blue curacao", 75,
                            "sok z cytryny", 75);

        Drink drink3 = new Drink("Cuba Libre", 30, true);
        drink3.ingredients("biały rum", 60,
                            "cola", 120,
                            "sok z limonki", 10);

        drink1.printout();
        drink2.printout();
        drink3.printout();

    }
}
