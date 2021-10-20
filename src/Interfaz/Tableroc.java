//De Jesus Pacheco Yahir
package Interfaz;

import Acciones.Boton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Tableroc extends JFrame{
    
    public static JLabel respuesta;
    public static JTextArea pregunta;
    public static JLabel nombre;
    public static JLabel nombreb;
    public static JLabel nombrec;
    public static JLabel Tpersonaje;
     
    public Tableroc (){
        
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
        
        
        
        JLabel foto = Boton.CrearBoton("0.2.11", 142, 226, 500, 300, panel);
        
       
        
        JLabel BEnviar = Boton.CrearBoton("3.10.1", 830, 276, 200, 47, panel);
        
        JLabel BEnviarb = Boton.CrearBoton("3.10.2", 830, 276, 200, 47, panel);
        BEnviarb.setVisible(false);
        
        JLabel BEnviarc = Boton.CrearBoton("3.10.3", 830, 276, 200, 47, panel);
        BEnviarc.setVisible(false);
        
        
        
        nombre = new JLabel();
        nombre.setHorizontalAlignment(SwingConstants.CENTER);
        nombre.setVerticalAlignment(SwingConstants.CENTER);
        nombre.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
        nombre.setBounds(731, 40, 219, 61);
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
        
        
        
        pregunta = new JTextArea();
        pregunta.setFont(new Font("Default", Font.PLAIN, 20));
        pregunta.setBounds(800, 216, 261, 30);
        pregunta.setForeground(Color.decode("#B84592"));
        pregunta.setOpaque(false);
        panel.add(pregunta);
        
        
        
        respuesta = new JLabel();
        respuesta.setHorizontalAlignment(SwingConstants.CENTER);
        respuesta.setVerticalAlignment(SwingConstants.CENTER);
        respuesta.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        respuesta.setBounds(742, 528, 377, 56);
        respuesta.setForeground(Color.decode("#3369E7"));
        respuesta.setOpaque(false);
        panel.add(respuesta);
        
        
        
        Tpersonaje = new JLabel();
        Tpersonaje.setText("???");
        Tpersonaje.setHorizontalAlignment(SwingConstants.CENTER);
        Tpersonaje.setVerticalAlignment(SwingConstants.CENTER);
        Tpersonaje.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
        Tpersonaje.setBounds(204, 546, 377, 30);
        Tpersonaje.setForeground(Color.decode("#B84592"));
        Tpersonaje.setOpaque(false);
        panel.add(Tpersonaje);
            
        JLabel Fondo = Boton.CrearBoton("3.0.1", 0, 0, 1280, 720, panel);
        Boton.Boton(BEnviar, BEnviarb, BEnviarc, "BEnviarb", panel);
        
    }
    
}