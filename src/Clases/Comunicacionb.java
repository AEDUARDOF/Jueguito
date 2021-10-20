
package Clases;

import Interfaz.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;

public class Comunicacionb implements Runnable{
    public static Socket socket;
    public static Socket socketb;
    public static ServerSocket servidor;
    public static ServerSocket servidorb;
    
    public static void EnviarPregunta(){
        
        try {
            socket = new Socket("192.168.1.64", 25600);
            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
            Logicatb.pregunta = Tablerob.pregunta.getText();
            salida.writeUTF(Logicatb.pregunta);
            salida.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    @Override
    public void run() {
        try {
            
            servidor = new ServerSocket(25565);
            while(true){
                
                socketb = servidor.accept();
                DataInputStream entrada = new DataInputStream(socketb.getInputStream());
                LogicaJugadorb.contador = entrada.readInt();
                if(LogicaJugadorb.contador == 4){
                    
                    Runnable resultado = new Logicar();
                    Thread resultados = new Thread(resultado);
                    resultados.start();
                    Logicar.EnviarResultados();
                    Principal.resultados.setVisible(true);
                    Principal.tablerob.setVisible(false);
                }
                Logicatb.respuesta = entrada.readUTF();
                Tablerob.respuesta.setText(Logicatb.respuesta);
            
                socketb.close();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
