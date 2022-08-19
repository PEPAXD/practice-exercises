//IMPORTO LIBRERIA
import java.util.Scanner;

public class EJERCICIO_5 {
    public static void main (String []args){

     /*
     Diseñar un algoritmo que realice el promedio de 4 números.
     Los números podran ser decimales y seran ingresados por pantalla por el usuario.

     BEGIN
     Decimal Numero
     Decimal Acumulador=0;
     Decimal Promedio=0;

     For (Int i01, i<=4, i++)
        PRINT: "INGRESE EL NUMERO" + i
        INPUT Numero
        Acumulador += numero
     END FOR
     Promedio = Acumulador/4
     PRINT: "EL PROMEDIO DE LOS NUMEROS INGRESADOS ES: " + Promedio;
     END
      */

        //CREO VARIABLES
        double Numero;
        double Acumulador=0;
        double Promedio=0;

        //USUARIO INGRESA HASTA 4 NUMEROS Y LOS SUMA EN ACUMULADOR
        for (int i=1; i<=4; i++){

            System.out.println("INGRESE NÚMERO ("+i+"): ");
            Scanner Num = new Scanner(System.in);
            Numero=Num.nextDouble();
            Acumulador += Numero;
        }

        //CALCULA EL PROMEDIO DE LOS 4 NUMEROS HE IMPRIME EL RESULTADO
        Promedio = Acumulador/4;
        System.out.println("EL PROMEDIO DE LOS NUMEROS INGRESADOS ES: " + Promedio);
    }
}
