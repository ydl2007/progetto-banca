package banca.dominio;

import java.lang.Math;


public class ContoCorrente extends Conto {
    
    private double scoperto;
    private double saldo_negativo;
    
    
    public ContoCorrente (double saldo){
       super(saldo); 
    }
    
    public ContoCorrente (double saldo, double scoperto){
        super(saldo);
        this.scoperto=scoperto;
    }
    
    
    public boolean preleva(double cifra){
        if(cifra<super.getSaldo()){
            super.preleva(cifra);
            return true;
        }
        else{
            if((super.getSaldo()-cifra>scoperto)){
                saldo_negativo=super.getSaldo()-cifra;
                return true;
            }
            else{
                return false;
            }
        }
    }
    public boolean deposita(double cifra){
        super.deposita(cifra-saldo_negativo);
        return true;
    }
    public double getSaldo(){
        return super.getSaldo()-saldo_negativo;
    }
}
