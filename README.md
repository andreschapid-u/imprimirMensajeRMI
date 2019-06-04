# imprimirMensajeRMI

## Pasos a seguir 

### 1. Crear la estructura de directorios
>   -   sop_rmi
>   -   servidor
>   -   cliente

### 2. Crear la interface y su implementacion en el directorio **sop_rmi**
>   Crear la interface **XxxxInt.java**  que extiende de **java.rmi.Remote** y la calse que la implementa **XxxxImpl.java** que extiende de **java.rmi.server.UnicastRemoteObject** e implementa **XxxxInt.java**
>   -   sop_rmi
>       -   Xxxx**Imp.java**
>       -   Xxxx**Int.java**
>   
>   Tener en cuenta que todos los metodos de la interfaz deven tener **throws RemoteException**
### 3. Compilar los soportes >> **sop_rmi**
>   En el directorio **src** del proyecto ejecutar
>   -   **javac -d ../bin sop_rmi/*.java**
>       
>    Esto va a generar los binarios de los fuentes que estan en **sop_rmi**

### 4. Generar el **Stub** y el **Skel**
>   En la carpeta bin ejecutar el siguiente comando:
>   -   **rmic -vcompat sop_rmi.XxxxImp**
>
>    Esto va a generar el **Stub** y el **Skel** a partir de **XxxxImp**

### 5. Implementar el **Servidor.java** en la carpeta **src/servidor**
>   -   En el **main** se debe instanciar a **XxxxImp** y registrarlos.
>       -   XxxxImp obj = new XxxxImp();
>        -   Naming.rebind("rmi://url:puerto/nombreApp", obj);

### 6. Implementar el **Cliente.java** en la carpeta **src/cliente**
>   -   En el **main** se debe obtener la referencia de  **XxxxImp**.
>       -    XxxxInt obj = (XxxxInt) Naming.lookup("rmi://url:puerto/nombreApp");
>   - Llamamos al metodo remoto asi:
>       -   obj.metodoRemoto([parametros]);   

### 7.Compilar los fuentes de servidor y cliente desde **src**
>   -   Para el servidor:
>       -   **javac -d ../bin servidor/*.java**
>   -   Para el cliente:
>       -   **javac -d ../bin cliente/*.java**

### 8.Lanzamos el N_S
>   -   Ubicados en bin. Por defecto el puerto es 1099 si queremos lo podemos modificar, es opcional
>       -   rmiregistry [puerto]
### 9.Lanzamos el Servidor
>   -   Ubicados en bin. Debemos pasar el url den N_S y el puerto
>       -   java servidor.Servidor localhost 1090
### 10.Lanzamos el Cliente
>   -   Ubicados en bin. Debemos pasar el url den N_S y el puerto
>       -   java cliente.Cliente localhost 1090
