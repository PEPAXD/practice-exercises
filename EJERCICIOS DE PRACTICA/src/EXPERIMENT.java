
import java.util.*;

public class EXPERIMENT
{
    public static void main ( String[] args )
    {
        Scanner entrada=new Scanner(System.in);

        System.out.print("primer numero ");
        int primero=entrada.nextInt();

        System.out.print("segundos numero ");
        int segundo=entrada.nextInt();

        if(primero<segundo)
        {
            for(int i=primero;i<=segundo;i++)
            {
                System.out.print(i+"\n");
            }
        }else{
            System.out.print("El primer numero tiene que ser inferior al segundo\n");
        }
    }
}
