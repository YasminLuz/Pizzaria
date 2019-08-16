package Ingredientes;

import Interface.IPizza;

/**
 *
 * @author Yasmin
 */
public class Frango extends PizzaDecorator{
    
    public Frango() {
    }
    
    public Frango(IPizza ingrediente) {
        super(ingrediente);
        this.ingrediente = ingrediente;
    }

    @Override
    public void criar() {
       this.ingrediente.criar(); //decora
      System.out.println("Adicionando frango...");
    }
    
}
