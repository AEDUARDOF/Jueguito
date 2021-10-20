//De Jesus Pacheco Yahir
package Interfaz;

import Acciones.Boton;
import Clases.Logicar;
import static Interfaz.Nombre.nombre;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Resultados extends JFrame{
    
    public static JLabel nombre;
    public static JLabel nombreb;
    public static JLabel palabra;
    public static JLabel palabrab;
    public static JLabel palabrac;
    public static JLabel palabrad;
    public static JLabel palabrae;
    public static JLabel palabraB;
    public static JLabel palabraBb;
    public static JLabel palabraBc;
    public static JLabel palabraBd;
    public static JLabel palabraBe;
     
    public Resultados (){
        
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
        
        
        
        nombre = new JLabel();
        nombre.setHorizontalAlignment(SwingConstants.CENTER);
        nombre.setVerticalAlignment(SwingConstants.CENTER);
        nombre.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        nombre.setBounds(366, 183, 188, 30);
        nombre.setForeground(Color.decode("#003666"));
        nombre.setOpaque(false);
        panel.add(nombre);
        
        
        
        nombreb = new JLabel();
        nombreb.setHorizontalAlignment(SwingConstants.CENTER);
        nombreb.setVerticalAlignment(SwingConstants.CENTER);
        nombreb.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        nombreb.setBounds(726, 183, 188, 30);
        nombreb.setForeground(Color.decode("#B84592"));
        nombreb.setOpaque(false);
        panel.add(nombreb);
        
        
        
        palabra = new JLabel();
        palabra.setFont(new Font("Default", Font.PLAIN, 25));
        palabra.setBounds(366, 253, 188, 30);
        palabra.setOpaque(false);
        panel.add(palabra);
        
        
        
        palabrab = new JLabel();
        palabrab.setFont(new Font("Default", Font.PLAIN, 25));
        palabrab.setBounds(366, 299, 188, 30);
        palabrab.setOpaque(false);
        panel.add(palabrab);
        
        
        
        palabrac = new JLabel();
        palabrac.setFont(new Font("Default", Font.PLAIN, 25));
        palabrac.setBounds(366, 345, 188, 30);
        palabrac.setOpaque(false);
        panel.add(palabrac);
        
        
        
        palabrad = new JLabel();
        palabrad.setFont(new Font("Default", Font.PLAIN, 25));
        palabrad.setBounds(366, 391, 188, 30);
        palabrad.setOpaque(false);
        panel.add(palabrad);
        
        
        
        palabrae = new JLabel();
        palabrae.setFont(new Font("Default", Font.PLAIN, 25));
        palabrae.setBounds(366, 437, 188, 30);
        palabrae.setOpaque(false);
        panel.add(palabrae);
        
        
        
        palabraB = new JLabel();
        palabraB.setFont(new Font("Default", Font.PLAIN, 25));
        palabraB.setBounds(727, 253, 188, 30);
        palabraB.setOpaque(false);
        panel.add(palabraB);
        
        
        
        palabraBb = new JLabel();
        palabraBb.setFont(new Font("Default", Font.PLAIN, 25));
        palabraBb.setBounds(727, 299, 188, 30);
        palabraBb.setOpaque(false);
        panel.add(palabraBb);
        
        
        
        palabraBc = new JLabel();
        palabraBc.setFont(new Font("Default", Font.PLAIN, 25));
        palabraBc.setBounds(727, 345, 188, 30);
        palabraBc.setOpaque(false);
        panel.add(palabraBc);
        
        
        
        palabraBd = new JLabel();
        palabraBd.setFont(new Font("Default", Font.PLAIN, 25));
        palabraBd.setBounds(727, 391, 188, 30);
        palabraBd.setOpaque(false);
        panel.add(palabraBd);
        
        
        
        palabraBe = new JLabel();
        palabraBe.setFont(new Font("Default", Font.PLAIN, 25));
        palabraBe.setBounds(727, 437, 188, 30);
        palabraBe.setOpaque(false);
        panel.add(palabraBe);
        
        
        
        Logicar.CrearTPersonaje();
        
        JLabel BJugarDeNuevo = Boton.CrearBoton("5.1.1", 320, 615, 301, 70, panel);
        
        JLabel BJugarDeNuevob = Boton.CrearBoton("5.1.2", 320, 615, 301, 70, panel);
        BJugarDeNuevob.setVisible(false);
        
        JLabel BJugarDeNuevoc = Boton.CrearBoton("5.1.3", 320, 615, 301, 70, panel);
        BJugarDeNuevoc.setVisible(false);
        
        JLabel BTerminar = Boton.CrearBoton("5.2.1", 680, 615, 301, 70, panel);
        
        JLabel BTerminarb = Boton.CrearBoton("5.2.2", 680, 615, 301, 70, panel);
        BTerminarb.setVisible(false);
        
        JLabel BTerminarc = Boton.CrearBoton("5.2.3", 680, 615, 301, 70, panel);
        BTerminarc.setVisible(false);
            
        JLabel Fondo = Boton.CrearBoton("5.0.0", 0, 0, 1280, 720, panel);
        
        Boton.Boton(BJugarDeNuevo, BJugarDeNuevob, BJugarDeNuevoc, "BJugarDeNuevo", panel);
        Boton.Boton(BTerminar, BTerminarb, BTerminarc, "BTerminar", panel);
        
    }
    
} 