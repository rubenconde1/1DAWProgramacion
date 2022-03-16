package Tema5.RPG.Character.Race;

import Tema5.RPG.Character.Stat.Dexterity;
import Tema5.RPG.Character.Stat.Intelligence;
import Tema5.RPG.Character.Stat.Stat;
import Tema5.RPG.Character.Stat.Strength;

public class Wizard extends Race{
    @Override
    public int modifier(Stat stat) {
        int resultado = 0;

        if (stat instanceof Strength) {
            resultado = -2;
        } else if (stat instanceof Dexterity) {
            resultado = 2;
        } else if (stat instanceof Intelligence) {
            resultado = 5;
        }
        return resultado;
    }
}
