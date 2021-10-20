
package Clases;

import Interfaz.*;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Logicar implements Runnable{
    
    public static int contador = 0;
    public static Socket socket;
    public static Socket socketb;
    public static ServerSocket servidor;
    public static ServerSocket servidorb;
    
    public static void EnviarResultados(){
        if(Controlador.jugadorlocal == 1){
        
            try {
                socket = new Socket("192.168.1.64", 9000);
                DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
                salida.writeBoolean(Logicajugador.respuestasc[0]);
                salida.writeBoolean(Logicajugador.respuestasc[1]);
                salida.writeBoolean(Logicajugador.respuestasc[2]);
                salida.writeBoolean(Logicajugador.respuestasc[3]);
                salida.writeBoolean(Logicajugador.respuestasc[4]);
                salida.close();
            
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        
        }else if(Controlador.jugadorlocal == 2){
        
            try {
                socket = new Socket("192.168.1.64", 3999);
                DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
                salida.writeBoolean(LogicaJugadorb.respuestasc[0]);
                salida.writeBoolean(LogicaJugadorb.respuestasc[1]);
                salida.writeBoolean(LogicaJugadorb.respuestasc[2]);
                salida.writeBoolean(LogicaJugadorb.respuestasc[3]);
                salida.writeBoolean(LogicaJugadorb.respuestasc[4]);
                salida.close();
            
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
        
    }
    
    
    public static void CrearTPersonaje(){
        Resultados.palabra.setText(Logicat.Tpersonaje[0]);
        Resultados.palabrab.setText(Logicat.Tpersonaje[1]);
        Resultados.palabrac.setText(Logicat.Tpersonaje[2]);
        Resultados.palabrad.setText(Logicat.Tpersonaje[3]);
        Resultados.palabrae.setText(Logicat.Tpersonaje[4]);
        Resultados.palabraB.setText(Logicatd.Tpersonaje[0]);
        Resultados.palabraBb.setText(Logicatd.Tpersonaje[1]);
        Resultados.palabraBc.setText(Logicatd.Tpersonaje[2]);
        Resultados.palabraBd.setText(Logicatd.Tpersonaje[3]);
        Resultados.palabraBe.setText(Logicatd.Tpersonaje[4]);
    }
    
    public static void AsignarValor(){
        if(LogicaJugadorb.respuestasc[0]){
            Resultados.palabra.setForeground(Color.decode("#2DDE98"));
        }else{
            Resultados.palabra.setForeground(Color.decode("#ED1C24"));
        }
        if(LogicaJugadorb.respuestasc[1]){
            Resultados.palabrab.setForeground(Color.decode("#2DDE98"));
        }else{
            Resultados.palabrab.setForeground(Color.decode("#ED1C24"));
        }
        if(LogicaJugadorb.respuestasc[2]){
            Resultados.palabrac.setForeground(Color.decode("#2DDE98"));
        }else{
            Resultados.palabrac.setForeground(Color.decode("#ED1C24"));
        }
        if(LogicaJugadorb.respuestasc[3]){
            Resultados.palabrad.setForeground(Color.decode("#2DDE98"));
        }else{
            Resultados.palabrad.setForeground(Color.decode("#ED1C24"));
        }
        if(LogicaJugadorb.respuestasc[4]){
            Resultados.palabrae.setForeground(Color.decode("#2DDE98"));
        }else{
            Resultados.palabrae.setForeground(Color.decode("#ED1C24"));
        }
        if(Logicajugador.respuestasc[0]){
            Resultados.palabraB.setForeground(Color.decode("#2DDE98"));
        }else{
            Resultados.palabraB.setForeground(Color.decode("#ED1C24"));
        }
        if(Logicajugador.respuestasc[1]){
            Resultados.palabraBb.setForeground(Color.decode("#2DDE98"));
        }else{
            Resultados.palabraBb.setForeground(Color.decode("#ED1C24"));
        }
        if(Logicajugador.respuestasc[2]){
            Resultados.palabraBc.setForeground(Color.decode("#2DDE98"));
        }else{
            Resultados.palabraBc.setForeground(Color.decode("#ED1C24"));
        }
        if(Logicajugador.respuestasc[3]){
            Resultados.palabraBd.setForeground(Color.decode("#2DDE98"));
        }else{
            Resultados.palabraBd.setForeground(Color.decode("#ED1C24"));
        }
        if(Logicajugador.respuestasc[4]){
            Resultados.palabraBe.setForeground(Color.decode("#2DDE98"));
        }else{
            Resultados.palabraBe.setForeground(Color.decode("#ED1C24"));
        }
    }

    @Override
    public void run() {
        
        if(Controlador.jugadorlocal == 1){
            try {
            
                servidor = new ServerSocket(3999);
                while(true){
                
                    socketb = servidor.accept();
                    DataInputStream entrada = new DataInputStream(socketb.getInputStream());
                    LogicaJugadorb.respuestasc[0] = entrada.readBoolean();
                    LogicaJugadorb.respuestasc[1] = entrada.readBoolean();
                    LogicaJugadorb.respuestasc[2] = entrada.readBoolean();
                    LogicaJugadorb.respuestasc[3] = entrada.readBoolean();
                    LogicaJugadorb.respuestasc[4] = entrada.readBoolean();
                
                    AsignarValor();
            
                    socketb.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }else if(Controlador.jugadorlocal == 2){
            try {
            
                servidor = new ServerSocket(9000);
                while(true){
                
                    socketb = servidor.accept();
                    DataInputStream entrada = new DataInputStream(socketb.getInputStream());
                    Logicajugador.respuestasc[0] = entrada.readBoolean();
                    Logicajugador.respuestasc[1] = entrada.readBoolean();
                    Logicajugador.respuestasc[2] = entrada.readBoolean();
                    Logicajugador.respuestasc[3] = entrada.readBoolean();
                    Logicajugador.respuestasc[4] = entrada.readBoolean();
                
                    AsignarValor();
            
                    socketb.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }
    
}
