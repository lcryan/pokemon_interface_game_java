import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private static final String type = "fire"; // I didn't manage to find this by myself and checked the "uitwerkingen code here"
    private static final List<String> attacks = Arrays.asList("Inferno", "Pyroball", "Firelash", "Flamethrower");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type); //
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
    }

    void fireLash(Pokemon name, Pokemon enemy) {
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
    }
}
