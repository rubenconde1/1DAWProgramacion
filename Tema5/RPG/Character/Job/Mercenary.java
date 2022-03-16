package Tema5.RPG.Character.Job;

import Tema5.RPG.Character.Stat.Dexterity;
import Tema5.RPG.Character.Stat.Intelligence;
import Tema5.RPG.Character.Stat.Stat;
import Tema5.RPG.Character.Stat.Strength;

public class Mercenary extends Job {
    @Override
    public int modifier(Stat stat) {
        int resultado = 0;

        if (stat instanceof Strength) {
            resultado = 4;
        } else if (stat instanceof Dexterity) {
            resultado = 3;
        } else if (stat instanceof Intelligence) {
            resultado = -2;
        }
        return resultado;
    }
}
