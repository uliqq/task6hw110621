package com.company;

public class Magical extends Player{

    private String spell;

    public Magical() {

    }

    public Magical(String spell) {
        this.spell = spell;
    }

    public Magical(String name, int health, int damage, String spell) {
        super(name, health, damage);
        this.spell = spell;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }
}
