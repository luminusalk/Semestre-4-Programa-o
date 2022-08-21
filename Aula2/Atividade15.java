/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 15 de Programas e Soluções Computacionais
 * Exibir a ordem crescente dos números
 */
import javax.swing.JOptionPane;

public class Atividade15 {
    public static void main(String[] args){
        int i,j,k;
        int num[] = new int[3];
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Vou lhe dar a ordem crescente dos números!");
        JOptionPane.showMessageDialog(null,"Digite 3 valores entre 0 a 100.");
       
        for (i = 0; i < num.length; i++)
        {
            //Insere o valor das notas na disciplina.
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o "+(i+1)+"º valor:"));
            
            //Verifica se o usuário digitou os valores corretamente para evitar estouros ou média negativa.
            if(num[i] < 0 || num[i] > 100)
            {
                JOptionPane.showMessageDialog(null,"Você digitou um número inválido, tente novamente!");
                return;
            }
        }
        
        /*Reordena os números em ordem crescente
        *
        *Versão abaixo com operador ternário
         numfinal[0] = num[0] <= (num[1] | num[2]) ? num[0] : (num[1] <=  num[2] ? num[1] : num[2]);
         numfinal[2] = num[0] >= (num[1] | num[2]) ? num[0] : (num[1] >=  num[2] ? num[1] : num[2]);
         JOptionPane.showMessageDialog(null,"A ordem crescente dos números é "+numfinal[0]+" "+numfinal[1]+" "+numfinal[2]+"");
        *
        */
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
        JOptionPane.showMessageDialog(null,"A ordem crescente dos números é "+num[0]+" "+num[1]+" "+num[2]+"");
    }
}
