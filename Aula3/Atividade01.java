/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 1 - Aula 3
 * Efetuar a soma de todos os números ímpares que são multiplos de 3, de 1 até 500
 */
import javax.swing.JOptionPane;

public class Atividade01 {
    public static void main(String args[]) {
        int i = 0, x = 0, conjunto = 500;
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Olá, irei calcular a soma de todos os números múltiplos de 3, no conjunto de 1 a 500.");
        
        //Calcula
        do
        {
            if (i%3 == 0)
                x = x + i;
            i++;
        }
        while(i < conjunto);
        
        //Exibe a mensagem com as alturas:
        JOptionPane.showMessageDialog(null,"A soma de todos os números múltiplos de 3 entre 1 e 500 é:"+x);
    }
}