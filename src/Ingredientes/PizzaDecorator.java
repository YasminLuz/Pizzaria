package Ingredientes;

import Interface.IPizza;

/**
 *
 * @author Yasmin
 */
public abstract class PizzaDecorator implements IPizza{

    protected static IPizza ingrediente; 
    
    public PizzaDecorator() {

    }

    public PizzaDecorator(IPizza ingrediente) {
        this.ingrediente = ingrediente;
    }
  
    @Override
    public void criar() {
        this.ingrediente.criar();
    }
  
    
}
