import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Endereco extends UnicastRemoteObject implements EnderecoIF {
    private String rua;
    private int numero;

    public Endereco(String rua, int numero) throws RemoteException{
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() throws RemoteException{
        return rua;
    }

    public void setRua(String rua) throws RemoteException{
        this.rua = rua;
    }

    public int getNumero() throws RemoteException{
        return numero;
    }

    public void setNumero(int numero) throws RemoteException{
        this.numero = numero;
    }
    
}