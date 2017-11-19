import projetovr.CalculoVR;
import org.junit.Test;
import static org.junit.Assert.*;

 

public class CalculoVRTeste {

  @Test

  public void testarValorPagoDeVRPorDia() {

    CalculoVR calc = new CalculoVR();

    assertEquals(23.0, calc.valorPago(1), 0.01);
    //Testar desconto de 10%
    assertEquals(2.3, calc.valorDesconto(23.0), 0.01);
    
    //Testar entradas de dias válida.
    assertTrue(calc.diasValidos(1) && calc.diasValidos(31));
    //Testar entradas de dias inválida.
    assertFalse(calc.diasValidos(0) && calc.diasValidos(32));
  }

}