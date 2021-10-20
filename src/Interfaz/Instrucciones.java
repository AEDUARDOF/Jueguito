//De Jesus Pacheco Yahir

package Interfaz;

import Acciones.Boton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Instrucciones extends JFrame{
     
    public Instrucciones (){
        
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
        
        
        
        JLabel BJugar = Boton.CrearBoton("2.1.1", 490, 578, 301, 70, panel);
        
        JLabel BJugarb = Boton.CrearBoton("2.1.2", 490, 578, 301, 70, panel);
        BJugarb.setVisible(false);
        
        JLabel BJugarc = Boton.CrearBoton("2.1.3", 490, 578, 301, 70, panel);
        BJugarc.setVisible(false);
            
        JLabel Fondo = Boton.CrearBoton("2.0.0", 0, 0, 1280, 720, panel);
        
        Boton.Boton(BJugar, BJugarb, BJugarc, "BJugar", panel);
        
    }
    
}