//CONTADOR DE PALABRAS

public class count_words {
    public static void main (String[] args){

        //VARIABLES
        String texto = "Esta cadena tiene 5 palabras";
        int contador = 0;

        String[] arrayText = texto.split(" ");
        contador = arrayText.length;

        System.out.println("NUMERO DE PALABRAS = "+ contador);
    }
}
