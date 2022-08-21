/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 14 de Programas e Soluções Computacionais
 */
import javax.swing.JOptionPane;

public class atividade14 {
    public static void main(String[] args){
        int num1, num2, numfinal;
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Vou dizer qual número é o maior!");
        JOptionPane.showMessageDialog(null,"Digite valores entre 0 a 100.");
       
        //Insere o valor das notas na disciplina.
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o 1º número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o 2º número:"));
        
        //Verifica se o usuário digitou os valores corretamente para evitar estouros ou média negativa.
        if(num1 < 0 || num1 < 0 || num1 > 100 || num2 > 100)
        {
            JOptionPane.showMessageDialog(null,"Você digitou um número inválido, tente novamente!");
            return;
        }
        
        //Calcula o maior número
        numfinal = num1 >= num2 ? num1 : num2;
        
        //Exibe a mensagem com o maior número digitado
        JOptionPane.showMessageDialog(null,"O núméro de maior valor inserido é o: "+numfinal);
    }
}
