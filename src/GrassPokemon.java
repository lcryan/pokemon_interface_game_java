import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private static final String type = "gp"; // not quite sure, if this will work here ?? //
    private static final List<String> attacks = Arrays.asList("Leafstorm", "Leechseed", "Leaveblade", "Solarbeam");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
    }
}
