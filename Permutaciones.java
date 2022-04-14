public class Permutaciones {
    /*
    palabra = "abc"
    acumulado = ""
    ch = a
    restoLetras = bc
    permutacion("bc", "a")

    ch = b
    restoLetras = ac
    permutacion("ac", "b")

    ch = c
    restoLetras = ab
    permutacion("ab", "c") ->PEND

    permutacion("bc", "a")
    palabra = bc
    acumulado = a
    ch = b
    restoLetras = c
    permutacion(c, ab) ->PEND

    ch = c
    restoLetras = b
    permutacion(b, ac) ->PEND


    permutacion(c, ab)
    palabra = c
    acumulado = ab
    ch = c
    restoLetras = ""
    permutacion("", abc)

    permutacion("", abc)
    palabra = ""
    acumulado = abc
    --->abc

    permutacion("ac", "b")
    palabra = ac
    acumulado = b
    ch = a
    restoLetras = c
    permutacion(c, ba)

    ch = c
    restoLetras = a
    permutacion(a, bc) ->PEND

    permutacion(c, ba)
    palabra = c
    acumulado = ba
    ch = c
    restoLetras = ""
    permutacion("", bac)

    permutacion("", bac)
    palabra = ""
    acumulado = bac
    --->bac

    permutacion(a, bc)
    palabra = a
    acumulado = bc
    ch = a
    restoLetras = ""
    permutacion("", bca)

    permutacion("", bca)
    palabra = ""
    acumulado = bca
    ----->bca

     */
    public static void permutacion( String palabra, String acumulado ){
        if( palabra.length() == 0 ){
            System.out.println( acumulado );
        }
        else{
            for( int i = 0; i < palabra.length(); i ++ ){
                System.out.println("CICLO "+palabra+" RONDA:"+i);
                char ch = palabra.charAt( i );
                System.out.println("Ch:" +ch);
                String restoLetras = palabra.substring( 0, i ) + palabra.substring( i + 1 ); 
                System.out.println("Resto:"+restoLetras);
                permutacion( restoLetras, acumulado + ch ); 
            }
        }
    }

    /*Crea una función que en base a un string te regrese todas las permutaciones
    Ej: abc
    permutaciones:
    abc
    acb
    bac
    bca
    cab
    cba
     */
    public static void main( String args [] ){
        String palabra = "abc";
        permutacion( palabra, "" );
    }
}