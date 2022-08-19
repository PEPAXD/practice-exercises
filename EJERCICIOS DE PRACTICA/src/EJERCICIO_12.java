import java.util.Scanner;

public class EJERCICIO_12 {
    public static void main(String[] args){

            /*Dado un número entero positivo menor que cien, leerlo desde teclado, indicar si es primo.
    (Los números primos son aquellos que sólo son divisibles por sí mismos y por uno.
    - En el caso del ejemplo, por ser el número leído menor que cien, sólo hay que comprobar
    que el número no sea 2 - 3 - 5 - 7 o múltiple de alguno de estos.
    Si se cumple esta condición, se trata entonces de un número primo.
     */

        //INGRESO VARIABLES
        int Numero;
        int RestoA=0;

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner NumeroIngresado = new Scanner(System.in);

        //SOLICITO AL USUARIO INGRESAR DATOS
        System.out.println ("\n"+"INGRESE UN NUMERO ENTRE 0 y 100");
        Numero=NumeroIngresado.nextInt();

        if(Numero<0||Numero>100)
        {
            System.out.println ("\n"+"EL NUMERO INGRESADO NO CORRESPONDE, INGRESE OTRO NUMERO");
            Numero=NumeroIngresado.nextInt();
        }

        //CALCULO NUMERO PRIMO
        for(int i=1; i<=Numero; i++)
        {
            if (Numero%i == 0)
                RestoA++;
        }

        if (RestoA!=2)
            System.out.println("\n"+"["+ Numero +"]"+" NO ES UN NUMERO PRIMO");
        else
            System.out.println("\n"+"["+ Numero +"]"+" ES UN NUMERO PRIMO");

    }
}
