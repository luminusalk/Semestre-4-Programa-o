/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 2 - Aula 5
 * Gerar x números aleatórios inteiros quaisquer e os armazenar em um array. A seguir, peça para o
 * usuário digitar um número a ser pesquisado no array. Informar se o número existe ou não.
 */
import javax.swing.JOptionPane;
import java.util.Random;

public class Atividade02 {
    public static void main(String args[]) {
        int qnt, mize, intervalo, input, sort, i;
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Olá, irei sortear alguns números inteiros, será que você consegue acertar?!");
        
        //Quantidade de entradas que o programa irá sustentar
        qnt = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de números que deverão ser sorteados: (Valores entre 1 e 1000)"));
        
        //Evita estouros
        if (qnt <= 0 || qnt > 1000)
        {
            JOptionPane.showMessageDialog(null,"Você digitou um valor não permitido!");
            return;
        }
        
        //Intervalo dos números que serão sorteados
        intervalo = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma opção: "
                + "Valor 0: torna os números sorteados sem intervalos. "
                + "Valor 1: define o número com intervalos definidos. "
                + "Obs: Qualquer outro valor será definido automáticamente para 0."));
        
        //Definindo o Intervalo se intervalo for = 1
        if (intervalo == 1)
        {
            input = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o intervalo dos números: (Exemplo: se 500, irei sortear números entre -500 e 500."));
        }
        else
        {
            input = 0;
            intervalo = 0;
        }
        
        //Criação do array que irá armazenar os números
        int[] number = new int[qnt];
        
        //Instância um objeto da classe Random usando o construtor básico
        Random rand = new Random();
        
        //Armazena as strings no array
        for(i = 0; i < number.length; i++)
        {
            //Faz uma leitura randômica entre 0 e 1
            //Se mize for = 0 o número armazenado será negativo
            //Se mize for = 1 o número armazenado será positivo
            mize = rand.nextInt(2);
            
            if(mize == 0 && intervalo == 1)
                number[i] = (rand.nextInt(input+1) * -1);
            else if(mize == 1 && intervalo == 1)
                number[i] = rand.nextInt(input+1);
            else
                number[i] = rand.nextInt();
        }
        
        //Usuário digita um número para saber se está na lista
        sort = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número para saber se foi sorteado ou não:"));
        
        //Faz a checagem no array atrás do valor digitado pelo usuário
        for(i = 0; i < number.length; i++)
        {
            if(number[i] == sort)
            {
                //Exibe a mensagem com o número sorteado!
                JOptionPane.showMessageDialog(null,"O número "+sort+" foi sorteado! Parabéns!! Ele era o "+(i+1)+"º número da minha lista!");
                return;
            }
        }
        
        //Exibe a mensagem que não teve nome sorteado!
        JOptionPane.showMessageDialog(null,"Infelizmente não sorteei o número que você digitou!");
    }
}