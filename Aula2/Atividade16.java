/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 16 de Programas e Soluções Computacionais
 * Exibir a ordem crescente dos números, inserindo 3 em ordem crescente e um 4 que não siga a regra
 */
import javax.swing.JOptionPane;

public class Atividade16 {
    public static void main(String[] args){
        int i,j,k;
        int num[] = new int[4];
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Vou lhe dar a ordem crescente dos números!");
        JOptionPane.showMessageDialog(null,"Digite 3 valores entre 0 a 100. Em ordem crescente!");
       
        for(i = 0; i < num.length; i++)
        {
            //Insere o valor das notas na disciplina.
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a "+(i+1)+"º entrada:"));
            
            //Verifica se o usuário digitou os valores corretamente para evitar estouros ou média negativa.
            if(num[i] < 0 || num[i] > 100)
            {
                JOptionPane.showMessageDialog(null,"Você digitou um número inválido, tente novamente!");
                return;
            }
            
            //Verifica a ordem crescente dos 3 primeiros digitos
            if(i != 3 && i != 0 && num[i] < num[i-1])
            {
                JOptionPane.showMessageDialog(null,"Você digitou uma sequência que não respeita a ordem crescente!");
                return;
            }
        }
        
        //Reordena os números em ordem crescente
        for(i = 0; i < num.length; i++)
        {
            for(j = 0; j < num.length; j++)
            {
                if(num[i] < num[j])
                {
                    k = num[i];
                    num[i] = num[j];
                    num[j] = k;
                }
            }
        }
        
        //Exibe a mensagem com a ordem crescente dos números
        JOptionPane.showMessageDialog(null,"A ordem crescente dos números é "+num[0]+" "+num[1]+" "+num[2]+" "+num[3]+"");
    }
}
