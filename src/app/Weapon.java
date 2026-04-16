package app;

public abstract class Weapon {

    public void fireWeapon(int power) {
        System.out.println("Weapon fireWeapon(int) called with power = " + power);
    }

    public abstract void activate(boolean enable);
}