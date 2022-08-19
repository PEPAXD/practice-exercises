public class EJERCICIO_14 {
    public static void main(String[] args){

        //Leer una serie de 15 números enteros, informar mediante un mensaje cuántos son mayores que 100.

        //INGRESO VARIABLES
        int[] MyArray = {15,30,45,50,65,123,453,234,765,123,12,45,897,123,345};
        int Tamaño=0;

        //PREGUNTO X>100?
        for(int i=0;i< MyArray.length;i++)
        {
            if(MyArray[i]>100)
                Tamaño++;
        }

        System.out.println("\n"+"EN TOTAL ["+Tamaño+"] NUMEROS DEL ARRAY SON MAYORES A 100");
    }
}
