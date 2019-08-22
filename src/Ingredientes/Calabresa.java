package Ingredientes;

import Interface.IPizza;

/**
 *
 * @author Yasmin
 */
public class Calabresa extends PizzaDecorator{

    public Calabresa(IPizza ingrediente) {
        super(ingrediente);
        this.ingrediente = ingrediente;
    }

    public Calabresa() {
    }

    @Override
    public void criar() {
      ingrediente.criar(); //decora
      System.out.println("Adicionando calabresa...");
    }
    
}
