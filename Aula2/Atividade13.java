/**
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 13 de Programas e Soluções Computacionais
 */
import javax.swing.JOptionPane;

public class atividade13 {
    public static void main(String[] args){
        double nota1, nota2, nota3, media;
        double pesoTL = 2.00, pesoAS = 3.00, pesoEF = 5.00;
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Bem vindo a calculadora da média de sua nota!");
        JOptionPane.showMessageDialog(null,"Digite um valor entre 0 e 100. OBS: Não use '.' ou ','.");
       
        //Insere o valor das notas na disciplina.
        nota1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a nota 01:"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a nota 02:"));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a nota 03:"));
        
        //Verifica se o usuário digitou as notas corretamente para evitar estouros ou média negativa.
        if(nota1 < 0 || nota2 < 0 || nota3 < 0)
        {
            JOptionPane.showMessageDialog(null,"Você digitou uma das médias abaixo de 0, tente novamente!");
            return;
        }
        else  if(nota1 > 100 || nota2 > 100 || nota3 > 100)
        {
            JOptionPane.showMessageDialog(null,"Você digitou uma das médias acima de 100, tente novamente!");
            return;
        }
        
        //Atribui o peso as notas de cada atividade
        nota1 = ((nota1/100)*pesoTL);
        nota2 = ((nota2/100)*pesoAS);
        nota3 = ((nota3/100)*pesoEF);
        
        //Soma os pesos para calcular a média final
        media = nota1+nota2+nota3;
        
        //Exibe a mensagem da media
        JOptionPane.showMessageDialog(null,"Você ficou com uma média semestral de:"+media);
    }
}
