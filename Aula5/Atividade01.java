/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 1 - Aula 5
 * Elabore uma classe que recebe dez nomes de pessoas, armazene esses nomes em um array de dez elementos,
 * sorteie um ganhador e imprima o seu nome em tela.
 */
import javax.swing.JOptionPane;
import java.util.Random;

public class Atividade01 {
    public static void main(String args[]) {
        int qnt, i;
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Olá, adicione alguns nomes em uma lista para que eu possa sorteia-los!");
        
        //Quantidade de entradas que o programa irá sustentar
        qnt = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de nomes que serão lidos:  (Valores entre 1 e 20)"));
         
        //Evita estouros
        if (qnt <= 0 || qnt > 20)
        {
            JOptionPane.showMessageDialog(null,"Você digitou um valor não permitido!");
            return;
        }
        
        //String[] nomes = {"Pedro", "Guilherme", "Thiago", "João", "Italo", "Lauro", "Jenyffer", "Gabriel", "Laiza", "Maria"};
        //Criação do array que irá armazenar os nomes
        String[] nomes = new String[qnt];
        
        //Armazena as strings no array
        for(i = 0; i < nomes.length; i++)
        {
            nomes[i] = JOptionPane.showInputDialog(null,"Digite o "+(i+1)+" nome:");
        }
        
        //Instância um objeto da classe Random usando o construtor básico
        Random rand = new Random();
        
        //Exibe a mensagem com o nome sorteado!
        JOptionPane.showMessageDialog(null,"O nome sorteado da minha lista! Foooi?! "+nomes[rand.nextInt(qnt)]);
    }
}