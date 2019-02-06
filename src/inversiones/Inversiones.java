
package inversiones;

/**
 *
 * @author Estudiante
 */

public class Inversiones {
    
    public Inversiones(){
        int x = 10;
        try{
            this.divisionCero();
        }catch(ArithmeticException e){
            throw new ArithmeticException();//throw lanza excepcion
        }
    }
    
    public void divisionCero(){
    int c=0;
    String x = null;
    for(int i=0;i<10;i++)
        //saber donde poner el try catch
        try{
            c=5/i;
            x.lenght();
            System.out.println("Punto control 1");
        }catch(ArithmeticException e){
            throw new ArithmeticException();
        }catch(NullPointerException e){
            throw new NullPointerException();
        }finally{//deja todo en el estado en el que estaba
            //...
        }
        System.out.println("Punto control 2");
    }
    
    public static void main(String[] args) {
        try{
            Inversiones inv = new Inversiones();
        }catch(ArithmeticException e){
            System.out.println("Division por cero");
        }
    }
}
