/*
    Alatorre Fuentes Edudardo
    De Jesus Pacheco Yahir
*/
package Acciones;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Boton {
    
    public static void Boton(JLabel Boton, JLabel Botonb, JLabel Botonc, String nombre, JPanel panel){
        
        MouseListener EventoMouse = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Boton.setVisible(true);
                Botonb.setVisible(false);
                Botonc.setVisible(false);
                AccionesBoton.AccionesBoton(nombre, panel);
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

                Boton.setVisible(false);
                Botonb.setVisible(false);
                Botonc.setVisible(true);
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {}
            
            @Override
            public void mouseEntered(MouseEvent e) {

                Boton.setVisible(false);
                Botonb.setVisible(true);
                Botonc.setVisible(false);
                
                Boton.setCursor(new Cursor(HAND_CURSOR));
                Botonb.setCursor(new Cursor(HAND_CURSOR));
                Botonc.setCursor(new Cursor(HAND_CURSOR));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {

                Boton.setVisible(true);
                Botonb.setVisible(false);
                Botonc.setVisible(false);
                
            }
        };
        
        Boton.addMouseListener(EventoMouse);
        Botonb.addMouseListener(EventoMouse);
        Botonc.addMouseListener(EventoMouse);
        
    }
    
    public static JLabel CrearBoton(String nombref, int coordenadax, int coordenaday, int ancho, int alto, JPanel panel){
        
        String archivo;
        archivo = "src/Images/"+nombref+".png";
        
        JLabel boton = new JLabel(new ImageIcon(archivo));
        boton.setBounds(coordenadax, coordenaday, ancho, alto);
        panel.add(boton);
        
        return boton;
    }
    
    public static JLabel CrearFoto(String nombref, int coordenadax, int coordenaday, int ancho, int alto, JPanel panel){
        
        String archivo;
        archivo = "src/Images/"+nombref+".jpg";
        
        JLabel foto = new JLabel(new ImageIcon(archivo));
        foto.setBounds(coordenadax, coordenaday, ancho, alto);
        panel.add(foto);
        
        return foto;
    }
    
    public static JLabel CrearTexto(String text, int coordenadax, int coordenaday, int ancho, int alto, JPanel panel){
        
        JLabel texto = new JLabel(text);
        texto.setBounds(coordenadax, coordenaday, ancho, alto);
        texto.setForeground(Color.DARK_GRAY);
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        texto.setFont(new Font("arial", Font.PLAIN,20));
        panel.add(texto);
        
        return texto;
    }
    
    public static JLabel CrearPOracion(String text, int coordenadax, int coordenaday, int ancho, int alto, JPanel panel){
        
        JLabel texto = new JLabel(text);
        texto.setBounds(coordenadax, coordenaday, ancho, alto);
        texto.setForeground(Color.BLUE);
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        texto.setFont(new Font("arial", Font.PLAIN,30));
        panel.add(texto);
        
        return texto;
    }
    
    public static JLabel CrearSAOI(String text, int coordenadax, int coordenaday, int ancho, int alto, JPanel panel){
        
        JLabel texto = new JLabel(text);
        texto.setBounds(coordenadax, coordenaday, ancho, alto);
        texto.setForeground(Color.MAGENTA);
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        texto.setFont(new Font("arial", Font.PLAIN,30));
        panel.add(texto);
        
        return texto;
    }
    
    public static JLabel CrearPuntuacion(int punto, int tota, int coordenadax, int coordenaday, int ancho, int alto, JPanel panel){
        
        String text = punto + "/" + tota;
        
        JLabel texto = new JLabel(text);
        texto.setBounds(coordenadax, coordenaday, ancho, alto);
        texto.setForeground(Color.BLUE);
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        texto.setFont(new Font("arial", Font.PLAIN,80));
        panel.add(texto);
        
        return texto;
    }
    
    public static JLabel CrearRespuesta(String text, int coordenadax, int coordenaday, int ancho, int alto, JPanel panel){
        
        
        JLabel texto = new JLabel(text);
        texto.setBounds(coordenadax, coordenaday, ancho, alto);
        texto.setForeground(Color.BLUE);
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        texto.setFont(new Font("arial", Font.PLAIN,22));
        panel.add(texto);
        
        return texto;
    }
    
}