package Tema5.RPG.Character.Race;

import Tema5.RPG.Character.Stat.Stat;

public abstract class Race {
    //Constructor
    public Race() {

    }

    //Devuelve el modificador de la profesión segun el stat.
    public abstract int modifier(Stat stat);

    //Devuelve true si son la misma clase.
    public boolean equals(Object obj){
        return getClass().getName().equals(obj.getClass().getName());
    }

    @Override
    //Devuelve el nombre simple de la clase
    public String toString(){
        return getClass().getName();
    }
}
