import java.util.Scanner;

public class ARRAY_BURBUJA {
    public static void main(String[] args){

        //IMPLEMENTAR ALGORITMO BURBUJA EN JAVA PARA ORDENAR UN ARRAY DE 10 ELEMENTOS ENTEROS DE MENOR A MAYOR

        //CREO ARRAY
        int[] MyArray = new int[10];

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner VariableIngreso = new Scanner(System.in);

        //INGRESO 10 VARIABLES AL ARRAY
        for(int i=0;i<MyArray.length;i++)
        {
            //SOLICITO AL USUARIO INGRESAR DATOS
            System.out.println ("\n"+"INGRESE VARIABLE ["+(i+1)+"]");
            MyArray[i]=VariableIngreso.nextInt();
        }

        // Bubble sort optimizado
        int size = MyArray.length;

        // Ejecutar el bucle dos veces: uno para recorrer el Array  y otro para comparaciones
        for (int i = 0; i < size - 1; i++) {

            // Se genera un registro de los intercambios
            boolean swapped = true;
            for (int j = 0; j < size - i - 1; j++) {

                // Para ordenar en orden descendiente cambiar > por <
                if (MyArray[j] > MyArray[j + 1]) {

                    // Intercambio
                    int temp = MyArray[j];
                    MyArray[j] = MyArray[j + 1];
                    MyArray[j + 1] = temp;

                    swapped = false;
                }
            }

            // Si no ha habido intercambio en la última comparación, entonces el array está ya ordenado.
            if (swapped == true)
                break;
        }

        System.out.println(" ");

        for(int i=0;i<MyArray.length;i++)
        {
            //MUESTRO ARRAY
            System.out.println("["+MyArray[i]+"]");
        }
    }
}