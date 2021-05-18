
/**
 * Write a description of class Consumidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Consumidor extends Thread
{
    // instance variables - replace the example below with your own
    private Almacen dato;
    
    /**
     * Constructor for objects of class Consumidor
     */
    public Consumidor(Almacen d)
    {
        // initialise instance variables
        dato = d;
    }

    public void run()
    {
        int num;
        for(int i = 0; i <= 10; ++i) {
            try {
                sleep( (int)  Math.random() * 500 );
            } catch (InterruptedException e) { 
                e.printStackTrace();
            }
            num = dato.getValor();
            System.out.println("Se extrajo del almacén el valor " + num);
            
        }
    }
}
