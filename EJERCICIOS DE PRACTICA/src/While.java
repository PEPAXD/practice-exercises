public class While {
    public static void main (String []args)
    {
        int x = 1;
        int y = 1;

        System.out.println("");

        //Incrementa (x+1) 10 veces
        while (x<=10)
        {
            System.out.println(((x)+("+1 = "))+x);
            x++;
        }

        System.out.println("");

        //Incrementa (y2) 10 veces
        while (y<=10)
        {
            System.out.println(((y)+("*")+(y)+("= "))+((y)*(y)));
            y++;
        }
    }
}
