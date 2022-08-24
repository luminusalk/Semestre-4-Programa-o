/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 21 de Programas e Soluções Computacionais
 * Ler um ano e dizer se é bissexto
 */
import javax.swing.JOptionPane;

public class Atividade21 {
    public static void main(String[] args){
        double ano, x;
        int y;
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Irei ler um ano e dizer se é bissexto!");
        
        //Insere o valor em Reais
        ano = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o ano entre 0 a 10000:"));
        
        //Proteção para não houver estouros
        if(ano < 0 || ano > 10000)
        {
            JOptionPane.showMessageDialog(null,"Digite um valor entre 0 e 10000");
            return;
        }
        
        x = ano/4;
        y = (int)ano/4;
        
        if(x != y)
        {
            JOptionPane.showMessageDialog(null,"O ano: "+(int)ano+" não é bissexto!");
            return;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"O ano: "+(int)ano+" é bissexto!");
            return; 
        }
    }
}
