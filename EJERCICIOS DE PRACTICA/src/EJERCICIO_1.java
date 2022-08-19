public class EJERCICIO_1 {
    public static void main (String []args){

        /*Si un lote de terreno tiene X metros de frente por Y metros de fondo:
        calcular e imprimir la cantidad de metros de alambre para cercarlo
        (X e Y serán leídos al comenzar el programa).
         */

        //INGRESO VARIABLES:
        double XFrente = 6.8;
        double YFondo = 17.5;
        double Alambre;

        //CALCULO PERIMETRO ---> 2(h+b);
        Alambre = 2*(XFrente+YFondo);
        System.out.println("LA CANTIDAD DE METROS DE ALAMBRE NECESARIOS PARA CERCAR EL TERRENO ES IGUAL A: ("+Alambre+")");

    }
}
