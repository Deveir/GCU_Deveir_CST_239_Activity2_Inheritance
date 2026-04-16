package app;

public class Bomb extends Weapon {

    @Override
    public void fireWeapon(int power) {
        System.out.println("Bomb fireWeapon(int) called with power = " + power);
    }

    // Overloaded method
    public void fireWeapon() {
        System.out.println("Bomb fireWeapon() called");
        super.fireWeapon(50);
    }

    @Override
    public void activate(boolean enable) {
        System.out.println("Bomb activate(boolean) called with enable = " + enable);
    }
}