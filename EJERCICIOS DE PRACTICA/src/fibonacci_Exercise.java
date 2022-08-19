public class fibonacci_Exercise {
    public static void main (String []args)
    {
        /*Mostrar los primeros 10 numeros de la secuencia fibonacci*/

        //Ingreso variables
        int Numero1=0;
        int Numero2=1;
        int NumeroResultado;

        System.out.println(""); //SALTAR UN ESPACIO

        //Mostrar 10 numeros
        for(int i=1; i<=10; i++ )
        {
            //Operacion fibonacci
            // NR = N1 + N2.
            NumeroResultado = Numero1+Numero2;

            //Mostrar resultados
            System.out.println("CICLO"+"("+i+") --> "+Numero1+"+"+Numero2+" = "+NumeroResultado);

            //MODIFICO N1, N2
            Numero2 = Numero1 + Numero2;
            Numero1 = Numero2 - Numero1;
        }
    }
}
