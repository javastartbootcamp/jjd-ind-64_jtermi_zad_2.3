package pl.javastart.task;

import java.util.Locale;

public class Drink {

    String drinkName;
    float drinkPrice;
    boolean drinkAlco;
    Ingredient ingredient1 = new Ingredient();
    Ingredient ingredient2 = new Ingredient();
    Ingredient ingredient3 = new Ingredient();

    public Drink(String drinkName, float drinkPrice, boolean drinkAlco) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkAlco = drinkAlco;
    }

    public class Ingredient {
        String ingredientName;
        float ingredientVolume;
    }

    public void ingredients(String ingredient1Name, float ingredient1Volume,
                            String ingredient2Name, float ingredient2Volume,
                            String ingredient3Name, float ingredient3Volume) {

        this.ingredient1.ingredientName = ingredient1Name;
        this.ingredient1.ingredientVolume = ingredient1Volume;
        this.ingredient2.ingredientName = ingredient2Name;
        this.ingredient2.ingredientVolume = ingredient2Volume;
        this.ingredient3.ingredientName = ingredient3Name;
        this.ingredient3.ingredientVolume = ingredient3Volume;

    }

    public void printout() {
        System.out.println("Drink: " + this.drinkName);
        System.out.printf(Locale.US, "Cena: %.1fzł \n", this.drinkPrice);
        System.out.println("Czy zawiera alkohol? " + this.drinkAlco);
        System.out.println("Składniki:");
        System.out.println(this.ingredient1.ingredientName);
        System.out.println(this.ingredient2.ingredientName);
        System.out.println(this.ingredient3.ingredientName);
        System.out.printf(Locale.US, "Pojemność: %.1fml \n\n",
                (this.ingredient1.ingredientVolume + this.ingredient2.ingredientVolume
                + this.ingredient3.ingredientVolume));

    }

}
