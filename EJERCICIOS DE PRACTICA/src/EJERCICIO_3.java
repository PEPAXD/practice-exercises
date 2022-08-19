//IMPORTO LIBRERIA
import java.util.Scanner;

public class EJERCICIO_3 {
    public static void main (String []args)
    {
     /*
        Aplicar un descuento del 10% al monto total de una compra si la forma de pago empleada es de contado.
        El usuario ingresara el monto de la compra realizada y la forma de pago utilizada
        Si es contado, debera aplicar el descuento, sino mostrara un mensaje "DICHA FORMA DE PAGO NO TIENE DESCUENTO".

        BEGIN
        Decimal MontoTotal
        Text FormaDePago
        Decimal MontoConDesc
        PRINT: "INGRESE MONTO TOTAL DE LA COMPRA"
        INPUT: MontoTotal;
        PRINT: "INGRESE FORMA DE PAGO"
        INPUT: FormaDePago;
        IF(FormaDePago == "contado")
            MontoConDesc = MontoTotal * 0,9
            PRINT: "EL MONTO TOTAL CON DESCUENTO APLICADO POR FORMA DE PAGO AL CONTADO, ES DE: " + MontoConDesc + "Pesos"
            ELSE
            PRINT: "LA FORMA DE PAGO INGRESADA NO TIENE DESCUENTO ASOCIADO"
        END IF
        END
      */

        //INGRESO VARIABLES
        Double MontoTotal;
        Double MontoConDesc;
        String FormaDePago;

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner MontoTotalIngresado = new Scanner(System.in);
        Scanner FormaDePagoIngresado = new Scanner(System.in);

        //SOLICITO AL USUARIO INGRESAR DATOS
        System.out.println ("INGRESE MONTO TOTAL DE LA COMPRA");
        MontoTotal=MontoTotalIngresado.nextDouble();

        System.out.println ("EFECTIVO? (Y/N)");
        FormaDePago=FormaDePagoIngresado.next();

        //PREGUNTO TRUE APLICA DESCUENTO

        if (FormaDePago.equals("Y")||FormaDePago.equals("y")) { //equals compara cadenas de texto

            MontoConDesc = MontoTotal * 0.9;
            System.out.println ("EL MONTO TOTAL CON DESCUENTO APLICADO COMO FORMA DE PAGO AL CONTADO, ES DE: ($" + MontoConDesc+")");

        }else {

            System.out.println("LA FORMA DE PAGO INGRESADA NO TIENE DESCUENTO ASOCIADO");
        }
    }
}
