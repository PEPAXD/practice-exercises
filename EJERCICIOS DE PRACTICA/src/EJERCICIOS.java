//IMPORTO LIBRERIA
import java.util.Scanner;

public class EJERCICIOS {
    public static void main (String []args)
    {
        //INDICAR SI UN NUMERO ES PAR O IMPAR

        /*ALGORITMO NUMERO PAR
            Entero numero
            Escribir "Ingrese un numero"
            Leer numero
            Si numero MOD 2 == 0 Entonces
                Escribir numero, "es par"
            SiNo
                Escribir numero, "no es par"
            FinSi
         */

        //INGRESO VARIABLES
        int residuo;
        int NumeroAlmacenado;

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner NumeroIngresado = new Scanner(System.in);

        //INGRESE UN NUMERO
        System.out.println ("INGRESE UN NUMERO");
        NumeroAlmacenado=NumeroIngresado.nextInt();

        //DEVUELVE EL VALOR INGRESADO
        System.out.println (("EL NUMERO INGRESADO ES: ")+NumeroAlmacenado);

        //RESIDUO DE LA DIVISION MEDIANTE OPERADOR MODULO
        residuo = NumeroAlmacenado % 2;

        //PREGUNTA PAR/IMPAR?
        if(residuo == 0)
        {
            System.out.println ("("+NumeroAlmacenado+" ES PAR)");
        }else
        {
            System.out.println ("("+NumeroAlmacenado+" ES IMPAR)");
        }
    }
}
