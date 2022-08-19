//IMPORTO LIBRERIA
import java.util.Scanner;

public class switch_exercise {
    public static void main (String []args) {

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner NumeroIngresado = new Scanner(System.in);
        int NumeroAlmacenado;

        //INGRESE UN NUMERO DEL 1 al 12
        System.out.println ("Por favor introduzca una valor numerico entre 1 y 12:");
        NumeroAlmacenado=NumeroIngresado.nextInt();

        //SWITCH CASE NUMERO INGRESADO CORRESPONDE AL...
        switch (NumeroAlmacenado)
        {
            case 1: System.out.println("ENERO"); break;
            case 2: System.out.println("FEBRERO"); break;
            case 3: System.out.println("MARZO"); break;
            case 4: System.out.println("ABRIL"); break;
            case 5: System.out.println("MAYO"); break;
            case 6: System.out.println("JUNIO"); break;
            case 7: System.out.println("JULIO"); break;
            case 8: System.out.println("AGOSTO"); break;
            case 9: System.out.println("SEPTIEMBRE"); break;
            case 10: System.out.println("OCTUBRE"); break;
            case 11: System.out.println("NOVIEMBRE"); break;
            case 12: System.out.println("DICIEMBRE"); break;
            default: System.out.println("NO EXISTE TAL MES");
        }

    }
}

