import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private final List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "water");
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon attacker, Pokemon enemy) {
        setAttack("surf");
        setAttackPower(10);
        executeAttack(attacker, enemy);
    }

    void hydroPump(Pokemon attacker, Pokemon enemy) {
        setAttack("hydroPump");
        setAttackPower(15);
        executeAttack(attacker, enemy);
    }

    void hydroCanon(Pokemon attacker, Pokemon enemy) {
        setAttack("hydroCanon");
        setAttackPower(20);
        executeAttack(attacker, enemy);
    }

    void rainDance(Pokemon attacker, Pokemon enemy) {
        setAttack("rainDance");
        setHealPower(15);
        attacker.healHp();
        System.out.println(attacker.getName() + "uses rainDance. It healed " + attacker.getName() + " with 15 hp");
        System.out.println(attacker.getName() + "'s hp is now " + attacker.getHp());
        switch (enemy.getType()){
            case("electric"):
                System.out.println("It has no effect on " + enemy.getName());
                break;
            case("grass"):
                enemy.healHp();
                System.out.println("it also healed " + enemy.getName() + " with " + getHealPower() + " hp");
                System.out.println(enemy.getName()+ "'s hp is now " + enemy.getHp());
            default:
                break;
        }
    }

    @Override
    public void decideDamageByType(Pokemon enemy) {
        switch (enemy.getType()) {
            case ("water"):
                setDamageByType(1);
            case ("grass"):
                setDamageByType(2);
            case("electric"):
                setDamageByType(3);
            case("fire"):
                setDamageByType(4);
        }
    }
}
