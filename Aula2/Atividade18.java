/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 18 de Programas e Soluções Computacionais
 * Ler um valor em real e a cotação do dolar, em seguida exibir o valor correspondente em doláres
 */
import javax.swing.JOptionPane;

public class Atividade18 {
    public static void main(String[] args){
        double valorreal, valordolar, cotacao;
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Irei ler o valor em reais, a cotação do dolar e te direi quantos dolares equivalem o valor em reais!");
        
        //Insere o valor em Reais
        valorreal = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor em Reais R$ exemplo: 10.50"));
       
        //Insere o valor da cotação do Dólar
        cotacao = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da cotação do dólar $ exemplo: 2.75"));
        
        //Proteção para não houver estouros
        if(valorreal < 0 || cotacao < 0)
        {
            JOptionPane.showMessageDialog(null,"Digite um valor maior que zero!");
            return;
        }
        
        //Calcula em cima da cotação
        valordolar = ((valorreal/cotacao));
        
        //Evita estouros
        if(valordolar < 0)
            valordolar = valordolar*(-1);
        
        //Exibe a mensagem do valor equivalente em Dólares dos Reais
        JOptionPane.showMessageDialog(null,"O valor em doláres é de: "+valordolar+" $.");
    }
}
