package sop_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * MensajeInt
 */
public interface MensajeInt extends Remote {
    public String mensaje(String nombre) throws RemoteException;
    
}