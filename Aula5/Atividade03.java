/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 1 - Aula 5
 * Array recebe o nome e sexo das pessoas, a seguir o usuário fornece o sexo das pessoas que
 * devem aparecer na tela.
 */
import javax.swing.JOptionPane;

public class Atividade03 {
    public static void main(String args[]) {
        int qnt, sexo, input, i;
        String entr;
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Olá, irei lhe ajudar com as entradas das pessoas e os seus respectivos sexos:");
        
        //Quantidade de entradas que o programa irá sustentar
        qnt = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de nomes que serão lidos:  (Valores entre 1 e 20)"));
         
        //Evita estouros
        if (qnt <= 0 || qnt > 20)
        {
            JOptionPane.showMessageDialog(null,"Você digitou um valor não permitido!");
            return;
        }
        
        //Criação do array que irá armazenar os nomes
        String[][] nomes = new String[qnt][2];
        
        //Armazena as strings no array
        for(i = 0; i < nomes.length; i++)
        {
            entr = JOptionPane.showInputDialog(null,"Digite o "+(i+1)+" nome:");
            sexo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 0 para masculino e 1 para feminino (qualquer outro valor será lido como 0)."));
            
            if(sexo < 0 || sexo > 1)
            {
                sexo = 0;
            }
            
            nomes[i][sexo] = entr;
        }
        
        //Escolher os nomes pelo sexo
        input = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual lista você deseja exibir? 0 - Sexo Masculino, 1 - Sexo Feminino. (qualquer outro valor será lido com 0)."));
        
        //Imprimir com JOptionPane
        for (i = 0; i < nomes.length; i++)
        {
            //Exibe a mensagem com os nomes sorteados!
            if(input == 0)
            {
                if(nomes[i][input] != null)
                    JOptionPane.showMessageDialog(null,"Do sexo masculino temos: "+nomes[i][input]);
            }
            else
            {
                if(nomes[i][input] != null)
                    JOptionPane.showMessageDialog(null,"Do sexo feminino temos: "+nomes[i][input]);
            }
        }
        
        //Imprimir com System.Out.Println
//        for (i = 0; i < nomes.length; i++)
//        {
//            //Exibe a mensagem com os nomes sorteados!
//            if(input == 0)
//            {
//                if(nomes[i][input] != null)
//                    System.out.println("Do sexo masculino temos: "+nomes[i][input]);
//            }
//            else
//            {
//                if(nomes[i][input] != null)
//                    System.out.println("Do sexo feminino temos: "+nomes[i][input]);
//            }
//        }
    }
}