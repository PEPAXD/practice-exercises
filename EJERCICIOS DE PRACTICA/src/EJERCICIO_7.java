import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

        /*
        Dadas dos variables numéricas A y B, que el usuario debe teclear,
        realizar un algoritmo que intercambie los valores de ambas variables
        y muestre cuánto valen al final las dos variables (recuerda la asignación)
        */

public class EJERCICIO_7
{
    public static void main(String[] args)
    {
        //INGRESO VARIABLES
        int VariableA;
        int VariableB;

        //CREO ARRAY
        ArrayList<Integer> MyArray = new ArrayList<Integer>();

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner VariableAIngreso = new Scanner(System.in);
        Scanner VariableBIngreso = new Scanner(System.in);

        //SOLICITO AL USUARIO INGRESAR DATOS
        System.out.println ("\n"+"INGRESE VARIABLE A: ");
        VariableA=VariableAIngreso.nextInt();

        System.out.println ("\n"+"INGRESE VARIABLE B: ");
        VariableB=VariableBIngreso.nextInt();

        //AÑADO VALORES INGRESADOS AL ARRAY
        MyArray.add(VariableA);
        MyArray.add(VariableB);

        //MUESTRO VALORES INGRESADOS
        System.out.println("\n"+"MyArray : " + MyArray);

        //INTERCAMBIO VALORES INGRESADOS
        Collections.swap(MyArray, 0, 1);

        //MUESTRO LOS VALORES INTERCAMBIADOS
        System.out.println("MyArraySwap() : " + MyArray);

    }
}