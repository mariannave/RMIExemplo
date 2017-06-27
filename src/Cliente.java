import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Cliente extends UnicastRemoteObject implements ClienteIF{
    private String cpf;
    private String nome;
    private Endereco endereco;

    public EnderecoIF getEndereco() throws RemoteException{
        return endereco;
    }

    public Cliente(String cpf, String nome, Endereco endereco) throws RemoteException{
        this.cpf = cpf;
        this.nome = nome;
        this.endereco=endereco;
    }

    public String getCpf() throws RemoteException{
        return cpf;
    }
    public String getNome() throws RemoteException{
        return nome;
    }

    public void setNome(String nome) throws RemoteException{
        this.nome = nome;
    }
}