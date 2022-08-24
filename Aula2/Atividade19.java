/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 19 de Programas e Soluções Computacionais
 * Ler um número inteiro e exibir o seu sucessor e exibir antecessor
 */
import javax.swing.JOptionPane;

public class Atividade19 {
    public static void main(String[] args){
        int num, numsuc, numant;
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Irei ler o número e te dizer o antecessor e sucessor!");
        
        //Insere o valor em Reais
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor do número entre -100 a 100:"));
        
        //Proteção para não houver estouros
        if(num < -100 || num > 100)
        {
            JOptionPane.showMessageDialog(null,"Digite um valor entre -100 e 100");
            return;
        }
        
        //Exibe a mensagem do valor equivalente em Dólares dos Reais
        JOptionPane.showMessageDialog(null,"O valor do número é: "+num+" seu antecessor:"
                + " "+(num-1)+" e seu sucessor: "+(num+1)+".");
    }
}
