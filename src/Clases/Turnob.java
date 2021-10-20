
package Clases;

import Interfaz.*;
import static java.lang.Thread.sleep;

public class Turnob implements Runnable {

    @Override
    public void run() {
        
        Principal.tablerod.setVisible(true);
        Principal.tableroc.setVisible(false);
        
        do{
           
            try {
                    
                sleep(100000);
                    
            } catch (InterruptedException ex) {
                
            }
                
            LogicaJugadorb.CambiarPersonaje();
                
        }while(LogicaJugadorb.contador <5);
    }
    
    
}