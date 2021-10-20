/*
    Alatorre Fuentes Edudardo
    De Jesus Pacheco Yahir
*/
package Interfaz;

import Acciones.Boton;
import java.awt.Toolkit;
import javax.swing.*;

public class Inicial extends JFrame{
     
    public Inicial (){
        
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setTitle("¿Qué soy?");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        Elementos();
        
    }
    
    public void Elementos(){
        
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/icono.png")));
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
            
        Membrete.Membrete(panel);
        
        JLabel BIniciar = Boton.CrearBoton("0.1.1", 490, 578, 301, 70, panel);
        
        JLabel BIniciarb = Boton.CrearBoton("0.1.2", 490, 578, 301, 70, panel);
        BIniciarb.setVisible(false);
        
        JLabel BIniciarc = Boton.CrearBoton("0.1.3", 490, 578, 301, 70, panel);
        BIniciarc.setVisible(false);
            
        JLabel Fondo = Boton.CrearBoton("0.0.0", 0, 0, 1280, 720, panel);
        
        Boton.Boton(BIniciar, BIniciarb, BIniciarc, "BIniciar", panel);
        
    }
    
} 