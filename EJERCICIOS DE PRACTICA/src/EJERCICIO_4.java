//IMPORTO LIBRERIA
import java.util.Scanner;

public class EJERCICIO_4 {
    public static void main (String []args){

        /*
            Mostrar tabla muñltiplicar empezando x1 del numero ingresado por el usuario
            El usuario debera ingresar el valor maximo que la tabla de multiplicar mostrarar

            BEGIN
            Integer TablaNum;
            Integer TablaHasta;
            Integer Contador=1;
            Integer Multiplicacion;
            PRINT "Ingrese el numero del cual desea conocer la tabla de multiplicacion:"
            INPUT: TablaHasta;
            WHILE (Contador <= TablaHasta)
                Multiplicacion = TablaNum*Contador;
                PRINT: TablaNum + "*" + Contador + "=" + multiplicacion
                Contador++
            END WHILE
            END
        */

        //INGRESO VARIABLES
        int TablaNumAlmacenado;
        int TablaHastaAlmacenado;
        int InicioTabla =1;
        int Multiplicacion;

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner TablaNumIngresado = new Scanner(System.in);
        Scanner TablaHastaIngresado = new Scanner(System.in);

        //SOLICITO AL USUARIO VARIABLES
        System.out.println("INGRESE EL NÚMERO DEL CUAL DESEA CONOCER SU TABLA DE MULTIPLICACION: ");
        TablaNumAlmacenado=TablaNumIngresado.nextInt();

        System.out.println("INGRESE EL VALOR MAXIMO DE LA TABLA MULTIPLICADORA: ");
        TablaHastaAlmacenado=TablaHastaIngresado.nextInt();

        //TABLA MULTIPLICACION
        while (InicioTabla <= TablaHastaAlmacenado)
        {
            Multiplicacion = TablaNumAlmacenado*InicioTabla;
            System.out.println(TablaNumAlmacenado+"*"+InicioTabla+"= "+Multiplicacion);
            InicioTabla++;
        }
    }
}
