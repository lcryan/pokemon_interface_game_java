import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    private final String name;
    private final String town;
    List<Pokemon> pokemons;

    public PokemonGymOwner(String name, String town) {
        super(name);
        this.name = name;
        this.town = town;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    @Override
    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    @Override
    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
