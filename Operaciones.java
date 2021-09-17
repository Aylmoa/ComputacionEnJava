//Leonardo Damián González Lugo #2735364
public class Operaciones {
       
    public static void main(String[] args){
        //Primero inicializo los valores iniciales
        double x=100,y=4.2;
        //Inicializo el metodo que tiene el resultado de las operaciones
        calculo(x,y);
        
    }
    public static void calculo(double x, double y){
        //En el metodo no guardo los resultados en variables ya que no se van a usar en otro lado
        System.out.println("---Muestra de operaciones---");
        System.out.println("X= "+x);
        System.out.println("Y= "+y);
        System.out.println("Suma= "+(x+y));
        System.out.println("Resta= "+(x-y));
        System.out.println("Multiplicación= "+(x*y));
        System.out.println("Divición= "+(x/y));
        System.out.println("Modulo= "+(int)(x%y));
    }

}
