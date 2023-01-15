package pl.javastart.task;

import java.util.Locale;

public class Drink {

    String name;
    float price;
    boolean alcoholContent;
    Ingredient ingredient1 = new Ingredient();
    Ingredient ingredient2 = new Ingredient();
    Ingredient ingredient3 = new Ingredient();

    public Drink(String name, float price, boolean alcoholContent) {
        this.name = name;
        this.price = price;
        this.alcoholContent = alcoholContent;
    }

    public class Ingredient {
        String name;
        float volume;
    }

    public void ingredients(String ingredient1Name, float ingredient1Volume,
                            String ingredient2Name, float ingredient2Volume,
                            String ingredient3Name, float ingredient3Volume) {

        this.ingredient1.name = ingredient1Name;
        this.ingredient1.volume = ingredient1Volume;
        this.ingredient2.name = ingredient2Name;
        this.ingredient2.volume = ingredient2Volume;
        this.ingredient3.name = ingredient3Name;
        this.ingredient3.volume = ingredient3Volume;

    }

    public void printout() {
        System.out.println("Drink: " + this.name);
        System.out.printf(Locale.US, "Cena: %.1fzł \n", this.price);
        System.out.println("Czy zawiera alkohol? " + this.alcoholContent);
        System.out.println("Składniki:");
        System.out.println(this.ingredient1.name);
        System.out.println(this.ingredient2.name);
        System.out.println(this.ingredient3.name);
        System.out.printf(Locale.US, "Pojemność: %.1fml \n\n",
                (this.ingredient1.volume + this.ingredient2.volume
                + this.ingredient3.volume));

    }

}
