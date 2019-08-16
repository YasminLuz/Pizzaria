package Ingredientes;

import Interface.IPizza;

/**
 *
 * @author Yasmin
 */
public class Queijo extends PizzaDecorator {

    public Queijo() {
    }
    
    public Queijo(IPizza ingrediente) {
        super(ingrediente);
        this.ingrediente = ingrediente;
    }
 
    @Override
    public void criar() {
      this.ingrediente.criar(); //decora
      System.out.println("Adicionando queijo...");
    }
    
}
