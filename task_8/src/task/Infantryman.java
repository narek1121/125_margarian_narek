package task;

public class Infantryman extends BattleUnitBase {

    //конструктор
    public Infantryman(String name, int maxHealth, int baseStrength, int maxArmor) {
        super(name, maxHealth, baseStrength, maxArmor);
    }

    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
    }

    @Override
    //если противник в арморе (+),наносит - по хп, равные 1/2 от дамага (+),
    //- по армору равные 1/4 от дамага, (+) иначе
    //наносит - хп, равные дамагу. (+)
    //минимальные - любого типа  -1
            //this. - тот, кто атакует
            //attacker. - тот, кого атакуют
    public void attack(BattleUnit attacker) {
        double halfAttack = (this.strength / 2); //формируем переменную, которая будет равна 1/2 от дамага
        double quarterAttack = (this.strength / 4); //формируем переменную, которая будет равна 1/4 от дамага
        if(halfAttack < 1) halfAttack=1; //чекаем то, что дамаг не может быть < 1
        if(quarterAttack < 1) quarterAttack=1; //чекаем то, что дамаг не может быть < 1
        if(attacker.armor()==0) { //если армор у атакуемого отсутствует, то его хп уменьшается на количество дамага атакующего
            attacker.takeDamage(this.strength);
        } else {
            attacker.takeDamage((int) halfAttack); //если есть армор у атакумоего, то хп уменьшается на 1/2
            attacker.damageArmor((int) quarterAttack); //дамаг атакующего, а армор на 1/4
        }
    }
}