package Tema5.RPG.Character;

import Tema5.RPG.Character.Job.Job;
import Tema5.RPG.Character.Race.Race;
import Tema5.RPG.Character.Stat.Constitution;
import Tema5.RPG.Character.Stat.Dexterity;
import Tema5.RPG.Character.Stat.Intelligence;
import Tema5.RPG.Character.Stat.Strength;

public class Character {
    private String name;
    private Race race;
    private Job job;
    private Strength strength;
    private Dexterity dexterity;
    private Constitution constitution;
    private Intelligence intelligence;

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
        return 0;
    }

    //(Valor base Strength + bonif. raza + bonif. profesion)*2
    public double power(){
        return 0;
    }

    //(Valor base Intelligence + bonif. raza + bonif. profesion)*2
    public double magic(){
        return 0;
    }

    @Override
    public String toString() {
        return "Character [constitution=" + constitution + ", dexterity=" + dexterity + ", intelligence=" + intelligence
                + ", job=" + job + ", name=" + name + ", race=" + race + ", strength=" + strength + "]";
    }

    
}
