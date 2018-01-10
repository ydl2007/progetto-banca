package banca.dominio;

public class Banca {
    
    private static Banca istanza = new Banca();
    private static int MAX_CLIENTI=10;
    private int num_Clienti;
    private Cliente [] clienti = new Cliente[10];
    
    
    private Banca(){}
            
    
    public static Banca getBanca(){
        return istanza;
    }
    public void addCliente(String nome, String cognome){
        clienti[num_Clienti++]= new Cliente(nome,cognome);
    }
    public Cliente getCliente(int client_ind){
        return clienti[client_ind];
    }
    public int getNumClienti(){
        return num_Clienti;
    }
    
}