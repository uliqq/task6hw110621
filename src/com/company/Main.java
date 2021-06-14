package com.company;

public class Main {

    public static void main(String[] args) {

        Boss titan = new Boss("Titan", 1600, 50, "Golden");
        System.out.println("Name " + titan.getName() + "\nHealth Points: " + titan.getHealth() + "\nDamage: " + titan.getDamage() + "\nDefence Type: " + titan.getDefenceType());
        titan.bossDamageDeal();
        titan.stunning();

        System.out.println("\n\n");
        Warrior troll = new Warrior("Troll Warlord", 500, 30, "Critical Attacks");
        System.out.println("Name " + troll.getName() + "\nHealth Points: " + troll.getHealth() + "\nDamage: " + troll.getDamage() + "\nAttack Type: " + troll.getAttackType());
        troll.heroDamageDeal();
        troll.rage();

        System.out.println("\n\n");
        Magical maiden = new Magical("Crystal Maiden", 280, 15, "Freezer");
        System.out.println("Name " + maiden.getName() + "\nHealth Points: " + maiden.getHealth() + "\nDamage: " + maiden.getDamage() + "\nSpell: " + maiden.getSpell());
        maiden.heroDamageDeal();
        maiden.freezing();

        System.out.println("\n\n");
        Mental oracle = new Mental("Oracle", 300, 20, "Telekinesis");
        System.out.println("Name " + oracle.getName() + "\nHealth Points: " + oracle.getHealth() + "\nDamage: " + oracle.getDamage() + "\nAbility: " + oracle.getAbility());
        oracle.heroDamageDeal();
        oracle.telekinesis();
        System.out.println("\n\n");
    }
}
