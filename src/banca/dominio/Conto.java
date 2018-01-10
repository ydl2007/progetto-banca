package banca.dominio;

public class Conto {
    
    private double saldo;
    
    public Conto(double saldo_iniziale){
        saldo=saldo_iniziale;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public boolean deposita(double cifra){
        saldo=saldo+cifra;
        System.out.println("Deposito " + cifra);
        return true;
    }
    public boolean preleva(double cifra){
        saldo=saldo-cifra;
        System.out.println("Prelievo " + cifra);
        return true;
    }
}
