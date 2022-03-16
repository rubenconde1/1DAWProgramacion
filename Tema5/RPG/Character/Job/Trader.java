package Tema5.RPG.Character.Job;

import Tema5.RPG.Character.Stat.Constitution;
import Tema5.RPG.Character.Stat.Dexterity;
import Tema5.RPG.Character.Stat.Intelligence;
import Tema5.RPG.Character.Stat.Stat;

public class Trader extends Job {
    @Override
    public int modifier(Stat stat) {
        int resultado = 0;

        if (stat instanceof Intelligence) {
            resultado = 4;
        } else if (stat instanceof Dexterity) {
            resultado = 2;
        } else if (stat instanceof Constitution) {
            resultado = -1;
        }
        return resultado;
    }
}
