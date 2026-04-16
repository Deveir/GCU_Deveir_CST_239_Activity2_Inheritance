package app;

public class Game {

    public static void main(String[] args) {

        Bomb bomb = new Bomb();
        Gun gun = new Gun();

        System.out.println("=== Activate Weapons ===");
        bomb.activate(true);
        gun.activate(true);

        System.out.println();
        System.out.println("=== Fire Weapons with no argument ===");
        bomb.fireWeapon();
        gun.fireWeapon();

        System.out.println();
        System.out.println("=== Fire Weapons with power argument ===");
        bomb.fireWeapon(100);
        gun.fireWeapon(40);
    }
}