package Ingredientes;

import Interface.IPizza;

/**
 *
 * @author Yasmin
 */
public class Queijo extends PizzaDecorator {

    public Queijo(IPizza ingrediente) {
        super(ingrediente);
        this.ingrediente = ingrediente;
    }

    public Queijo() {
    }
 
    @Override
    public void criar() {
      ingrediente.criar(); //decora
      System.out.println("Adicionando queijo...");
    }
    
}
