/*EJERCICIO IFELSE

Crear un algoritmo que le permita al usuario ingresar un numero (1 al 12) y mostrarle al usuario el mes que corresponde
1 = enero
2 = febrero
3 = marzo
etc...

PISTA

USAR IF ELSE
INVESTIGAR COMO INGRESAR UN VALOR

*/

//IMPORTO LIBRERIA
import java.util.Scanner;

public class EJERCICIO_IFELSE {
    public static void main (String []args) {

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner NumeroIngresado = new Scanner(System.in);
        int NumeroAlmacenado;

        //INGRESE UN NUMERO DEL 1 al 12
        System.out.println ("Por favor introduzca una valor numerico entre 1 y 12:");
        NumeroAlmacenado=NumeroIngresado.nextInt();

        //DEVUELVE EL VALOR INGRESADO
        System.out.println (("EL NUMERO INGRESADO ES: ")+NumeroAlmacenado);

        //CHEQUEA EL NUMERO
        if(NumeroAlmacenado >12 || NumeroAlmacenado<1){
            System.out.println ("Y ES INCORRECTO VUELVA A INGRESAR UN VALOR");
            NumeroAlmacenado=NumeroIngresado.nextInt();
            System.out.println (("EL NUMERO INGRESADO ES: ")+NumeroAlmacenado);
        }

        //IF ELSE NUMERO INGRESADO CORRESPONDE AL...
        if(NumeroAlmacenado == 1) {
            System.out.println("EL VALOR CORRESPONDE AL MES ENERO");
        }else if(NumeroAlmacenado == 2){
            System.out.println("EL VALOR CORRESPONDE AL MES FEBRERO");
        }else if(NumeroAlmacenado == 3){
            System.out.println("EL VALOR CORRESPONDE AL MES MARZO");
        }else if(NumeroAlmacenado == 4){
            System.out.println("EL VALOR CORRESPONDE AL MES ABRIL");
        }else if(NumeroAlmacenado == 5){
            System.out.println("EL VALOR CORRESPONDE AL MES MAYO");
        }else if(NumeroAlmacenado == 6){
            System.out.println("EL VALOR CORRESPONDE AL MES JUNIO");
        }else if(NumeroAlmacenado == 7){
            System.out.println("EL VALOR CORRESPONDE AL MES JULIO");
        }else if(NumeroAlmacenado == 8){
            System.out.println("EL VALOR CORRESPONDE AL MES AGOSTO");
        }else if(NumeroAlmacenado == 9){
            System.out.println("EL VALOR CORRESPONDE AL MES SEPTIEMBRE");
        }else if(NumeroAlmacenado == 10){
            System.out.println("EL VALOR CORRESPONDE AL MES OCTUBRE");
        }else if(NumeroAlmacenado == 11){
            System.out.println("EL VALOR CORRESPONDE AL MES NOVIEMBRE");
        }else if(NumeroAlmacenado == 12){
            System.out.println("EL VALOR CORRESPONDE AL MES DICIEMBRE");
        }
    }
}

