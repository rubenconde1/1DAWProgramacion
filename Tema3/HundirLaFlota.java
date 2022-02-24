
public class HundirLaFlota {

    public static void crearBarcos(int numBarcos, int[][] numPlazas) {
        
        int cont = 0;
        
        while (cont < numBarcos) {
            r1 = (int) (Math.random()*8); 
            r2 = (int) (Math.random()*8);
            if (numPlazas[r1][r2] != 1) {
                numPlazas[r1][r2]=1;
                cont++;
            }
        }
        
    }

    public static void imprimirTablero(int[][] tablero) {
        char letra = 'A';
        System.out.println("  1 2 3 4 5 6 7 8");

        for (int i = 0; i < tablero.length; i++) {
            System.out.print(letra + " ");
            letra++;
            for (int j = 0; j < tablero.length; j++) {
                switch (tablero[i][j]) {
                    case 0:
                    case 1:
                        System.out.print("  ");
                        break;
                    case 2:
                        System.out.print("O ");
                        break;
                    case 3:
                        System.out.print("X ");
                        break;
                    default:
                        break;
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] tablero;
        tablero = new int[8][8];
        
        crearBarcos(10, tablero);

        imprimirTablero(tablero);
        int numBarcos = 0;

        do{
            char fila = Utilidades.leerCaracter("Escoge una fila: ");
            int numColumna = Utilidades.leerEntero("Escoge una columna: ");
            int numFila = fila - 'A';
            numColumna--;

            if (tablero[numFila][numColumna] == 0 || tablero[numFila][numColumna] == 1){
                tablero[numFila][numColumna] += 2;
            }
            if(tablero[numFila][numColumna] == 3){
                numBarcos++;
            }
        
        imprimirTablero(tablero);
        }while(numBarcos != 10);
    }    
}


