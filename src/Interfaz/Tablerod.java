//De Jesus Pacheco Yahir
package Interfaz;

import Acciones.*;
import Clases.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Tablerod extends JFrame{
    
    public static JLabel pregunta;
    public static JLabel Tpersonaje;
    public static JLabel nombre;
    public static JLabel nombreb;
    public static JLabel nombrec;
     
    public Tablerod (){
        
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setTitle("¿Qué soy?");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        Elementos();
        
    }
    
    public void Elementos(){
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
            
        Membrete.Membrete(panel);
        
        
        
        String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        
        Logicatd.CrearImagenes(panel);
        
        
        
        nombre = new JLabel();
        nombre.setHorizontalAlignment(SwingConstants.CENTER);
        nombre.setVerticalAlignment(SwingConstants.CENTER);
        nombre.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
        nombre.setBounds(115, 40, 219, 61);
        nombre.setForeground(Color.decode("#003666"));
        nombre.setOpaque(false);
        panel.add(nombre);
        
        
        
        nombreb = new JLabel();
        nombreb.setHorizontalAlignment(SwingConstants.CENTER);
        nombreb.setVerticalAlignment(SwingConstants.CENTER);
        nombreb.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        nombreb.setBounds(758, 121, 113, 19);
        nombreb.setForeground(Color.decode("#B84592"));
        nombreb.setOpaque(false);
        panel.add(nombreb);
        
        
        
        nombrec = new JLabel();
        nombrec.setHorizontalAlignment(SwingConstants.CENTER);
        nombrec.setVerticalAlignment(SwingConstants.CENTER);
        nombrec.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        nombrec.setBounds(758, 411, 113, 19);
        nombrec.setForeground(Color.decode("#003666"));
        nombrec.setOpaque(false);
        panel.add(nombrec);
        
        
        
        pregunta = new JLabel();
        pregunta.setHorizontalAlignment(SwingConstants.CENTER);
        pregunta.setVerticalAlignment(SwingConstants.CENTER);
        pregunta.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        pregunta.setBounds(742, 528, 377, 56);
        pregunta.setForeground(Color.decode("#3369E7"));
        pregunta.setOpaque(false);
        panel.add(pregunta);
        
        
        
        Tpersonaje = new JLabel();
        Tpersonaje.setHorizontalAlignment(SwingConstants.CENTER);
        Tpersonaje.setVerticalAlignment(SwingConstants.CENTER);
        Tpersonaje.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
        Tpersonaje.setBounds(204, 546, 377, 30);
        Tpersonaje.setForeground(Color.decode("#3369E7"));
        Tpersonaje.setOpaque(false);
        panel.add(Tpersonaje);
        
        
        Logicatd.CrearTPersonaje();
        
        JLabel BSi = Boton.CrearBoton("3.5.1", 830, 156, 200, 46, panel);
        
        JLabel BSib = Boton.CrearBoton("3.5.2", 830, 156, 200, 46, panel);
        BSib.setVisible(false);
        
        JLabel BSic = Boton.CrearBoton("3.5.3", 830, 156, 200, 46, panel);
        BSic.setVisible(false);
        
        JLabel BNo = Boton.CrearBoton("3.6.1", 830, 213, 200, 46, panel);
        
        JLabel BNob = Boton.CrearBoton("3.6.2", 830, 213, 200, 46, panel);
        BNob.setVisible(false);
        
        JLabel BNoc = Boton.CrearBoton("3.6.3", 830, 213, 200, 46, panel);
        BNoc.setVisible(false);
        
        JLabel BNose = Boton.CrearBoton("3.7.1", 830, 270, 200, 46, panel);
        
        JLabel BNoseb = Boton.CrearBoton("3.7.2", 830, 270, 200, 46, panel);
        BNoseb.setVisible(false);
        
        JLabel BNosec = Boton.CrearBoton("3.7.3", 830, 270, 200, 46, panel);
        BNosec.setVisible(false);
        
        JLabel BAdivinado = Boton.CrearBoton("3.8.1", 830, 326, 200, 46, panel);
        
        JLabel BAdivinadob = Boton.CrearBoton("3.8.2", 830, 326, 200, 46, panel);
        BAdivinadob.setVisible(false);
        
        JLabel BAdivinadoc = Boton.CrearBoton("3.8.3", 830, 326, 200, 46, panel);
        BAdivinadoc.setVisible(false);
            
        JLabel Fondo = Boton.CrearBoton("4.0.1", 0, 0, 1280, 720, panel);
        
        Boton.Boton(BSi, BSib, BSic, "BSib", panel);
        Boton.Boton(BNo, BNob, BNoc, "BNob", panel);
        Boton.Boton(BNose, BNoseb, BNosec, "BNoseb", panel);
        Boton.Boton(BAdivinado, BAdivinadob, BAdivinadoc, "BAdivinadob", panel);
        
    }
    
}