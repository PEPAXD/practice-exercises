public class DO_WHILE {
    public static void main (String []args)
    {
        int x=0;

        System.out.println("");

        do {
            System.out.println("PRIMERO EJECUTA, LUEGO PREGUNTA");
        } while (x>10);

        System.out.println("");

        do {
            System.out.println(("Estamos dentro de un DoWhile *")+(x+1));
            x++;
        } while (x<10);
    }
}
