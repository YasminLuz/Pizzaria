package Ingredientes;

import Interface.IPizza;
import javax.swing.JOptionPane;

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
    public PizzaDecorator criar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void criar2() {
       this.ingrediente.criar2(); //decora
      JOptionPane.showMessageDialog(null, "Adicionando presunto...");
    }
    
}
