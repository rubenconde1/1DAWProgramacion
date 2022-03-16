package Tema5.RPG.Character.Job;

import Tema5.RPG.Character.Stat.Constitution;
import Tema5.RPG.Character.Stat.Dexterity;
import Tema5.RPG.Character.Stat.Stat;
import Tema5.RPG.Character.Stat.Strength;

public class Assassin extends Job {
    @Override
    public int modifier(Stat stat) {
        int resultado = 0;

        if (stat instanceof Dexterity) {
            resultado = 3;
        } else if (stat instanceof Strength) {
            resultado = 1;
        } else if (stat instanceof Constitution) {
            resultado = 1;
        }
        return resultado;
    }
}
