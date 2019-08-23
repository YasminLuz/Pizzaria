package Ingredientes;

import Interface.IPizza;

/**
 *
 * @author Yasmin
 */
public class Presunto extends PizzaDecorator{

    public Presunto(IPizza ingrediente) {
        super(ingrediente);
//        this.ingrediente = ingrediente;
    }

    public Presunto() {
    }

    @Override
    public void criar() {
      super.criar(); //decora
      System.out.println("Adicionando presunto...");
    }
    
}
