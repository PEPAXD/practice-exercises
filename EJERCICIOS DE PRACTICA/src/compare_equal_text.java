//comparar 2 cadenas y contar diferencias
public class compare_equal_text {
    public static void main (String[] args){

        //VARIABLES
        String text1 = "patitosw";
        String text2 = "paratosa";

        int number=0;

        //STRING TO ARRAY
        char[] ch_text1 = text1.toCharArray();
        char[] ch_text2 = text2.toCharArray();

        for (int i=0; i<ch_text1.length; i++) {

            if(ch_text1[i] != ch_text2[i]){
                number++;
            }
        }

        System.out.println(number);

    }
}
