//REALIZAR UN PROGRAMA QUE COMPRUEBE SI UNA CADENA DE TEXTO CONTIENE UNA SUBCADENA. 
//LAS DOS CADENAS SE INTRODUCEN POR TECLADO

//LIBRERIAS
import java.util.Scanner;

public class string_contains_a_substring {
    public static void main(String[] args) {

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner textUsuario = new Scanner(System.in);
        Scanner subTextUsuario = new Scanner(System.in);

        //SOLICITO AL USUARIO INGRESAR DATOS
        System.out.println ("INGRESE UN TEXTO");
        String text=textUsuario.nextLine();
        System.out.println ("INGRESE UNA PALABRA QUE DESEA BUSCAR");
        String subText=subTextUsuario.next();

        //SEARCH SUBSTRING IN A STRING
        if (text.contains(subText)) {
            System.out.println("La cadena original contiene la subcadena ---> " + subText);
        } else {
            System.out.println("No contiene la subcadena ---> " + subText);
        }
    }
}