import java.util.Scanner;

public class EJERCICIO_13 {
    public static void main(String[] args){

        //Se leen el sueldo básico y la categoría de un empleado.
        // Para calcular el sueldo neto se efectúan los siguientes descuentos:
        // Categoría 1: 30% Categoría 2: 25% Categoría 3: 25% Categoría 4: 10% Para otras Categorías no hay descuentos.
        // Imprimir el sueldo neto básico y Categoría.-

        //INGRESO VARIABLES
        int NumeroCategoria;

        double SueldoNetoBasico=0;
        double SueldoBasico;

        double PorcentajeResta=0;
        double Porcentaje;

        double Categoria1 = 30;
        double Categoria2 = 25;
        double Categoria3 = 25;
        double Categoria4 = 10;
        double Categoria5 = 0;

        //DECLARO VARIABLES (CREO OBJETO SCANNER)
        Scanner SueldoBasicoIngresado = new Scanner(System.in);

        Scanner CategoriaIngresada = new Scanner(System.in);

        //SOLICITO AL USUARIO INGRESAR DATOS
        System.out.println ("\n"+"INGRESE SU SUELDO BASICO");
        SueldoBasico=SueldoBasicoIngresado.nextDouble();

        System.out.println ("\n"+"INGRESE EL NUMERO DE SU CATEGORIA [1,2,3,4] DE NO CONTAR CON UNA CATEGORIA INGRESE [5]");
        NumeroCategoria=CategoriaIngresada.nextInt();

        switch (NumeroCategoria)
        {
            case 1: Porcentaje = Categoria1; break;
            case 2: Porcentaje = Categoria2; break;
            case 3: Porcentaje = Categoria3; break;
            case 4: Porcentaje = Categoria4; break;

            default: Porcentaje = Categoria5; break;
        }

        //CALCULAR PORCENTAJE
        if(Porcentaje!=0){
            PorcentajeResta = (Porcentaje/100) * SueldoBasico;
            SueldoNetoBasico = SueldoBasico-PorcentajeResta;
        }else
            SueldoNetoBasico = SueldoBasico;

        //IMPRIMO RESULTADOS
        System.out.println("\n"+"SU SUELDO BASICO CORRESPONDE A: $"+SueldoBasico );

        if (NumeroCategoria>=1 && NumeroCategoria<=4){

            System.out.println("DADO QUE PERTENECE A LA CATEGORIA: ["+NumeroCategoria+"] SE LE APLICARA UN IMPUESTO DEL [%"+Porcentaje+"] CORRESPONDIENTE A: [-"+PorcentajeResta+"]");
            System.out.println("POR LO TANTO SU SUELDO NETO BASICO CORRESPONDE A: $"+SueldoNetoBasico);

        } else
        {
            System.out.println("DADO QUE NO PERTENECE A NINGUNA CATEGORIA NO SE LE APLICARAN IMPUESTOS");
            System.out.println("POR LO TANTO SU SUELDO NETO BASICO CORRESPONDE A: $"+SueldoNetoBasico);
        }
    }
}
