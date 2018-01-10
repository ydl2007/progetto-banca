package banca.dominio;


public class LibrettoRisparmio extends Conto {
    
    private double tassoInteresse;
    
    public LibrettoRisparmio (double saldo, double tasso){
        super(saldo);
        tassoInteresse=tasso;
    }
}
