
package Clases;

import Interfaz.Tablero;
import Interfaz.Tableroc;

public class Logicajugador {
    
    public static int contador = 0;
    public static boolean[] respuestasc = new boolean[5];
    
    public static void CambiarPersonaje(){
        
        
        respuestasc[contador] = true;
        Logicat.imagenes[contador].setVisible(false);
        contador++;
        if(contador<5){
            Logicat.imagenes[contador].setVisible(true);
            Tablero.Tpersonaje.setText(Logicat.Tpersonaje[contador]);
        }else{
            Controlador.CambiarTablero();
        }
        
    }
    
}
