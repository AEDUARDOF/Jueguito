package Clases;

import Interfaz.Nombre;

public class Controlador {
    
    public static boolean jugadora = false;
    public static boolean jugadorb = false;
    public static boolean partida = false;
    public static int jugadorlocal;
    
    public static void AsignarJugador(){
        if(!jugadora){
            
            jugadora = true;
            Logican.nombre = Nombre.nombre.getText();
            Logican.EstablecerNombres();
            jugadorlocal = 1;
            Logican.EnviarNombre();
            
        }else{
            
            jugadorb = true;
            Logican.nombre = Nombre.nombre.getText();
            Logican.EstablecerNombres();
            jugadorlocal = 2;
            Logican.EnviarNombre();
            
        }
    }
    
    public static void AsignarTablero(){
        if(jugadorlocal == 1){
            Runnable turn = new Turno();
            Thread turno = new Thread(turn);
            turno.start();
            Runnable comunicacio = new Comunicacion();
            Thread comunicacion = new Thread(comunicacio);
            comunicacion.start();
        }else if(jugadorlocal == 2){
            Runnable comunicacioc = new Comunicacionc();
            Thread comunicacionc = new Thread(comunicacioc);
            comunicacionc.start();
            Principal.tableroc.setVisible(true);
        }
    }
    
    public static void CambiarTablero(){
        if(jugadorlocal == 1){
            Principal.tablerob.setVisible(true);
            Principal.tablero.setVisible(false);
            Runnable comunicaciob = new Comunicacionb();
            Thread comunicacionb = new Thread(comunicaciob);
            comunicacionb.start();
        }else if(jugadorlocal == 2){
            Runnable turnb = new Turnob();
            Thread turnob = new Thread(turnb);
            turnob.start();
            
            Runnable comunicaciod = new Comunicaciond();
            Thread comunicaciond = new Thread(comunicaciod);
            comunicaciond.start();
        }
    }
    
    public static void CambiarPartida(){
        if(partida){
            Principal.tablerod.setVisible(true);
            Principal.tableroc.setVisible(false);
        }
        }
    
}
