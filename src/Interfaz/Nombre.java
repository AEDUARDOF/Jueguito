//De Jesus Pacheco Yahir
package Interfaz;

import Acciones.Boton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Nombre extends JFrame{
    
    public static JTextArea nombre;
     
    public Nombre (){
        
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
        
        
        
        nombre = new JTextArea();
        nombre.setFont(new Font("Default", Font.PLAIN, 50));
        nombre.setBounds(422, 381, 436, 60);
        nombre.setForeground(Color.decode("#B84592"));
        nombre.setOpaque(false);
        panel.add(nombre);
        
        JLabel BContinuar = Boton.CrearBoton("1.1.1", 490, 578, 301, 70, panel);
        
        JLabel BContinuarb = Boton.CrearBoton("1.1.2", 490, 578, 301, 70, panel);
        BContinuarb.setVisible(false);
        
        JLabel BContinuarc = Boton.CrearBoton("1.1.3", 490, 578, 301, 70, panel);
        BContinuarc.setVisible(false);
            
        JLabel Fondo = Boton.CrearBoton("1.0.0", 0, 0, 1280, 720, panel);
        
        Boton.Boton(BContinuar, BContinuarb, BContinuarc, "BContinuar", panel);
        
    }
    
}