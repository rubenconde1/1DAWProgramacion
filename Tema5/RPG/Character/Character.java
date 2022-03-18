package Tema5.RPG.Character;

import Tema5.RPG.Character.Job.Job;
import Tema5.RPG.Character.Race.Race;
import Tema5.RPG.Character.Stat.Constitution;
import Tema5.RPG.Character.Stat.Dexterity;
import Tema5.RPG.Character.Stat.Intelligence;
import Tema5.RPG.Character.Stat.Strength;

public class Character implements IDamageable{
    private String name;
    private Race race;
    private Job job;
    private Strength strength;
    private Dexterity dexterity;
    private Constitution constitution;
    private Intelligence intelligence;
    private double holdHealth;
    private double holdAmount;

    //Constructor
    public Character(String name, Race race, Job job) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = new Strength(5);
        this.dexterity = new Dexterity(5);
        this.constitution = new Constitution(5);
        this.intelligence = new Intelligence(5);
    }

    //Getters
    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Job getJob() {
        return job;
    }

    //(Valor base Dexterity + bonif. raza + bonif.profesion)*2
    public double velocity(){
        return (dexterity.getValue() + race.modifier(dexterity) + job.modifier(dexterity)) * 2;
    }

    //(Valor base Strength + bonif. raza + bonif. profesion)*2
    public double power(){
        return (strength.getValue() + race.modifier(strength) + job.modifier(strength)) * 2;
    }

    //(Valor base Intelligence + bonif. raza + bonif. profesion)*2
    public double magic(){
        return (intelligence.getValue() + race.modifier(intelligence) + job.modifier(intelligence) * 2);
    }

    @Override
    public String toString() {
        return "My name is " + getName() + "I'm an " + getRace() + getJob() + "My stats are: Strength: " + race.modifier(strength) + "Dexterity: " + 
        race.modifier(dexterity) + "Constitution: " + race.modifier(constitution) + "Intelligence: " + race.modifier(intelligence) + "Velocity: " + 
        velocity() + "Power: " + power() + "Magic: " + magic() + "Health: ";
    }

    @Override
    public double maxHealth() {
        
        return (constitution.getValue() + race.modifier(constitution) + job.modifier(constitution) * 25);
    }

    @Override
    public double Health() {
        double definedlHealth = maxHealth();
        holdHealth = definedlHealth - holdAmount;
        return holdHealth;
    }

    @Override
    public boolean isDead() {
        if (holdHealth < holdAmount) {
            holdAmount = 0;
            holdHealth = 0;
            return true;
        } else
        return false;
    }

    @Override
    public void receivesDamage(double amount) {
        System.out.println(getName() + "reveived " + amount + "damage. Health: " + (Health() - amount) + "/" + maxHealth());
        holdAmount = amount;
    }

    @Override
    public void heals(double amount) {
        System.out.print(getName() + "healed " + amount + " life. Health: " + (Health() - amount) + "/" + maxHealth());
        
    }   
}
