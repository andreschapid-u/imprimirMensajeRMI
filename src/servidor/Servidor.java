package servidor;

import java.rmi.Naming;

import sop_rmi.MensajeImp;

/**
 * Servidor
 */
public class Servidor {

    public static void main(String[] args) {
        try {
            MensajeImp obj = new MensajeImp();
            Naming.rebind("rmi://"+args[0]+":"+args[1]+"/mensaje", obj);
            System.out.println("Objeto Servidor registrado");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}