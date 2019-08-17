package Ingredientes;

import Interface.IPizza;

/**
 *
 * @author Yasmin
 */
public class Presunto extends PizzaDecorator{

    public Presunto(IPizza ingrediente) {
        super(ingrediente);
        this.ingrediente = ingrediente;
    }

    @Override
    public void criar() {
      ingrediente.criar(); //decora
      System.out.println("Adicionando presunto...");
    }
    
}
