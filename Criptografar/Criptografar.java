package criptografar;

import java.util.Scanner;

/**
 * Crie uma aplicação Java para criptografar e descriptografar, usando a Cifra de César. 
 * Esta é uma forma simples de criptografia, que consiste em mover as letras do alfabeto.
 * 
 * @author Danilo Loschiavo
 */
public class Criptografar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Criptografar");
            System.out.println("2 - Descriptografar");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();

            System.out.println("Entre com o texto desejado: ");
            entrada = new Scanner(System.in);
            String txt = entrada.nextLine();

            System.out.println("Entre com o numero mágico: ");
            entrada = new Scanner(System.in);
            int numero = entrada.nextInt();

            System.out.println("Resultado:");
            switch(opcao){
                case 1:
                    System.out.println(CifraDeCesar.criptografar(txt, numero));
                    break;
                case 2:
                    System.out.println(CifraDeCesar.descriptografar(txt, numero));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            System.out.println("------------------------------------------------------------");
        }while(opcao != 0);
    }
    
}