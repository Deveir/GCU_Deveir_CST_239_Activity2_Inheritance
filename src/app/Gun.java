package app;

public class Gun extends Weapon {

    @Override
    public void fireWeapon(int power) {
        System.out.println("Gun fireWeapon(int) called with power = " + power);
    }

    // Overloaded method
    public void fireWeapon() {
        System.out.println("Gun fireWeapon() called");
        super.fireWeapon(25);
    }

    @Override
    public void activate(boolean enable) {
        System.out.println("Gun activate(boolean) called with enable = " + enable);
    }
}