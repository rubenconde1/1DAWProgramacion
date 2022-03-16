package Tema5.RPG.Character.Race;

import Tema5.RPG.Character.Stat.Constitution;
import Tema5.RPG.Character.Stat.Intelligence;
import Tema5.RPG.Character.Stat.Stat;
import Tema5.RPG.Character.Stat.Strength;

public class Orc extends Race {
    @Override
    public int modifier(Stat stat) {
        int resultado = 0;

        if (stat instanceof Strength) {
            resultado = 5;
        } else if (stat instanceof Constitution) {
            resultado = 3;
        } else if (stat instanceof Intelligence) {
            resultado = -1;
        }
        return resultado;
    }
}
