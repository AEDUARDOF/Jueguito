
package Clases;

import Acciones.*;
import Interfaz.Tablero;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Logicat {
    
    public static String pregunta, respuesta;
    public static JLabel[] imagenes = new JLabel[5];
    public static String[] Tpersonaje = new String[5];
    public static JLabel imagena;
    
    public static void CrearImagenes(JPanel panel){
        imagenes[0] = Boton.CrearBoton("0.2.1", 142, 226, 500, 300, panel);
        imagenes[1] = Boton.CrearBoton("0.2.2", 142, 226, 500, 300, panel);
        imagenes[1].setVisible(false);
        imagenes[2] = Boton.CrearBoton("0.2.3", 142, 226, 500, 300, panel);
        imagenes[2].setVisible(false);
        imagenes[3] = Boton.CrearBoton("0.2.4", 142, 226, 500, 300, panel);
        imagenes[3].setVisible(false);
        imagenes[4] = Boton.CrearBoton("0.2.5", 142, 226, 500, 300, panel);
        imagenes[4].setVisible(false);
    }
    
    public static void CrearTPersonaje(){
        Tpersonaje[0] = "Rosalia";
        Tablero.Tpersonaje.setText(Tpersonaje[0]);
        Tpersonaje[1] = "Cancerbero";
        Tpersonaje[2] = "Bach";
        Tpersonaje[3] = "Lucifer";
        Tpersonaje[4] = "Dionisio";
    }
    
}
