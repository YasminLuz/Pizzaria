package Ingredientes;

import Interface.IPizza;

/**
 *
 * @author Yasmin
 */
public class Calabresa extends PizzaDecorator{

    public Calabresa() {
    }

    public Calabresa(IPizza ingrediente) {
        super(ingrediente);
        this.ingrediente = ingrediente;
    }

    @Override
    public void criar() {
      this.ingrediente.criar(); //decora
      System.out.println("Adicionando calabresa...");
    }
    
}
