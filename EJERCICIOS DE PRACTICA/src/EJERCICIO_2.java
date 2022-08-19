public class EJERCICIO_2 {
    public static void main (String []args){

     /*Realizar algoritmo que lea dos números,
     calculando y escribiendo el valor de su suma, resta, producto y división.
      */

        //DECLARO VARIABLES:
        float NumeroA= 4;
        float NumeroB= 7;
        float SUMA;
        float RESTA;
        float PRODUCTO;
        float DIVISION;

        //SUMA:
        SUMA = NumeroA+NumeroB;
        System.out.println("("+NumeroA+" + "+NumeroB+") = "+SUMA);

        //RESTA:
        RESTA = NumeroA-NumeroB;
        System.out.println("("+NumeroA+" - "+NumeroB+") = "+RESTA);

        //PRODUCTO:
        PRODUCTO = NumeroA*NumeroB;
        System.out.println("("+NumeroA+" * "+NumeroB+") = "+PRODUCTO);

        //DIVISION:
        DIVISION = NumeroA/NumeroB;
        System.out.println("("+NumeroA+" / "+NumeroB+") = "+DIVISION);
    }
}