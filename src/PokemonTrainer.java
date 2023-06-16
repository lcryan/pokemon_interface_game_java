import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {
    private final String name;

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    private List<Pokemon> pokemons = new ArrayList<>();

    public PokemonTrainer(String name) {
        this.name = name;

        // TODO : the names of string have to change here! To be researched on ! //
    }
    public String getName() {
        return name;
    }

}
