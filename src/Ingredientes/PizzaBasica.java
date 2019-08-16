package Ingredientes;



import Ingredientes.PizzaDecorator;
import Interface.IPizza;


/**
 *
 * @author Yasmin
 */
public class PizzaBasica implements IPizza{

    private IPizza preferencia;
    
    public PizzaBasica(IPizza pedido) {
        this.preferencia = pedido;
    }

    @Override
    public void criar() {
        System.out.println("Adicionando massa...");
        System.out.println("Adicionando mussarela...");
        System.out.println("Adicionando molho...");
    }
    
}
