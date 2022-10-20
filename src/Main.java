public class Main {

    public static void main(String[] args){
        Boss boss = new Boss();
        boss.setHp(700);
        boss.setDamage(50);


        Skelet skelet = new Skelet();
        skelet.setHp(300);
        skelet.setDamage(30);
        skelet.setStrel(6);
        System.out.println("Sklet Hp; " + skelet.getHp() + " Damage; " + skelet.getDamage() + " strela; " + skelet.getStrel());


        Weapon weapon = new Weapon();
        weapon.setNum(2);
        weapon.setWeapon("Kulak_ne_cokrushimost");
        boss.setWeaponBoss(weapon);
        System.out.println("BOSS Hp; " + boss.getHp() + " Damage; " + boss.getDamage() + " Weapon Boss "
                + boss.getWeaponBoss().getNum() + "  " + boss.getWeaponBoss().getWeapon() );

        System.out.println(boss.printInfo());


    }
}
