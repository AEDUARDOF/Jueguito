
package Clases;

import Interfaz.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logican implements Runnable{
    
    public static String nombre;
    public static String nombreb;
    public static int pocision;
    public static Socket socket;
    public static Socket socketb;
    public static ServerSocket servidor;
    public static ServerSocket servidorb;
    
    public static void EnviarNombre(){
        
        try {
            
            socket = new Socket("192.168.1.64", 3000);
            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
            salida.writeUTF(nombre);
            salida.writeBoolean(Controlador.jugadora);
            salida.writeBoolean(Controlador.jugadorb);
            salida.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public static void RecibirNombre(){
            
            try {
                
                servidor = new ServerSocket(9999);
                socketb = servidor.accept();
                DataInputStream entrada = new DataInputStream(socketb.getInputStream());
                nombreb = entrada.readUTF();
                Controlador.jugadora = entrada.readBoolean();
                Controlador.jugadorb = entrada.readBoolean();
                EstablecerNombres();
                socketb.close();
            } catch (IOException ex) {
                Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    public static void EstablecerNombres(){
        Tablero.nombre.setText(nombreb);
        Tablero.nombreb.setText(nombreb);
        Tablero.nombrec.setText(nombre);
        Tablerob.nombre.setText(nombreb);
        Tablerob.nombreb.setText(nombreb);
        Tablerob.nombrec.setText(nombre);
        Tableroc.nombre.setText(nombreb);
        Tableroc.nombreb.setText(nombre);
        Tableroc.nombrec.setText(nombreb);
        Tablerod.nombre.setText(nombreb);
        Tablerod.nombreb.setText(nombre);
        Tablerod.nombrec.setText(nombreb);
    }

    @Override
    public void run() {
        
        RecibirNombre();
        
    }
    
}
