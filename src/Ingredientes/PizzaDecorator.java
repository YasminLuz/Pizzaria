package Ingredientes;

import Interface.IPizza;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasmin
 */
public abstract class PizzaDecorator implements IPizza{

    protected IPizza ingrediente; 
    
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
