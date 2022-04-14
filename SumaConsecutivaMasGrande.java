/*

Crea una función que te regrese la sumatoria de los números que se encuentran
de manera ascendiente
EJ: { 4, 6, -6, 7, 1, -2 }
Sumaríamos: 4+6+7


 */
   
public class SumaConsecutivaMasGrande {
    /*
    numeros = { 4, 6, -6, 7, 1, -2 }
    aux = 4
    suma = 0

    i = 0
    numeros[0] = 4
    suma += 4 -> suma = 4
    aux = 4

    i = 1
    numeros[1] = 6
    suma += 6 -> suma = 10
    aux = 6

    i = 2
    numeros[2] = -6

    i = 3
    numeros[3] = 7
    suma += 7 -> suma = 17
    aux = 7

    i = 4
    numeros[4] = 1

    i = 5
    numeros[5] = -2

    --->17
    
     */
    public static int sumaConsecutiva( int numeros [] ){

        int aux = numeros[0];
        int suma = 0;

        for( int i = 0; i < numeros.length; i ++ ){
           
            if(aux <= numeros[i]){
                suma += numeros[i];
                aux = numeros[i];
            }

        }

        return suma;
    }
    public static void main( String args [] ){
        int numeros [] = { 4, 6, -6, 2, 1, -2 };

        System.out.println( sumaConsecutiva( numeros ) );
    }
}