
package Clases;

import Interfaz.*;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Comunicaciond implements Runnable{
    public static Socket socket;
    public static Socket socketb;
    public static ServerSocket servidor;
    public static ServerSocket servidorb;
    
    public static void EnviarRespuesta(){
        
        try {
            socket = new Socket("192.168.1.64", 25565);
            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
            salida.writeInt(LogicaJugadorb.contador);
            salida.writeUTF(Logicatd.respuesta);
            salida.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            
            servidor = new ServerSocket(25600);
            while(true){
                
                socketb = servidor.accept();
                DataInputStream entrada = new DataInputStream(socketb.getInputStream());
                Logicatd.pregunta = entrada.readUTF();
                Tablerod.pregunta.setText(Logicatd.pregunta);
            
                socketb.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
