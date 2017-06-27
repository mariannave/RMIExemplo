import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClienteIF extends Remote{
    public String getCpf() throws RemoteException;
    public String getNome()throws RemoteException;
    public void setNome(String nome)throws RemoteException;
    public EnderecoIF getEndereco() throws RemoteException;
}