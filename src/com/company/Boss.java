package com.company;

public class Boss extends Player {

    private String defenceType;

    public Boss() {

    }

    public Boss(String defenceType) {
        this.defenceType = defenceType;
    }

    public Boss(String name, int health, int damage, String defenceType) {
        super(name, health, damage);
        this.defenceType = defenceType;
    }

    public String getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }
}
