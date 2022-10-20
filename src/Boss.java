import java.util.Arrays;

public class Boss extends GameEntity {
    private Weapon weaponBoss;

    public Weapon getWeaponBoss() {
        return weaponBoss;
    }

    public void setWeaponBoss(Weapon weaponBoss) {
        this.weaponBoss = weaponBoss;
    }

    @Override
    public String printInfo() {
        return super.printInfo() +  " Weapon BOSS; " + weaponBoss.getNum() + "  " + weaponBoss.getWeapon();
    }
}

