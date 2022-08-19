import java.util.Scanner;

public class EJERCICIO_8 {
    public static void main(String[] args){

        /* Ingresar como dato el perímetro de un cuadrado.
        Calcular e imprimir el volumen del cubo que tiene como lado el cuadrado antes mencionado. (V=a3).
         */

        //INGRESO VARIABLES
        double LadoCuadrado;
        double PerimetroCuadrado;
        double VolumenCuadrado;

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner PerimetroCuadradoIngreso = new Scanner(System.in);

        //SOLICITO AL USUARIO INGRESAR DATOS
        System.out.println ("\n"+"INGRESE EL PERIMETRO DEL CUADRADO: ");
        PerimetroCuadrado=PerimetroCuadradoIngreso.nextInt();

        //CALCULO PERIMETRO (X = Y*4)
        LadoCuadrado = PerimetroCuadrado/4;

        //CALCULO VOLUMEN
        VolumenCuadrado = Math.pow(LadoCuadrado, 3);

        //IMPRIMO VOLUMEN
        System.out.println("\n"+"EL VOLUMEN DEL CUBO ES: "+VolumenCuadrado);

    }
}
