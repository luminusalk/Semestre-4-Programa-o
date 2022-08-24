/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 20 de Programas e Soluções Computacionais
 * Switch case para informar os dias da semana de acordo com o número digitado de 1 a 7
 */
import javax.swing.JOptionPane;

public class Atividade20 {
    public static void main(String[] args){
        int dia;
        String[] semana = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Irei ler o número e te dizer o dia da semana equivalente!");
        
        //Insere o valor em Reais
        dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor do número entre 1 a 7:"));
        
        //Proteção para não houver estouros
        if(dia < 0 || dia > 6)
        {
            JOptionPane.showMessageDialog(null,"Digite um valor válido!");
            return;
        }
        
        //Exibe o dia da semana
        switch(dia)
        {
            case 0:
                JOptionPane.showMessageDialog(null,"O número digitado corresponde a: "+semana[0]+".");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"O número digitado corresponde a: "+semana[1]+".");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"O número digitado corresponde a: "+semana[2]+".");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"O número digitado corresponde a: "+semana[3]+".");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"O número digitado corresponde a: "+semana[4]+".");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"O número digitado corresponde a: "+semana[5]+".");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"O número digitado corresponde a: "+semana[6]+".");
                break;
            default:
                break;
        }
    }
}
