package criptografar;

/**
 * Dado um número n, vamos mover as letras no alfabeto, por exemplo:
 * 
 * Dadas as seguintes entradas: n = 3 e o texto = “rafael guimaraes sakurai”, 
 * aumente em 3 a sequência de cada caractere, assim a versão criptografada ficará “udidho jxlpdudhv vdnxudl”. 
 * Para descriptografar, basta diminuir em 3 cada caractere. 
 * Note que os espaços em branco no texto não foram alterados.
 * 
 * Dica: Todo caractere é representado por um número, sendo assim, é possível somar uma quantidade que se deseja 
 * aumentar em cada caractere, exemplo:
 * char letra = 'd';
 * É necessário fazer a conversão para “char” porque a soma da letra com o número 3, retorna um número do tipo int. 
 * char novaletra = (char) (letra + 3); 
 * System.out.println(letra + “ = ” + ((int) letra));
 * System.out.println(novaletra + “ = ” + ((int) novaletra));
 *
 * @author Danilo Loschiavo
 */
public class CifraDeCesar {

    public static String criptografar(String txt, int numero){
        return criptografia(txt, numero);
    }
    
    public static String descriptografar(String txt, int numero){
        return criptografia(txt, -numero);
    }
    
    private static String criptografia(String txt, int numero) {
        char[] txt_arr = txt.toCharArray();
        
        for(int i = 0; i < txt_arr.length; i++)
            if(txt_arr[i] != ' ')
                txt_arr[i] = (char)(txt_arr[i] + numero);
        
        return String.valueOf(txt_arr);
    }
}
