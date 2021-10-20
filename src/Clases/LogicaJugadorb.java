
package Clases;

import Interfaz.*;

public class LogicaJugadorb {
    
    public static int contador = 0;
    public static boolean[] respuestasc = new boolean[5];
    
    public static void CambiarPersonaje(){
        
        respuestasc[contador] = true;
        Logicatd.imagenes[contador].setVisible(false);
        Tablerob.respuesta.setText("");
        contador++;
        if(contador<5){
            Logicat.respuesta = "Personaje Adivinado, siguiente";
            Logicatd.imagenes[contador].setVisible(true);
            Tablerod.Tpersonaje.setText(Logicatd.Tpersonaje[contador]);
        }else{
            
            Runnable resultado = new Logicar();
            Thread resultados = new Thread(resultado);
            resultados.start();
            Logicar.EnviarResultados();
            Principal.resultados.setVisible(true);
            Principal.tablerod.setVisible(false);
        }
        
    }
    
}
