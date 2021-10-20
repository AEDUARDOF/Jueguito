/*
    Alatorre Fuentes Edudardo
    De Jesus Pacheco Yahir
*/
package Clases;

import Interfaz.*;
import java.awt.Frame;
import java.awt.Toolkit;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    
    public static Inicial inicial = new Inicial();
    public static Nombre nombre = new Nombre();
    public static Instrucciones instrucciones = new Instrucciones();
    public static Tablero tablero = new Tablero();
    public static Tablerob tablerob = new Tablerob();
    public static Tableroc tableroc = new Tableroc();
    public static Tablerod tablerod = new Tablerod();
    public static Resultados resultados = new Resultados();
    
    public static Logicat logicat = new Logicat();
    public static Logicatb logicatb = new Logicatb();
    public static Logicatc logicatc = new Logicatc();
    public static Logicatd logicatd = new Logicatd();
    public static Logicajugador logicajugador = new Logicajugador();
    public static LogicaJugadorb logicajugadorb = new LogicaJugadorb();
    
    public static void main(String[] args) {
        
        inicial.setVisible(true);
        nombre.setVisible(false);
        instrucciones.setVisible(false);
        tablero.setVisible(false);
        tablerob.setVisible(false);
        tableroc.setVisible(false);
        tablerod.setVisible(false);
        resultados.setVisible(false);
        
    }
    
}