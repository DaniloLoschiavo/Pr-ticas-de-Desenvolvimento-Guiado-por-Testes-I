package projetoestacionamento;

/**
 *
 * @author Danilo Loschiavo
 */
public class Estacionamento {

    public double calcularValor(int horas) {
        double total = 0;
        if(horas <= 24){ // se menor de ou igual 24 horas
            for(int i = 1; i <= horas; i++){
                if(i == 1) // primeira hora
                    total += 5.0;
                else { // demais horas
                    total += 3.0;
                    if(total > 20) // se total maior que diaria
                        total = 20; //cobrar diaria
                }
            }
        }else {
            int diarias = horas / 24; //diarias completas
            total += diarias * 20; // cobra diarias
            if(horas % 24 != 0){// se possui horas restantes
                int horasRestantes = horas % 24; // calcula horas restantes
                for(int i = 1; i <= horasRestantes; i++) //soma demais horas
                    total += 3;
            }
        }
        return total;
    }

    public double calcularValor(int horas, boolean mensalista) {
        if(mensalista)
            return calcularValor(horas) * 0.4;
        else
            return calcularValor(horas);        
    }
    
}
