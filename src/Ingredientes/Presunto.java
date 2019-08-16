package Ingredientes;

import Interface.IPizza;

/**
 *
 * @author Yasmin
 */
public class Presunto extends PizzaDecorator{

    public Presunto() {
    }
    
    public Presunto(IPizza ingrediente) {
        super(ingrediente);
        this.ingrediente = ingrediente;
    }

    @Override
    public void criar() {
       this.ingrediente.criar(); //decora
      System.out.println("Adicionando presunto...");
    }
    
}
