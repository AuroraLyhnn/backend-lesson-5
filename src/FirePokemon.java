import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private final List<String> attacks = Arrays.asList("fireLash", "flameThrower", "inferno", "pyroBall");

    public FirePokemon (String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "fire");
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void fireLash(Pokemon attacker, Pokemon enemy){
        setAttack("fireLash");
        setAttackPower(5);
        executeAttack(attacker, enemy);
    }

    void flameThrower(Pokemon attacker, Pokemon enemy){
        setAttack("flameThrower");
        setAttackPower(10);
        executeAttack(attacker, enemy);
    }

    void inferno(Pokemon attacker, Pokemon enemy){
        setAttack("inferno");
        setAttackPower(15);
        executeAttack(attacker, enemy);
    }

    void pyroBall(Pokemon attacker, Pokemon enemy){
        setAttack("pyroBall");
        setAttackPower(20);
        executeAttack(attacker, enemy);
    }

    @Override
    public void decideDamageByType(Pokemon enemy) {
        switch (enemy.getType()) {
            case ("fire"):
                setDamageByType(1);
            case ("electric"):
                setDamageByType(2);
            case("water"):
                setDamageByType(3);
            case("grass"):
                setDamageByType(4);
        }
    }
}
