public class EJERCICIO_15 {
    public static void main(String[] args) {

        //Leer cincuenta números e indicar la can.dad de valores mayores que diez.

        //INGRESO VARIABLES
        int Min = 1;
        int Max = 21;
        int Contador = 0;
        double RandomNumber = 0;


        //CREO ARRAY
        double[] MyArray = new double[50];

        //AÑADO NUMEROS AL ARRAY
        for (int i = 0; i < MyArray.length; i++) {
            RandomNumber = Math.random() * (Max - Min) + Min;
            MyArray[i] = RandomNumber;

            if (MyArray[i] > 10)
                Contador++;
        }

        System.out.println("\n"+"LA CANTIDAD DE NUMEROS MAYORES A 10 PERTENECIENTES AL ARRAY [MyArray[50]] SON: [" + Contador + "]");

    }
}



