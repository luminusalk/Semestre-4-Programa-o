/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 2 - Aula 3
 * Verificar x entradas de alturas e informar a menor e a maior do grupo
 */
import javax.swing.JOptionPane;

public class Atividade02 {
    public static void main(String args[]) {
        int qnt, i = 0;
        double x = 0,y = 0,z = 0;
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Olá, posso analisar as alturas das pessoas e informar a menor e a maior do grupo.");
        
        qnt = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de alturas que você deseja analisar:"));

        //insira a quantidade de alturas que será calculada (valor de qnt);
        while(i < qnt)
        {
            y = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a altura Nº: "+(i+1)+" exemplo (1.50)."));
            
            if (y < 0)
            {
                JOptionPane.showMessageDialog(null,"Você digitou uma altura negativa e que não existe! Preciso interromper!");
                return;
            }
            
            if (x == 0 && z == 0)
            {
                x = z = y;
            }
            else
            {
                if (y < x)
                {
                    x = y;
                }
                else if (y > z)
                {
                    z = y;
                }
            }
            i++;
        }
        
        //Exibe a mensagem com as alturas:
        JOptionPane.showMessageDialog(null,"A menor altura foi: "+x+" e a maior "+z+"!");
    }
}
