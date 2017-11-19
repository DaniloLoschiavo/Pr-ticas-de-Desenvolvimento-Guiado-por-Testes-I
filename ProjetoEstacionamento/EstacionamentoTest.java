import projetoestacionamento.Estacionamento;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * a) A primeira hora custa R$5,00.
 * b) A partir da segunda hora, é cobrado R$3,00 por hora a mais.
 * c) A diária custa R$20,00.
 * d) Os mensalistas têm um desconto de 40% no estacionamento.
 * 
 * @author Danilo Loschiavo
 */

public class EstacionamentoTest {

    @Test

    public void testarValorPagoNaPrimeiraHora() {
        Estacionamento est = new Estacionamento();

        //Testar com 1 hora
        assertEquals(5.0, est.calcularValor(1), 0.01);
        //Testar com 2 horas
        assertEquals(8.0, est.calcularValor(2), 0.01);
        //Testar diária
        assertEquals(20.0, est.calcularValor(24), 0.01);
        //Testar diária mais uma hora
        assertEquals(23.0, est.calcularValor(25), 0.01);
        //Testar 2 diárias
        assertEquals(40.0, est.calcularValor(48), 0.01);
        //Testar 2 diárias mais uma hora
        assertEquals(43.0, est.calcularValor(49), 0.01);
        //Testar mensalista com desconto
        assertEquals(8.0, est.calcularValor(24, true), 0.01);
    }
}