package pizzaria;

import Ingredientes.PizzaDecorator;
import Interface.IPizza;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasmin
 */
public class Pizzaria implements IPizza{

    public Pizzaria() {
        
    }

    @Override
    public PizzaDecorator criar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void criar2() {
        JOptionPane.showMessageDialog(null, "Adicionando massa...");
        JOptionPane.showMessageDialog(null, "Adicionando queijo...");
        JOptionPane.showMessageDialog(null, "Adicionando molho...");
    }
    
}
