
package Clases;

import Interfaz.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;

public class Comunicacionc implements Runnable{
    public static Socket socket;
    public static Socket socketb;
    public static ServerSocket servidor;
    public static ServerSocket servidorb;
    
    public static void EnviarPregunta(){
        
        try {
            socket = new Socket("192.168.1.64", 47678);
            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
            Logicatc.pregunta = Tableroc.pregunta.getText();
            salida.writeUTF(Logicatc.pregunta);
            salida.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    @Override
    public void run() {
        try {
            
            servidor = new ServerSocket(8080);
            while(true){
                
                socketb = servidor.accept();
                DataInputStream entrada = new DataInputStream(socketb.getInputStream());
                Logicajugador.contador = entrada.readInt();
                if(Logicajugador.contador == 4){
                    Controlador.CambiarTablero();
                }
                Logicatc.respuesta = entrada.readUTF();
                Tableroc.respuesta.setText(Logicatc.respuesta);
            
                socketb.close();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
