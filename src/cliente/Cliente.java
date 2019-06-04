package cliente;

import java.io.IOException;
import java.rmi.Naming;
import java.util.InputMismatchException;
import java.util.Scanner;

import sop_rmi.MensajeInt;

/**
 * Cliente
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            MensajeInt obj = (MensajeInt) Naming.lookup("rmi://" + args[0] + ":" + args[1] + "/mensaje");
            Scanner scanner = new Scanner(System.in);
            int opcion = 1;
            while (opcion != 0) {
                System.out.println("==========  MENU    =========");
                System.out.println("1. Probar mensahe");
                System.out.println("0. Salir");
                System.out.print("Ingrese una opcion: ");
                opcion = scanner.nextInt();
                switch (opcion) {
                case 1:
                    System.out.print("Ingrese un nombre: ");
                    String nombre = "";
                    scanner.nextLine();
                    nombre = scanner.nextLine();
                    System.out.println(obj.mensaje(nombre));
                    break;
                case 0:
                    System.out.println("Salir...");
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
                    break;
                }
            }

        }catch(InputMismatchException ime){
            System.err.println(ime);
        } catch (IOException ioException) {
            System.err.println(ioException);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}