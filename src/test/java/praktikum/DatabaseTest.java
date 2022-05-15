package praktikum;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    @Test
    public void getAvailableBunsTest() {
        Database database = new Database();

        List<Bun> actual = database.availableBuns();
        List<Bun> expected = new ArrayList<>(List.of(
                new Bun("black bun", 100),
                new Bun("white bun", 200),
                new Bun("red bun", 300)));

        assertEquals("Bun size is correct", expected.size(), actual.size());
        assertEquals("Bun price is correct", expected.get(0).price, actual.get(0).price, 0);
        assertEquals("Name of bun is correct", expected.get(0).name, actual.get(0).name);
    }

    @Test
    public void getAvailableIngredientsTest() {
        Database database = new Database();

        List<Ingredient> actual = database.availableIngredients();
        List<Ingredient> expected = new ArrayList<>(List.of(
                new Ingredient(IngredientType.SAUCE, "hot sauce", 100),
                new Ingredient(IngredientType.SAUCE, "sour cream", 200),
                new Ingredient(IngredientType.SAUCE, "chili sauce", 300),
                new Ingredient(IngredientType.FILLING, "cutlet", 100),
                new Ingredient(IngredientType.FILLING, "dinosaur", 200),
                new Ingredient(IngredientType.FILLING, "sausage", 300)));

        assertEquals("Ingredient size is correct", expected.size(), actual.size());
        assertEquals("Ingredient price is correct", expected.get(0).price, actual.get(0).price, 0);
        assertEquals("Name of ingredient is correct", expected.get(0).name, actual.get(0).name);
        assertEquals("Ingredient type is correct", expected.get(0).type, actual.get(0).type);
    }
}
