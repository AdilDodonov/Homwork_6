import java.util.Arrays;

public class Boss extends GameEntity {
    private Weapon weaponBoss;

    public Weapon getWeaponBoss() {
        return weaponBoss;
    }

    public void setWeaponBoss(Weapon weaponBoss) {
        this.weaponBoss = weaponBoss;
    }

    public String printInfo(){
        return " Hp; " + this.getHp() + " Damage; " + this.getDamage() + " Tip; " + weaponBoss.getNum() + " " + weaponBoss.getWeapon();
    }

}

