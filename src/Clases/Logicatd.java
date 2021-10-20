
package Clases;

import Acciones.*;
import Interfaz.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Logicatd {
    
    public static String pregunta, respuesta;
    public static JLabel[] imagenes = new JLabel[5];
    public static String[] Tpersonaje = new String[5];
    public static JLabel imagena;
    
    public static void CrearImagenes(JPanel panel){
        imagenes[0] = Boton.CrearBoton("0.2.6", 142, 226, 500, 300, panel);
        imagenes[1] = Boton.CrearBoton("0.2.7", 142, 226, 500, 300, panel);
        imagenes[1].setVisible(false);
        imagenes[2] = Boton.CrearBoton("0.2.8", 142, 226, 500, 300, panel);
        imagenes[2].setVisible(false);
        imagenes[3] = Boton.CrearBoton("0.2.9", 142, 226, 500, 300, panel);
        imagenes[3].setVisible(false);
        imagenes[4] = Boton.CrearBoton("0.2.10", 142, 226, 500, 300, panel);
        imagenes[4].setVisible(false);
    }
    
    public static void CrearTPersonaje(){
        Tpersonaje[0] = "Una silla";
        Tablerod.Tpersonaje.setText(Tpersonaje[0]);
        Tpersonaje[1] = "Galletas";
        Tpersonaje[2] = "Picachu";
        Tpersonaje[3] = "El mundo";
        Tpersonaje[4] = "Jenga";
    }
    
}
