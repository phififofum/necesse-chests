package qolchests;

import java.awt.Color;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.*;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;
import necesse.level.gameObject.container.*;

@ModEntry
public class QolChests {

    // We define our static registered objects here, so they can be referenced elsewhere
    public static Color genericColor = new Color(1, 30, 42);

    public void init() {
        System.out.println("Loading in chests mod!");

        // Register Chests
//        ObjectRegistry.registerObject("ironchest", new StorageBoxInventoryObject("ironchest", 45, genericColor), 10.0f, true);
        ObjectRegistry.registerObject("demonicchest", new StorageBoxInventoryObject("demonicchest", 50, genericColor), 20.0f, true);
//        ObjectRegistry.registerObject("ivychest", new StorageBoxInventoryObject("ivychest", 55, genericColor), 30.0f, true);
        ObjectRegistry.registerObject("tungstenchest", new StorageBoxInventoryObject("tungstenchest", 60, genericColor), 40.0f, true);

        System.out.println("Completed loading chests!");
    }

    public void initResources() {
    }

    public void postInit() {
//        // Recipe - iron chest
//        Recipes.registerModRecipe(new Recipe(
//                "ironchest",
//                1,
//                RecipeTechRegistry.CARPENTER,
//                new Ingredient[]{
//                        new Ingredient("ironbar", 10)
//                }
//        ));

        // Recipe - demonic chest
        Recipes.registerModRecipe(new Recipe(
                "demonicchest",
                1,
                RecipeTechRegistry.CARPENTER,
                new Ingredient[]{
                        new Ingredient("demonicbar", 20)
                }
        ));

//        // Recipe - ivy chest
//        Recipes.registerModRecipe(new Recipe(
//                "ivychest",
//                1,
//                RecipeTechRegistry.CARPENTER,
//                new Ingredient[]{
//                        new Ingredient("ivybar", 30)
//                }
//        ));

        // Recipe - tungsten chest
        Recipes.registerModRecipe(new Recipe(
                "tungstenchest",
                1,
                RecipeTechRegistry.CARPENTER,
                new Ingredient[]{
                        new Ingredient("tungstenbar", 40)
                }
        ));
    }

}
