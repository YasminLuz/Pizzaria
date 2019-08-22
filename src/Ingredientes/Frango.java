package Ingredientes;

import Interface.IPizza;

/**
 *
 * @author Yasmin
 */
public class Frango extends PizzaDecorator{

    public Frango(IPizza ingrediente) {
        super(ingrediente);
//        this.ingrediente = ingrediente;
    }

    public Frango() {
    }

    @Override
    public void criar() {
       ingrediente.criar(); //decora
      System.out.println("Adicionando frango...");
    }
    
}
