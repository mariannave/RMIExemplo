import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	 public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		 Endereco endereco = new Endereco("Rua das flores", 110);
		 Cliente cliente = new Cliente("0902222", "Marianna", endereco);
		 
		 LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
		 Naming.bind("cliente", cliente);
	 }
}
