abstract class Pokemon {
    private final int level;
    private int hp;
    private final String name;
    private final String sound;
    private final String food;
    private final String type;
    private String attack;
    private int attackPower;
    private int damageByType;
    private int totalDamage;
    private int healPower;

    public Pokemon(String name, int level, int hp, String food, String sound, String type){
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;

    }

    void executeAttack(Pokemon attacker, Pokemon enemy) {
        System.out.println(attacker.getName() + " attacks " + enemy.getName() + " with " + getAttack());
        decideDamageByType(enemy);
        calculateTotalDamage();
        System.out.println(enemy.getName() + " loses " + getTotalDamage() + " hp");
        enemy.setNewHp();
        System.out.println(enemy.getName() + "'s hp is now " + enemy.getHp());
    }

    public abstract void decideDamageByType(Pokemon enemy);

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public void setNewHp() {
        this.hp = hp - getTotalDamage();
    }

    public int getHealPower() {
        return healPower;
    }

    public void setHealPower(int healPower) {
        this.healPower = healPower;
    }

    public void healHp() {
        this.hp = hp + healPower;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public String getType() {
        return type;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDamageByType() {
        return damageByType;
    }

    public void setDamageByType(int damageByType) {
        this.damageByType = damageByType;
    }

    public int getTotalDamage() {
        return totalDamage;
    }

    public void calculateTotalDamage () {
        this.totalDamage = getAttackPower() * getDamageByType();
    }
}
