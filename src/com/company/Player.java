package com.company;

public class Player {

        private String name;
        private int health;
        private int damage;

        public void heroDamageDeal () {
            System.out.println("Damages Boss!");
        }
        public void bossDamageDeal () {
            System.out.println("Damages all heroes!");
        }

        public Player() {

        }

    public Player(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
