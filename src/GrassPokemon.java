import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private final List<String> attacks = Arrays.asList("leafBlade", "solarBeam", "leefStorm", "leechSeed");

    public GrassPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound, "grass");
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void leafBlade(Pokemon attacker, Pokemon enemy){
        setAttack("leafBlade");
        setAttackPower(10);
        executeAttack(attacker, enemy);
    }

    public void solarBeam(Pokemon attacker, Pokemon enemy){
        setAttack("solarBeam");
        setAttackPower(15);
        executeAttack(attacker, enemy);
    }

    public void leafStorm(Pokemon attacker, Pokemon enemy){
        setAttack("leafStorm");
        setAttackPower(20);
        executeAttack(attacker, enemy);
    }

    public void leechSeed(Pokemon attacker, Pokemon enemy){
        setAttack("leechSeed");
        setAttackPower(5);
        executeAttack(attacker, enemy);
        setHealPower(getTotalDamage());
        attacker.healHp();
    }

    @Override
    public void decideDamageByType(Pokemon enemy) {
        switch (enemy.getType()) {
            case ("grass"):
                setDamageByType(1);
            case ("water"):
                setDamageByType(2);
            case("fire"):
                setDamageByType(3);
            case("electric"):
                setDamageByType(4);
        }
    }
}
