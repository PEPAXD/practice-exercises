import java.util.Scanner;

public class EJERCICIO_10 {
    public static void main (String []args){

        //Leer un número e indicar si este es múltiplo de dos.

        //INGRESO VARIABLES
        int Resto;
        int Numero;

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner NumeroIngresado = new Scanner(System.in);

        //SOLICITO AL USUARIO INGRESAR DATOS
        System.out.println ("\n"+"INGRESE UN NUMERO");
        Numero=NumeroIngresado.nextInt();

        //CALCULO MULTIPLO
        Resto = Numero%2;

        if (Resto==0)
            System.out.println("\n"+"["+ Numero +"]"+" ES MULTIPLO DE 2");
        else
            System.out.println("\n"+"["+ Numero +"]"+" NO ES MULTIPLO DE 2");

    }
}
