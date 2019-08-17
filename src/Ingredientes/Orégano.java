package Ingredientes;

import Interface.IPizza;

/**
 *
 * @author Yasmin
 */
public class Orégano extends PizzaDecorator{
  
    public Orégano(IPizza ingrediente) {
//        super(ingrediente);
        this.ingrediente = ingrediente;
    }

    @Override
    public void criar() {
       this.ingrediente.criar();
       System.out.println("Adicionando orégano...");
    }
    
}
