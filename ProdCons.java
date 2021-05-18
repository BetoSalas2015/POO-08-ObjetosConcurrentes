
/**
 * Write a description of class ProdCons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProdCons
{
    // instance variables - replace the example below with your own
    private Almacen almacen;
    private Productor productor;
    private Consumidor consumidor;

    /**
     * Constructor for objects of class ProdCons
     */
    public ProdCons()
    {
        // initialise instance variables
        almacen = new Almacen();
        productor = new Productor(almacen);
        consumidor = new Consumidor(almacen);
        
        productor.start();
        consumidor.start();
        
    }

   
}
