package Tema5.RPG.Character.Job;

import Tema5.RPG.Character.Stat.Stat;

public abstract class Job {
    //Constructor
    public Job(){

    }

    //Devuelve el modificador de la profesión según el stat
    public abstract int modifier (Stat stat);

    @Override
    //Devuelve true si son la misma clase
    public boolean equals(Object obj) {
        return getClass().getName().equals(obj.getClass().getName());
    }

    @Override
    //Devuelve el nombre simple de la clase
    public String toString() {
        return getClass().getName();
    }

    public void nombreRaza(){

    }
}
