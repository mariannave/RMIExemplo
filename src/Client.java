import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Professor
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ClienteIF c = (ClienteIF) Naming.lookup("rmi://localhost/cliente");
         
            
            
            
            
            System.out.println("CPF:"+c.getCpf()+" Nome: "+c.getNome());
            
            System.out.println("Rua:"+c.getEndereco().getRua());
            
            //c.getEndereco().setRua("Epitacio");
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}