
package Clases;

import Interfaz.Tablero;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Comunicacion implements Runnable{
    
    public static Socket socket;
    public static Socket socketb;
    public static ServerSocket servidor;
    public static ServerSocket servidorb;
    
    public static void EnviarRespuesta(){
        
        try {
            socket = new Socket("192.168.1.64", 8080);
            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
            salida.writeInt(Logicajugador.contador);
            salida.writeUTF(Logicat.respuesta);
            salida.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            
            servidor = new ServerSocket(47678);
            while(true){
                
                socketb = servidor.accept();
                DataInputStream entrada = new DataInputStream(socketb.getInputStream());
                Logicat.pregunta = entrada.readUTF();
                Tablero.pregunta.setText(Logicat.pregunta);
            
                socketb.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
