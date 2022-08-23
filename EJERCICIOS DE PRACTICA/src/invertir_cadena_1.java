// Invertir el orden de una cadena
public class invertir_cadena_1 {
    public static void main (String[] args){

        //VARIABLES
        String cadena = "ATOMO";
        StringBuilder cadenaInvertida = new StringBuilder();

        //REVERTIR USING FOR
        for(int i= cadena.length()-1; i>=0; i--)
        {
            cadenaInvertida.append(cadena.charAt(i));
        }

        System.out.println("Original Array:" + cadena);
        System.out.println("Reversed Array:" + cadenaInvertida);

    }
}
