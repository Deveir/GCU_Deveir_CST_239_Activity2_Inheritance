package app;

import java.util.Random;

/**
 * The superHero class represents a basic superhero with a variables. This class also indicates
 * when the hero dies. This class show when heros are attacking each other
 */

public class SuperHero {
    private String name;
    private int health;
    private boolean isDead;

    // Non-default constructor
    public SuperHero(String name, int health) {
        this.name = name;
        this.health = health;
        this.isDead = false;
    }

    // Attack another SuperHero
    public void attack(SuperHero opponent) {
        Random random = new Random();
        int damage = random.nextInt(10) + 1; // random number from 1 to 10

        opponent.determineHealth(damage);

        // Debugging / game progress output
        System.out.println(this.name + " attacks " + opponent.name + " for " + damage + " damage.");
        System.out.println(opponent.name + "'s health is now " + opponent.health + ".");
        System.out.println();
    }

    // Returns whether this hero is dead
    public boolean isDead() {
        return isDead;
    }

    // Private method to reduce health and determine if dead
    private void determineHealth(int damage) {
        health = health - damage;

        if (health <= 0) {
            health = 0;
            isDead = true;
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }
}