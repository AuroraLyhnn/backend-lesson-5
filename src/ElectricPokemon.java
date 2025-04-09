import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private final List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound, "electric");
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon attacker, Pokemon enemy){
        setAttack("thunderPunch");
        setAttackPower(5);
        executeAttack(attacker, enemy);
    }

    void electroBall(Pokemon attacker, Pokemon enemy){
        setAttack("electroBall");
        setAttackPower(10);
        executeAttack(attacker, enemy);
    }

    void thunder(Pokemon attacker, Pokemon enemy){
        setAttack("thunder");
        setAttackPower(15);
        executeAttack(attacker, enemy);
        setHealPower(10);
        attacker.healHp();
        System.out.println(attacker.getName() + " healed 10 hp. It's has now " + attacker.getHp() + " hp");
    }

    void voltTackle(Pokemon attacker, Pokemon enemy){
        setAttack("voltTackle");
        setAttackPower(20);
        executeAttack(attacker, enemy);
    }

    @Override
    public void decideDamageByType(Pokemon enemy) {
        switch (enemy.getType()) {
            case ("electric"):
                setDamageByType(1);
            case ("fire"):
                setDamageByType(2);
            case("grass"):
                setDamageByType(3);
            case("water"):
                setDamageByType(4);
        }
    }
}
