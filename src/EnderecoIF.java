import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EnderecoIF extends Remote{
    public String getRua() throws RemoteException;

    public void setRua(String rua)throws RemoteException;

    public int getNumero()throws RemoteException;

    public void setNumero(int numero)throws RemoteException;
}