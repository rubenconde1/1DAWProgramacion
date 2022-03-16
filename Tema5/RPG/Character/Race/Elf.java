package Tema5.RPG.Character.Race;

import Tema5.RPG.Character.Stat.Constitution;
import Tema5.RPG.Character.Stat.Dexterity;
import Tema5.RPG.Character.Stat.Intelligence;
import Tema5.RPG.Character.Stat.Stat;

public class Elf extends Race {
    @Override
    public int modifier(Stat stat) {
        int resultado = 0;

        if (stat instanceof Dexterity) {
            resultado = 3;
        } else if (stat instanceof Intelligence) {
            resultado = 3;
        } else if (stat instanceof Constitution) {
            resultado = -1;
        }
        return resultado;
    }
}
