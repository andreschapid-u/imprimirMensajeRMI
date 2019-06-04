package sop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * MensajeImp
 */
public class MensajeImp extends UnicastRemoteObject implements MensajeInt {

    public MensajeImp() throws RemoteException {
        super();
    }
    
    @Override
    public String mensaje(String nombre) throws RemoteException {
        return "Hola "+nombre+" saludos desde el servidor.";
    }

     
}