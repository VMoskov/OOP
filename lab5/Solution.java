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

class Pokemon {
    private String name;
    private int pokedexNumber;
    private List<Move> moves;

    public Pokemon(String name, int pokedexNumber, List<Move> moveset) {
        this.name = name;
        this.pokedexNumber = pokedexNumber;
        this.moves = moveset;
    }

    public String getName() {
        return name;
    }

    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public List<Move> getMoves() {
        return moves;
    }
}

class Move {
    private String name;
    private int power;

    public Move(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Move)) {
            return false;
        } else {
            Move m = (Move) obj;
            return m.getName().equals(this.getName()) && m.getPower() == this.getPower();
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power);
    }
}