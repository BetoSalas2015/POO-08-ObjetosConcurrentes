
/**
 * Write a description of class Productor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Productor extends Thread
{
    // instance variables - replace the example below with your own
    private Almacen dato;

    /**
     * Constructor for objects of class Productor
     */
    public Productor(Almacen d)
    {
        // initialise instance variables
        dato = d;
    }
    
    public void run()
    {
        for(int i = 0; i <= 10; ++i) {
            dato.setValor(i);
            System.out.println("Se guardó en el almacén el valor " + i);
            try {
                sleep( (int)  Math.random() * 500 );
            } catch (InterruptedException e) { 
                e.printStackTrace();
            }
        }
        
    }


}







