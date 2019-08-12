package Ingredientes;

import Interface.IPizza;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasmin
 */
public class Calabresa extends PizzaDecorator{

    public Calabresa() {
    }

    public Calabresa(IPizza ingrediente) {
        super(ingrediente);
        this.ingrediente = ingrediente;
    }

    @Override
    public void criar2() {
      this.ingrediente.criar2(); //decora
      JOptionPane.showMessageDialog(null, "Adicionando calabresa...");
    }

    @Override
    public PizzaDecorator criar() {
        return new Calabresa(); //To change body of generated methods, choose Tools | Templates.
    }

 
     
}
