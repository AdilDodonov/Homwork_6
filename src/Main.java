public class Main {

    public static void main(String[] args){
        Boss boss = new Boss();
        boss.setHp(700);
        boss.setDamage(50);

        Weapon weapon = new Weapon();
        weapon.setNum(2);
        weapon.setWeapon("Kulak_ne_cokrushimost");
        boss.setWeaponBoss(weapon);

        System.out.println(boss.printInfo());





        Skelet skelet = new Skelet();
        skelet.setHp(300);
        skelet.setDamage(30);
        skelet.setStrel(6);

        Weapon weapon1 = new Weapon();
        weapon1.setNum(1);
        weapon1.setWeapon("Kulak_ne_cokrushimost");
        skelet.setWeaponBoss(weapon1);

        System.out.println(skelet.printInfo());








    }
}
