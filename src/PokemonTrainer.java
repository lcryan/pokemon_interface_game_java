import java.util.List;

public class PokemonTrainer {
    String name;
    String user;
    String pokemons;

    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.user = user;
        this.pokemons = pokemons.toString();

        // TODO : the names of string have to change here! To be researched on !
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons.toString();
    }
}
