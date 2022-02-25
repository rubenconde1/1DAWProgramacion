
public class ValoresACero {
    public static void main(String[] args) {
        
        
        int[][] matriz = {{0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                          {1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 1}};
      
        for(int i=0;i<10;i++){
            for (int x=0;x<10;x++){
                System.out.print(matriz[i][x] + " ");
            }
            System.out.println("");
        }

        int igualCero = 0, colum = 0, fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    igualCero++;
                }
                  
            }
            if (igualCero == 10) {
                fila++;
            }
            igualCero = 0;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[j][i] == 0) {
                    igualCero++;
                }
                    
            }
            if (igualCero == 10) {
                colum++;
            }
            igualCero = 0;
        
            System.out.println(fila);
            System.out.println(colum);
        }  
    }
}
