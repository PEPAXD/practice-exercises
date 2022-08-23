//BUSCAR EN UN TEXTO LA CANTIDAD DE VECES QUE SE REPITE UN CARACTER
public class contar_repeticion {
    public static void main (String[] args){

        // VARIABLES
        String sTexto = "lorem ipsum is simply dummy text of the printing and typesetting industry.";
        String sTextoBuscado = "i";
        int contador = 0;

        //BUSCAR Y CONTAR
        while (sTexto.contains(sTextoBuscado)) {

            sTexto = sTexto.substring(sTexto.indexOf(sTextoBuscado) + sTextoBuscado.length());

            contador++;

        }

        System.out.println (contador);
    }
}
