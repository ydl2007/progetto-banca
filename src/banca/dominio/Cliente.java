package banca.dominio;

public class Cliente {
    
    private String nome;
    private String cognome;
    private int numConti;
    private Conto[] conto = new Conto[5];
    
    public Cliente(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public Conto getConto(int i){
        return conto[i];
    }
    public void addConto(Conto conto){
        this.conto[numConti++] = conto;
    }
    public int getNumConti(){
        return numConti;
    }
    
}
