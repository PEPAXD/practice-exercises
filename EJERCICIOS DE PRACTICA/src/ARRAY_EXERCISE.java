public class ARRAY_EXERCISE {
    public static void main (String []args){

        /*Crear un ciclo for que calcule y muestre el promedio de un array de elementos enteros*/

        //Declaro Array
        int[] MyArray = {2,4,6,8,10,12,14,16,18,20};    //PROMEDIO = 11

        //Declaro Sumatoria
        int SumaTotal=0;
        int Promedio;

        //CALCULAR PROMEDIO
        for(int i=0; i< MyArray.length; i++)
        {
            SumaTotal += MyArray[i];

            if( i+1 == MyArray.length)
            {
                Promedio = SumaTotal / MyArray.length;
                System.out.println("");
                System.out.println("LA SUMA DE LOS VALORES ALOJADOS DIVIDO POR LA MISMA CANTIDAD DE ELEMENTOS DA COMO RESULTADO EL PROMEDIO: "+"("+Promedio+")");
            }
        }
    }
}
