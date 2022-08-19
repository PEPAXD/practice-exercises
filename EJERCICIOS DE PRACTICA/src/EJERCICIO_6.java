import java.util.Scanner;

public class EJERCICIO_6 {
    public static void main (String []args){

        /* Un pintor sabe que con una pintura determinada puede pintar 3,6 metros cuadrados por cada medio litro.
        Sabiendo la altura y el largo de la pared a pintar, informar cuántos litros de pintura utlizará
        (Altura y Largo en metros).
         */

        //INGRESO VARIABLES
        double AlturaM;
        double LargoM;
        double AreaPared;
        double PinturaNecesaria;

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner AlturaINGRESO = new Scanner(System.in);
        Scanner LargoINGRESO = new Scanner(System.in);

        //SOLICITO AL USUARIO INGRESAR DATOS
        System.out.println("");
        System.out.println ("INGRESE ALTURA PARED: ");
        AlturaM=AlturaINGRESO.nextDouble();

        System.out.println("");
        System.out.println ("INGRESE LARGO PARED: ");
        LargoM=LargoINGRESO.nextDouble();

        //CALCULO AREA PARED
        System.out.println("");
        AreaPared = LargoM * AlturaM;
        System.out.println("EL AREA TOTAL A PINTAR CORRESPONDE A: "+AreaPared+" m2");

        //CALCULO PINTURA NECESARIA
        System.out.println("");
        PinturaNecesaria = ((AreaPared * 500)/3.6);
        System.out.println("LA CANTIDAD DE PINTURA NECESARIA ES: "+PinturaNecesaria+" ml");

    }
}
