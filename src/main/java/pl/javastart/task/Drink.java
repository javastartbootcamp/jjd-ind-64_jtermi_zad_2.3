package pl.javastart.task;

import java.util.Locale;

public class Drink {

    String drinkName;
    float drinkPrice;
    boolean drinkAlco;
    Ingredients ingredients = new Ingredients();

    public Drink(String drinkName, float drinkPrice, boolean drinkAlco) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkAlco = drinkAlco;
    }

    public class Ingredients {
        String ingredient1Name;
        float ingredient1Volume;
        String ingredient2Name;
        float ingredient2Volume;
        String ingredient3Name;
        float ingredient3Volume;
    }

    public void ingredients(String ingredient1Name, float ingredient1Volume,
                            String ingredient2Name, float ingredient2Volume,
                            String ingredient3Name, float ingredient3Volume) {

        this.ingredients.ingredient1Name = ingredient1Name;
        this.ingredients.ingredient1Volume = ingredient1Volume;
        this.ingredients.ingredient2Name = ingredient2Name;
        this.ingredients.ingredient2Volume = ingredient2Volume;
        this.ingredients.ingredient3Name = ingredient3Name;
        this.ingredients.ingredient3Volume = ingredient3Volume;

    }

    public void printout() {
        System.out.println("Drink: " + this.drinkName);
        System.out.printf(Locale.US, "Cena: %.1fzł \n", this.drinkPrice);
        System.out.println("Czy zawiera alkohol? " + this.drinkAlco);
        System.out.println("Składniki:");
        System.out.println(this.ingredients.ingredient1Name);
        System.out.println(this.ingredients.ingredient2Name);
        System.out.println(this.ingredients.ingredient3Name);
        System.out.printf(Locale.US, "Pojemność: %.1fml \n\n",
                (this.ingredients.ingredient1Volume + this.ingredients.ingredient2Volume
                + this.ingredients.ingredient3Volume));

    }

}
