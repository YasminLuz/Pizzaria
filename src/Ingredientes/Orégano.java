package Ingredientes;

import Interface.IPizza;

/**
 *
 * @author Yasmin
 */
public class Orégano extends PizzaDecorator{
  
    public Orégano(IPizza ingrediente) {
        super(ingrediente);
//        this.ingrediente = ingrediente;
    }

    public Orégano() {
    }

    @Override
    public void criar() {
       ingrediente.criar();
       System.out.println("Adicionando orégano...");
    }
    
}
