package task;

import java.util.Arrays;

public class ArmorDestroyer extends BattleUnitBase{

    //конструктор
    public ArmorDestroyer(String name, int maxHealth, int baseStrength, int maxArmor) {
        super(name, maxHealth, baseStrength, maxArmor);
    }

    @Override
    //выбирает активного противника с максимальным армором.
    //если противник в арморе, наносит урон по армору, который равен Х2 силы
    //иначе наносит урон по хп, который равен 0.25 * сила
    //ownTeam - моя команда
    //нужно найти врага с максимальным значением армора
    //ownTeam и enemyTeam - массивы
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        int maxArmorEnemy = 0; //индекс активного противника с максимальным армором
        int maxArmor = 0; //показатель армора
        for (int i = 0; i<enemyTeam.length; i++) {
            BattleUnit enemy = enemyTeam[i]; //просматриваем все элементы массива
            int enemyArmor = enemy.armor();//смотрим все арморы
            int enemyHealth = enemy.health();//смотрим все хп
            if(enemyHealth > 0 && enemyArmor > maxArmor) { //чек наличие армора
                maxArmorEnemy = i; //индекс персонажа с максимальной броней
                maxArmor = enemyArmor;
            }
        }
        double doubleAttack = this.strength*2; //Х2 атака
        double quarterAttack = this.strength / 4; //0.25 атака
        if (enemyTeam[maxArmorEnemy].armor() > 0) { //если армор противника > 0, наносим удар по армору
            enemyTeam[maxArmorEnemy].damageArmor((int) doubleAttack);
        } else { //если нет, то по хп
            enemyTeam[maxArmorEnemy].takeDamage((int) quarterAttack);
        }
    }

    @Override
            //this. - тот, кто атакует
            //other. - тот, кого атакуют
    public void attack(BattleUnit other) {
        double fullAttack = this.strength;
        double halfAttack = this.strength / 2; //создаем переменную, равную 1/2 силы
        double quarterAttack = this.strength / 4; //создаем переменную, равную 1/4 силы
        if(fullAttack < 1) fullAttack=1;
        if(halfAttack < 1) halfAttack=1;
        if(quarterAttack < 1) quarterAttack=1;
        if (other.armor() > 0){
            other.takeDamage((int) quarterAttack);
            other.damageArmor((int) fullAttack);
        } else {
            other.takeDamage((int) halfAttack);
        }
    }
}
