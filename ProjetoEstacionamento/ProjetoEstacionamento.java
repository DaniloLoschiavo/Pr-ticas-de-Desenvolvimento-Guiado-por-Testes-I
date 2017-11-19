package projetoestacionamento;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Foi solicitado um cálculo para o valor que deve ser pago pelo estacionamento, dadas as seguintes regras:
 * a) A primeira hora custa R$5,00.
 * b) A partir da segunda hora, é cobrado R$3,00 por hora a mais.
 * c) A diária custa R$20,00.
 * d) Os mensalistas têm um desconto de 40% no estacionamento.
 * 
 * Antes de começar a escrever o código do programa, responda: 
 * “Quais testes esse programa deveria ter?” e anote suas respostas para poder começar a implementar.
 * 
 * Agora, crie uma aplicação Java que implemente as funcionalidades solicitadas 
 * seguindo as boas práticas do desenvolvimento guiado por testes.
 *
 * @author Danilo Loschiavo
 */
public class ProjetoEstacionamento {

    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o total de horas utilizadas no estacionamento: ");
        int horas = entrada.nextInt();
        System.out.println("Digite '1' se é mensalista: ");
        boolean mensalista = entrada.nextInt() == 1;
        
        
        System.out.println("O total é: " + NumberFormat.getCurrencyInstance().format(estacionamento.calcularValor(horas, mensalista)));
        
    }
    
}
