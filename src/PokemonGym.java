import java.util.List;

public interface PokemonGym {
    void enteredTheGym(PokemonTrainer name);
    void printPokemon(List<Pokemon> pokemons);
    Pokemon selectPokemon(String pokemon, PokemonTrainer trainer);
    void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon);
    Pokemon chooseGymPokemon(PokemonGymOwner gymowner);
    Pokemon choosePokemon(PokemonTrainer trainer);
    int randomAttackByGymOwner();
    String chooseAttackPlayer(Pokemon name);
    void performAttackPlayer(Pokemon pokemon, Pokemon gymPokemon, String attack);
    void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon);
    void attackOrChange(Pokemon pokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner gym);



}
