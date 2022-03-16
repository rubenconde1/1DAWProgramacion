package Tema5.RPG.Character.Job;

import Tema5.RPG.Character.Stat.Constitution;
import Tema5.RPG.Character.Stat.Stat;
import Tema5.RPG.Character.Stat.Strength;

public class Warrior extends Job {
    @Override
    public int modifier(Stat stat) {
        int resultado = 0;

        if (stat instanceof Strength) {
            resultado = 3;
        } else if (stat instanceof Constitution) {
            resultado = 2;
        }
        return resultado;
    }
}
