package com.company;

public class Warrior extends Player{

    private String attackType;

    public Warrior() {

    }

    public Warrior(String attackType) {
        this.attackType = attackType;
    }

    public Warrior(String name, int health, int damage, String attackType) {
        super(name, health, damage);
        this.attackType = attackType;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }
}
