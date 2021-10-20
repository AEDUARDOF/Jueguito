
package Clases;

import Interfaz.*;
import static java.lang.Thread.sleep;

public class Turno implements Runnable {

    @Override
    public void run() {
        
        Principal.tablero.setVisible(true);
        
        do{
           
            try {
                    
                sleep(100000);
                    
            } catch (InterruptedException ex) {
                
            }
                
            Logicajugador.CambiarPersonaje();
                
        }while(Logicajugador.contador <5);
        
    }
    
    
}
