package Cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import Controlador.Ventana;
import Controlador.Ventana;

public class Cliente {

    public static void main(String[] args) {

        //Host del servidor
        final String HOST = "127.0.0.1";
        //Puerto del servidor
        final int PUERTO = 5000;
        Ventana ventana=new Ventana();

        try {
            ventana.setVisible(true);
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
