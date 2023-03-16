import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;



class Solution {
    public Predicate<Pokemon> pokemonWithAllMovesStrongerThan(int power){
        return pokemon -> !pokemon.getMoves().stream().filter(m -> m.getPower() < power).findFirst().isPresent();
    }

    public Predicate<Pokemon> pokemonWithSpecificMove(Move move){
        return pokemon -> pokemon.getMoves().stream().filter(m -> m.getName().equals(move.getName())).findFirst().isPresent();
    }
}