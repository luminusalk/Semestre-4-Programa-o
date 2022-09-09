/*
 *
 * @author Pedro Henrique Torres de Alencar
 * Atividade 3 - Aula 3
 * Ler uma quantidade n de números, dizer a média aritmética e a quantidade
 * + % de números positivos e negativos.
 */
import javax.swing.JOptionPane;

public class Atividade03 {
    public static void main(String args[]) {
        int Negativos = 0, Neutros = 0, Positivos = 0, Qnt = 0, i = 0;
        Double Media = 0.0, Pn = 0.0, Pp = 0.0, Vx = 0.0;
        
        //Exibe as mensagens iniciais com instruções
        JOptionPane.showMessageDialog(null,"Olá, Irei ler uma quantidade n de números, dizer a média aritmética e a quantidade " +
        "+ % de números positivos e negativos.");
           
        Qnt = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de entradas que serão lidas: (Entre 0 e 100)."));
        
        //Evita estouros
        if (Qnt < 0 || Qnt > 100)
        {
            JOptionPane.showMessageDialog(null,"Você digitou uma entrada não permitida!");
            return;
        }
        //Calcula
        while(i < Qnt)
        {
            i++;
            Vx = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o "+i+"º número:"));
            
            if (Vx < 0.0)
            {
                Negativos += 1;
            }
            else if (Vx > 0.0)
            {
                Positivos += 1;
            }
            else
            {
                Neutros += 1;
            }
            Media = Media + Vx;
        }
        Media = Media/i;
        Pn = (double)(Negativos * 100)/i;
        Pp = (double)(Positivos * 100)/i;
        
        //Exibe a mensagem com as alturas:
        JOptionPane.showMessageDialog(null,"A média aritmética é: "+Media+", "
                + "sendo quê li: "+Neutros+" entradas neutras, "
                + ""+Negativos+" entradas negativas "
                + "e: "+Positivos+" positivas, totalizando em: "+Pn+"% Negativos e "
                + ""+Pp+"% Positivos! Numeros lidos totais: "+i+".");
    }
}