public class Array {
    public static void main(String[] args) {

        //INICIALIZO ARRAY
        int[] MyArray = new int[10];
        int[] MyArray2 = {1, 2, 3, 4, 5};
        int[] MyArray3 = {5, 10, 15, 20, 25};


        MyArray[0] = 1;
        MyArray[1] = 2;
        MyArray[2] = 3;

        System.out.println(MyArray[0]);

        System.out.println(MyArray.length);     //CANTIDAD DE ELEMENTOS QUE TIENE EL ARRAY

        System.out.println(MyArray2[4]);

        for(int i=0; i<MyArray3.length; i++)
        {
            System.out.println(MyArray3[i]);
        }

    }
}