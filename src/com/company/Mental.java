package com.company;

public class Mental extends Player{

    private String ability;

    public void telekinesis () {
        System.out.println("Oracle raises up Titan and throws him down, stunning him!");
    }

    public Mental() {

    }

    public Mental(String ability) {
        this.ability = ability;
    }

    public Mental(String name, int health, int damage, String ability) {
        super(name, health, damage);
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
}
