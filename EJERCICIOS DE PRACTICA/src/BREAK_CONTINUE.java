public class BREAK_CONTINUE {

        public static void main (String []args){
            for(int i=1;i<=10;i++)
            {
                if (i%2 != 0)       //OPERACION MODULO
                {
                    continue;       //Interrumpe 1 ciclo si el resto del modulo da como resultado un numero impar
                }
                System.out.println(i);
            }

            for(int i=1; i<=10;i++)
            {
                if(i==6)
                {
                    break;          //Rompe el ciclo despues del break, Consume menos recursos
                }
                System.out.println(i);
            }
        }
}

