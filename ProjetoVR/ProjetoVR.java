package projetovr;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Exercício 1 - Dada a seguinte solicitação: 
 * "Foi acordado com o sindicato que a empresa deve fornecer vale refeição (VR) a todos os colaboradores, 
 * sendo que o valor diário do VR é de R$23,00 e que a empresa pode descontar da folha de pagamento do colaborador 
 * 10% do valor mensal fornecido de VR.”
 * 
 * Antes de começar a escrever o código do programa, responda: 
 * “Quais testes esse programa deveria ter?” e anote suas respostas para poder começar a implementar.
 * 
 * Agora, crie uma aplicação para calcular o valor que o colaborador irá receber por mês de VR 
 * e o valor que deve ser descontado da folha de pagamento do colaborador.
 *
 * @author Danilo Loschiavo
 */
public class ProjetoVR {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CalculoVR calculoVR = new CalculoVR();
        
        System.out.print("Insira a quantidade de dias trabalhados: ");
        int diasTrabalhados = entrada.nextInt();
        
        if(calculoVR.diasValidos(diasTrabalhados)){
            double valorPago = calculoVR.valorPago(diasTrabalhados);
            double valorDesconto = calculoVR.valorDesconto(valorPago);
            System.out.println("Valor a ser Pago: " + NumberFormat.getCurrencyInstance().format(valorPago));
            System.out.println("Valor a ser Descontado: " + NumberFormat.getCurrencyInstance().format(valorDesconto));
        }else{
            System.out.println("Quantidades de dias inválidos");
        }
        
    }           
}
