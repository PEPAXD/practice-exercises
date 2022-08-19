import java.util.Scanner;

public class EJERCICIO_11 {
    public static void main(String[] args)
    {
        //Leer un número e indicar si es divisible por tres.

        //INGRESO VARIABLES
        int Resto;
        int Numero;

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner NumeroIngresado = new Scanner(System.in);

        //SOLICITO AL USUARIO INGRESAR DATOS
        System.out.println ("\n"+"INGRESE UN NUMERO");
        Numero=NumeroIngresado.nextInt();

        //CALCULO MULTIPLO
        Resto = Numero%3;

        if (Resto==0)
            System.out.println("\n"+"["+ Numero +"]"+" ES DIVISIBLE POR 3");
        else
            System.out.println("\n"+"["+ Numero +"]"+" NO ES DIVISIBLE POR 3");

    }
}
