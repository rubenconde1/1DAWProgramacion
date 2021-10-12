public class prueba {
    public static void main(String[] args) {
        int i = 0;
bucleext:

while ( i < 100){
i ++;
for ( int j = 0; j < i; j++) {
if ( i == 5) { break bucleext;}
System.out.print( "*" );
}
System.out.println( "" );
}
}
}
    }
}
