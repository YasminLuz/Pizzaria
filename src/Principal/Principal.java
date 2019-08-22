package Principal;

import Ingredientes.Calabresa;
import Ingredientes.Frango;
import Ingredientes.Orégano;
import Ingredientes.PizzaBasica;
import Ingredientes.PizzaDecorator;
import Ingredientes.Presunto;
import Ingredientes.Queijo;
import Interface.IPizza;
import java.util.ArrayList;

/**
 *
 * @author Yasmin
 */
public class Principal {
    
    
    public static void main(String[] args){

    }
    
    public void pedido(int tamanho, ArrayList listaIngredientes) {
        IPizza pedido = new PizzaBasica();
        PizzaDecorator decora = new PizzaDecorator(pedido);
        
  
        for (int i = 0; i < tamanho; i++) {
//                classe = Class.forName("Ingredientes." + listaIngredientes.get(i).toString());
//                IPizza o = (IPizza) classe.newInstance();
         
            if (listaIngredientes.get(i) == "Calabresa") 
                decora = new Calabresa(pedido);
            else if (listaIngredientes.get(i) == "Frango") 
                decora = new Frango(pedido);
            else if (listaIngredientes.get(i) == "Orégano") 
                decora = new Orégano(pedido);
            else if (listaIngredientes.get(i) == "Queijo") 
                decora = new Queijo(pedido);
            else if (listaIngredientes.get(i) == "Presunto") 
                decora = new Presunto(pedido);
           
            pedido = decora;
            
        }
        decora.criar();
   
    }
}
