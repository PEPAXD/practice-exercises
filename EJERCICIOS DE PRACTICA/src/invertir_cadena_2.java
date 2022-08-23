//INVERTIR EL ORDEN DE UN ARRAY

//LIBRERIAS
import java.util.Arrays;
import java.util.Collections;

public class invertir_cadena_2 {
    public static void main (String[] args){

        //VARIABLES
        String [] cadena = {"A", "T", "O", "M", "O"};

        System.out.println("Original Array:" + Arrays.asList(cadena));

        //LLAMO A FUNCION REVERSE
        reverse(cadena);
    }

    static void reverse(String myArray[])
    {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
    }
}
