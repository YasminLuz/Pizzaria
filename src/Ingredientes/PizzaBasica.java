package Ingredientes;



import Interface.IPizza;


/**
 *
 * @author Yasmin
 */
public class PizzaBasica implements IPizza{

    protected IPizza preferencia;

    public PizzaBasica() {
    }
    
    public PizzaBasica(IPizza pedido) {
        this.preferencia = pedido;
    }

    @Override
    public void criar() {
        System.out.println("Adicionando massa...");
        System.out.println("Adicionando tempero...");
        System.out.println("Adicionando molho...");
    }
    
}
