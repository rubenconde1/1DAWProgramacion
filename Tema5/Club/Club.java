import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    public static ArrayList<Membership> arrayMiembros;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        arrayMiembros = new ArrayList<>();        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        arrayMiembros.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return arrayMiembros.size();
    }

    /**
     * Determinar el número de miembros que se han unido en
     * el mes indicado.
     * @param month El mes que nos interesa
     * @return El número de miembros que se han unido ese mes
     */
    public int joinedInMonth(int month) {
        int miembrosMes = 0;
        if ((month < 1) || (month > 12)) {
            System.out.println("El valor introducido supera lo esperado.");
            return 0;
        } else {
            for (Membership listado : arrayMiembros) {
                if (listado.getMonth() == month) {
                    System.out.println(listado.getName());
                    miembrosMes++;
                }
            }
            return miembrosMes;
        }
    }

    public int purge (int month) {
        Iterator<Membership> it = arrayMiembros.iterator();
        int eliminados = 0;

        while (it.hasNext()) {
            Membership miembro = it.next();

            if (miembro.getMonth() == month) {
                it.remove();
                eliminados++;
            }
        }
        return eliminados;
    }
}
