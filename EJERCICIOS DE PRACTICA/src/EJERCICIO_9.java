import java.util.ArrayList;
import java.util.Scanner;

public class EJERCICIO_9 {
    public static void main(String[] args){

        /*Ingresar por teclado los precios correspondientes a cinco articulos y las cantidades vendidas de cada uno de ellos.
         Calcular e imprimir el importe total de ventas de cada uno y un importe total de lo vendido.
         */

        //DECLARO VARIABLES
        float VentasArticulos;
        float VentasTotales = 0;

        //CREO ARRAY
        ArrayList<String> ListaArticulos = new ArrayList<String>();
        ArrayList<Float> ListaPrecios = new ArrayList<Float>();
        ArrayList<Float> CantidadVendida = new ArrayList<Float>();

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner ArticulosIngreso = new Scanner(System.in);
        Scanner PrecioIngreso = new Scanner(System.in);
        Scanner CantidadVendidaIngreso = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            //SOLICITO AL USUARIO INGRESAR DATOS
            System.out.println("\n" + "INGRESE ARTICULO (" + i + ")");
            ListaArticulos.add(ArticulosIngreso.next());

            System.out.println("\n" + "INGRESE EL PRECIO CORRESPONDIENTE A: " +"["+ListaArticulos.get(i-1)+"]");
            ListaPrecios.add(PrecioIngreso.nextFloat());

            System.out.println("\n" + "INGRESE LA CANTIDAD VENDIDA DE: " +"["+ListaArticulos.get(i-1)+"]");
            CantidadVendida.add(CantidadVendidaIngreso.nextFloat());

        }

        //CALCULO IMPORTE TOTAL DE VENTAS DE CADA ARTICULO
        for (int i = 1; i <= 5; i++) {

            VentasArticulos = ListaPrecios.get(i-1)*CantidadVendida.get(i-1);
            System.out.println("\n"+"IMPORTE TOTAL DE VENTAS DE: "+"["+ListaArticulos.get(i-1)+"] = $"+ VentasArticulos);

            //SUMA TOTAL DE VENTAS
            VentasTotales += VentasArticulos;

        }

        //IMPRIMO TOTAL VENDIDO
        System.out.println("\n"+"IMPORTE TOTAL DE VENTAS = $" + VentasTotales);

    }
}
