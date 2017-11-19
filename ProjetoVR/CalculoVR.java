package projetovr;

public class CalculoVR {

    public boolean diasValidos(int qtdDias){
        return qtdDias  > 0 && qtdDias <= 31;        
    }
    
    public double valorDesconto(double valorPago) {
        return valorPago * 0.1;
    }
    
    public double valorPago(int qtdDias) {
      return 23.0 * qtdDias;
    }
    
}