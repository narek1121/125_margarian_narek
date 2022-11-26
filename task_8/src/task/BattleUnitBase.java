package task;

//исполняем класс BattleUnit в BattleUnitBase для получения всех методов
public abstract class BattleUnitBase implements BattleUnit {

    public int health=-1;
    protected int strength=-1000;
    protected int armor=-1;
    private int maxHealth;
    private final String name;
    int maxArmor;
    int baseStrength;

    //конструктор
    public BattleUnitBase(String name, int maxHealth, int baseStrength, int maxArmor ) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.baseStrength = baseStrength;
        this.maxArmor = maxArmor;
        //добавляем отдельные приколы, чтобы инициализовать переменные (нужно для Infantryman)
        this.armor=armor();
        this.strength=strength();
        this.health=health();
    }
    
    //создаем абстрактные классы
    public abstract void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam);
    public abstract void attack(BattleUnit other);
    
    //реализуем остальные классы. РЕАЛИЗУЕМ = OVERRIDE
    //возвращаем имя
    @Override
    public String name (){
        return this.name;
    }

    //если армор = -1, то он равен максимальному значению армора
    @Override
    public int armor() {
        //int saveArmor = 40;
        if (armor == -1) {
            armor = maxArmor;
        }
        return armor;
    }

    //если хп = -1, то показатель хп равен максимальному значению
    //если хп <0, то хп равно 0
    //если хп больше максимального, то хп равно максимальному
    @Override
    public int health() {
        int retHealth=this.health;
        if (retHealth == -1) {
            retHealth = maxHealth;
        }
        if(retHealth <0 ){
            retHealth = 0;
        }
        if(retHealth > maxHealth ){
            retHealth = maxHealth;
        }
        this.health=retHealth;
        return retHealth;
    }

    //возвращает максимальный показатель хп
    @Override
    public  int maxHealth(){
        return  maxHealth;
    }

    //если хп больше максимального количества, то хп равно максимуму
    @Override
    public  void setMaxHealth(int value) {
        if (this.health > value) this.health = value;
        this.maxHealth = value;
    }

    //если ресает хп, то к количеству хп добавляется value реса
    @Override
    public void heal(int value) {
        this.health += value;
        if (this.health > maxHealth) this.health = maxHealth;
    }

    //вычитает из хп дамаг
    @Override
    public void takeDamage(int value) {
        health = health - value;
    }

    @Override
    public int strength() {
        if (strength ==-1000 ) {
            strength = baseStrength;
        }
        return this.strength;
    }
    @Override
    public void setStrength(int value) {
        this.strength = value;
    }

    @Override
    public int baseStrength(){
        return baseStrength;
    }

    @Override
    public void restoreArmor(int value) {
        this.armor += value;
        if(this.armor > maxArmor) this.armor=maxArmor;
    }

    @Override
    public void damageArmor(int value) {
        this.armor -= value;
        if(this.armor < 0) this.armor=0;
    }

    @Override
    public int maxArmor(){
        return maxArmor;
    }

    @Override
    public void setMaxArmor(int value) {
        this.maxArmor = value;
        if(this.armor>value) this.armor=value;
    }
}
