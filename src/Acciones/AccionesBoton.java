/*
    Alatorre Fuentes Edudardo
    De Jesus Pacheco Yahir
*/
package Acciones;

//import Clases.*;
import Clases.*;
import Interfaz.*;
import java.awt.Frame;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AccionesBoton {
    
    private static boolean inscripcion = false;
    private static boolean FWindows = false;

    public static void AccionesBoton(String nombre, JPanel panel){
        
        switch(nombre){
            
            case "BMinimizar" :
                Principal.inicial.setState(Frame.ICONIFIED);
                Principal.instrucciones.setState(Frame.ICONIFIED);
                Principal.nombre.setState(Frame.ICONIFIED);
                Principal.resultados.setState(Frame.ICONIFIED);
                Principal.tablero.setState(Frame.ICONIFIED);
                Principal.tablerob.setState(Frame.ICONIFIED);
                Principal.tableroc.setState(Frame.ICONIFIED);
                Principal.tablerod.setState(Frame.ICONIFIED);
            break;
            
            case "BCerrar" :
                System.exit(0);
            break;
            
            case "BIniciar" :
                Runnable cnombr = new Logican();
                Thread cnombre = new Thread(cnombr);
                cnombre.start();
                Principal.nombre.setVisible(true);
                Principal.inicial.setVisible(false);
            break;
            
            case "BContinuar" :
                Controlador.AsignarJugador();
                Principal.instrucciones.setVisible(true);
                Principal.nombre.setVisible(false);
            break;
            
            case "BJugar" :
                Controlador.AsignarTablero();
                Principal.instrucciones.setVisible(false);
            break;
            
            case "BSi" :
                Logicat.respuesta = "Sí";
                Comunicacion.EnviarRespuesta();
            break;
            
            case "BNo" :
                Logicat.respuesta = "No";
                Comunicacion.EnviarRespuesta();
            break;
            
            case "BNose" :
                Logicat.respuesta = "No sé";
                Comunicacion.EnviarRespuesta();
            break;
            
            case "BAdivinado" :
                LogicaJugadorb.respuestasc[LogicaJugadorb.contador] = true;
                Logicat.respuesta = "Personaje adivinado, siguiente";
                Comunicacion.EnviarRespuesta();
                Logicajugador.CambiarPersonaje();
            break;
            
            case "BEnviar" :
                Comunicacionb.EnviarPregunta();
            break;
            
            case "BEnviarb" :
                Comunicacionc.EnviarPregunta();
            break;
            
            case "BSib" :
                Logicatd.respuesta = "Sí";
                Comunicaciond.EnviarRespuesta();
            break;
            
            case "BNob" :
                Logicatd.respuesta = "No";
                Comunicaciond.EnviarRespuesta();
            break;
            
            case "BNoseb" :
                Logicatd.respuesta = "No sé";
                Comunicaciond.EnviarRespuesta();
            break;
            
            case "BAdivinadob" :
                Logicajugador.respuestasc[Logicajugador.contador] = true;
                Logicatd.respuesta = "Personaje adivinado, siguiente";
                Comunicaciond.EnviarRespuesta();
                LogicaJugadorb.CambiarPersonaje();
            break;
            
            case "BJugarDeNuevo" :
                Logicat.imagenes[4].setVisible(false);
                Logicat.imagenes[0].setVisible(true);
                Logicatd.imagenes[4].setVisible(false);
                Logicatd.imagenes[0].setVisible(true);
                Logicajugador.contador = 0;
                LogicaJugadorb.contador = 0;
                Principal.tablero.setVisible(true);
                Principal.resultados.setVisible(false);
            break;
            
            case "BTerminar" :
                Principal.inicial.setVisible(true);
                Principal.resultados.setVisible(false);
            break;
            
        }
        
    }
    
}